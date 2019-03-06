
/*
需求：
判断当前天气：
 外面下雨：
 	带伞：
			男的带 黑伞
			女的带 花伞
 外面不下雨：
 	温度超过30度 
			男的带墨镜
			女的涂防晒油
	30度以下
			什么都不干
*/


public class IfTest03
{
	public static void main(String[] args){
	java.util.Scanner s = new java.util.Scanner(System.in);
	System.out.println("欢迎来到本系统");
	System.out.println("说明1：1表示下雨，0表示不下雨");
	System.out.println("说明2：1表示男，0表示女");
	
	System.out.print("请输入性别：");
	int sex = s.nextInt();

	System.out.print("请输入当前的天气情况：");
	int weather = s.nextInt();
	
	if (weather  == 1)
	{System.out.println("下雨天");
	}
		if (sex == 1)
		{System.out.println("请带上黑伞");
		}
		else if(sex == 0)
		{System.out.println("请带上小花伞");
		}
		else
		{System.out.println("Whay are your sex?");
		}
		
	if (weather == 0)
	{System.out.println("晴天");
	}
		System.out.print("请输入温度（数字）");
		int tem = s.nextInt();
		if (tem >  30)
			if (sex == 1)
			{System.out.println("戴太阳眼镜");
			}
			else if(sex == 0)
			{System.out.println("涂防晒霜");
			}
			else
			{System.out.println("Whay are your sex?");
			}
		if (tem < 30)
		{System.out.println("恭喜你什么都不用带");
		}
		
	else
	{System.out.println("你输入的天气不合法");
	}
	}
	
}