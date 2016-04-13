#! /bin/bash
if [ $# -ne 1 ]
then
 echo "usage: instrumenter app"
 exit;
fi
rm -r tempfolder;
mkdir tempfolder;
apktool d -s $1 resource;
filename=${1%.apk}
./addpermission.pl resource/AndroidManifest.xml
mv TEMP resource/AndroidManifest.xml
mv resource tempfolder/resource;
cd tempfolder;
cp resource/classes.dex ./classes_backup.dex
mv resource/classes.dex ./classes.dex
dex2jar classes.dex 
rm classes.dex
mkdir bin
unzip  classes-dex2jar.jar -d bin
cp ../epp.jar ./bin
#mv bin classes
cd bin
java -jar epp.jar ../bin
cd ..
mv haos classes
mv ./bin/epp.jar ./classes; 
dx --dex --verbose --output=classes.dex classes
mv classes.dex resource;
apktool b resource temp.apk;
#keytool -genkey -alias wendy.keystore -keyalg RSA -validity 20000 -keystore wendy.keystore;
#apkbuilder temp.apk -v -u -z temptemp.apk -nf ../libs
jarsigner -sigalg SHA1withRSA -digestalg SHA1 -verbose -keystore ../wendy.keystore -storepass USCDING -signedjar ${filename}.instrumented.apk temp.apk wendy.keystore;
mv ${filename}.instrumented.apk ../Instrumented/
cd ..
zip -r -q ${filename}.zip tempfolder/
mv ${filename}.zip ./Instrumented/
rm -r tempfolder;
echo $filename
#rm -r tempfolder

jarsigner -sigalg SHA1withRSA -digestalg SHA1 -verbose -keystore ./wendy.keystore -storepass USCDING -signedjar a2z.Mobile.DevConnections.instrumented.apk temp.apk wendy.keystore;