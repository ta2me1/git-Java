package Switchleaning;

public class OperatorSwitchTest03 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("欢迎使用简易计算器");
		System.out.print("请输入第一个数字");
		int num1 = s.nextInt();
		System.out.print("请输入运算符");
		String c = s.next();
		System.out.print("请输入第二个数字");
		int num2 = s.nextInt();
		
		int result = 0;
		
		switch (c) 
		{
		/*
		 * 
		case "+" :
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "*" :
			System.out.println(num1 * num2);
			break;
		case "/":
			System.out.println(num1 / num2);
			break;
		case "%" :
			System.out.println(num1 % num2);
			break;
		default :
			System.out.println("输入有误");
		*/
		
		case "+":
			result = num1 + num2 ;
			break;
		
		}
		System.out.println("运算结果为 ：" + num1 + c + num2 + "=" + result);
		
	}

}
