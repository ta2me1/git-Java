/*

 System.out.println(); 输出 聪内存到控制台
 从键盘到内存 输入

 */


 public class keyInputTest
 {
	 public static void main (String[] args){
	 
	 java.util.Scanner s= new java.util.Scanner(System.in);//接收键盘输入


	 String userInputContent = s.next();//字符串的形式接受
	 //int num = s.nextInt();

	 System.out.println("you input" + userInputContent);
	 //System.out.println("you input number is " + num);
	 
	 
	 }
 }