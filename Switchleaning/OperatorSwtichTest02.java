package Switchleaning;

public class OperatorSwtichTest02 {
	public static void main (String[] args) {
	
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入星期几");
		String dayofweek = s.next();
		
		switch(dayofweek) {
			
			case "星期一":
				System.out.println(1);
				break;
			case "星期二":
				System.out.println(2);
				break;
			case "星期日":
				System.out.println(7);
				break;
			default :
				System.out.println("输入的东西不对");
			
			
		}
		
		
		
		
		
		
	}  

}
