import LoggerLib.Logger;
class SimpleCode {
    public static void main(String[] args) {
	String a="a";
	String b="b";
	String c="c";
	String e="e";
		a+=a+"a";
		b+=a+b;
		c+=b+c;
		Logger.reportString(c,"SimpleCode");

    }
}
