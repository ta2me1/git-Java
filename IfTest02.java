/* 
[0-5]�׶�
[6-10]�ٶ�
[11-18]������
[19-35]����
[36-55]����
[56-150]����
*/



public class IfTest02
{
	public static void main(String[] args){
	
	java.util.Scanner s= new java.util.Scanner(System.in);

	System.out.print("Please input your age.");
	
	int age = s.nextInt();
	String label = "�㴦������׶�";
	if (age < 0 || age > 150){
		label = "����������";
	}else if ( age < 5 )
	{label = "�׶�";
	}else if ( age < 10 )
	{label = "�ٶ�";
	}else if ( age < 18 )
	{label = "������";
	}else if ( age < 35 )
	{label = "����";
	}else if ( age < 55 )
	{label = "����";
	}
	
	System.out.println(label);
	
	
	
	}
}