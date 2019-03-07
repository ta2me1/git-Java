/*
 * Switch 语句：
 * 	1.选择结构
 */



package Switchleaning;

public class OperatorSwitchTest01 {

	public static void main (String[] args) {
	java.util.Scanner s = new java.util.Scanner(System.in);
	System.out.print ("请输入数字： ");
	int num = s.nextInt();
	
	switch(num) {
	case 1 :
		System.out.println("星期一");
		break;
	case 2 :
		System.out.println("星期二");
		break;
	case 3 :
		System.out.println("星期三");
		break;
	case 4 :
		System.out.println("星期四");
		break;
	case 5 :
		System.out.println("星期五");
		break;
	case 6 :
		System.out.println("星期六");
		break;
	case 7 :
		System.out.println("星期日");
		break;
	default :
		System.out.println("你输入的数字不合法");
		System.out.println("========================");
		}
	
	//case 穿透
	switch(num) {
	case 1 :
		System.out.println("星期一");
	case 2 :
		System.out.println("星期二");
	case 3 :
		System.out.println("星期三");
	case 4 :
		System.out.println("星期四");
	case 5 :
		System.out.println("星期五");
	case 6 :
		System.out.println("星期六");
	case 7 :
		System.out.println("星期日");
	default :
		System.out.println("你输入的数字不合法");
		System.out.println("========================");
		}
	
	
	switch(num) {
	case 1 : case 0 :
		System.out.println("星期一");
		break;
	case 2 :
		System.out.println("星期二");
		break;
	case 3 :
		System.out.println("星期三");
		break;
	case 4 :
		System.out.println("星期四");
		break;
	case 5 :
		System.out.println("星期五");
		break;
	case 6 :
		System.out.println("星期六");
		break;
	case 7 :
		System.out.println("星期日");
		break;
	default :
		System.out.println("你输入的数字不合法");
		System.out.println("========================");
		}
	
	}
}
