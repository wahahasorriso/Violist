package TestCases.Concat;
import LoggerLib.Logger;
class SingleLoop_Branch {
    public static void main(String[] args) {
	String a="a";
	String b="b";
	String c="c";
	String e="e";
	for(int i=0;i<3;i++)
	{
		long time=(int)(Math.random()*100); 
		if(time % 2 ==0)
		{
			a=a+"a";
		}
		else{
	   		a=a+"t";
		}
		c=a+c;
		Logger.reportString(c,"Concat.SingleLoop_Branch");
	}

	

    }
}

