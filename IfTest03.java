
/*
����
�жϵ�ǰ������
 �������꣺
 	��ɡ��
			�еĴ� ��ɡ
			Ů�Ĵ� ��ɡ
 ���治���꣺
 	�¶ȳ���30�� 
			�еĴ�ī��
			Ů��Ϳ��ɹ��
	30������
			ʲô������
*/


public class IfTest03
{
	public static void main(String[] args){
	java.util.Scanner s = new java.util.Scanner(System.in);
	System.out.println("��ӭ������ϵͳ");
	System.out.println("˵��1��1��ʾ���꣬0��ʾ������");
	System.out.println("˵��2��1��ʾ�У�0��ʾŮ");
	
	System.out.print("�������Ա�");
	int sex = s.nextInt();

	System.out.print("�����뵱ǰ�����������");
	int weather = s.nextInt();
	
	if (weather  == 1)
	{System.out.println("������");
	}
		if (sex == 1)
		{System.out.println("����Ϻ�ɡ");
		}
		else if(sex == 0)
		{System.out.println("�����С��ɡ");
		}
		else
		{System.out.println("Whay are your sex?");
		}
		
	if (weather == 0)
	{System.out.println("����");
	}
		System.out.print("�������¶ȣ����֣�");
		int tem = s.nextInt();
		if (tem >  30)
			if (sex == 1)
			{System.out.println("��̫���۾�");
			}
			else if(sex == 0)
			{System.out.println("Ϳ��ɹ˪");
			}
			else
			{System.out.println("Whay are your sex?");
			}
		if (tem < 30)
		{System.out.println("��ϲ��ʲô�����ô�");
		}
		
	else
	{System.out.println("��������������Ϸ�");
	}
	}
	
}