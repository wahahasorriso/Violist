import LoggerLib.Logger;
class Replace {
    public static void main(String[] args) {
	String a="abbbba";
	String b="b";
	String c=a.replaceAll(b, "");
	Logger.reportString(c,"Replace");

    }
}
