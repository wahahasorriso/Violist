import LoggerLib.Logger;
class CircleLoop {
    public static void main(String[] args) {
	String a="a";
	String b="b";
	String c="c";
	String e="";
	for(int i=0;i<3;i++)
	{
		a+=a+c;
		b+=a+b;
		c+=b+c;
		Logger.reportString(c,"CircleLoop");
	}

    }
}
