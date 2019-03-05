/* 
[0-5]幼儿
[6-10]少儿
[11-18]青少年
[19-35]青年
[36-55]中年
[56-150]老年
*/



public class IfTest02
{
	public static void main(String[] args){
	
	java.util.Scanner s= new java.util.Scanner(System.in);

	System.out.print("Please input your age.");
	
	int age = s.nextInt();
	String label = "你处于老年阶段";
	if (age < 0 || age > 150){
		label = "不符合人类";
	}else if ( age < 5 )
	{label = "幼儿";
	}else if ( age < 10 )
	{label = "少儿";
	}else if ( age < 18 )
	{label = "青少年";
	}else if ( age < 35 )
	{label = "青年";
	}else if ( age < 55 )
	{label = "中年";
	}
	
	System.out.println(label);
	
	
	
	}
}