package TestCases.toUpperCase;
import LoggerLib.Logger;
class Branch_Interprocedural {
    public static String addA(String v)
	{
		return v.toUpperCase();
	}
    public static void main(String[] args) {
	String a="Aa";
	String b="Ab";
	String c="Ac";
	String e="Ae";
	long time=(int)(Math.random()*100); 
	if(time % 2 ==0)
	{
		a=addA(a);
	}
	else{
	   	a=addA(b);
	}

	Logger.reportString(a,"toUpperCase.Branch_Interprocedural");

    }
}


