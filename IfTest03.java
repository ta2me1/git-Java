
/*
ÐèÇó£º
ÅÐ¶Ïµ±Ç°ÌìÆø£º
 ÍâÃæÏÂÓê£º
 	´øÉ¡£º
			ÄÐµÄ´ø ºÚÉ¡
			Å®µÄ´ø »¨É¡
 ÍâÃæ²»ÏÂÓê£º
 	ÎÂ¶È³¬¹ý30¶È 
			ÄÐµÄ´øÄ«¾µ
			Å®µÄÍ¿·ÀÉ¹ÓÍ
	30¶ÈÒÔÏÂ
			Ê²Ã´¶¼²»¸É
*/


public class IfTest03
{
	public static void main(String[] args){
	java.util.Scanner s = new java.util.Scanner(System.in);
	System.out.println("»¶Ó­À´µ½±¾ÏµÍ³");
	System.out.println("ËµÃ÷1£º1±íÊ¾ÏÂÓê£¬0±íÊ¾²»ÏÂÓê");
	System.out.println("ËµÃ÷2£º1±íÊ¾ÄÐ£¬0±íÊ¾Å®");
	
	System.out.print("ÇëÊäÈëÐÔ±ð£º");
	int sex = s.nextInt();

	System.out.print("ÇëÊäÈëµ±Ç°µÄÌìÆøÇé¿ö£º");
	int weather = s.nextInt();
	
	if (weather  == 1){
	{System.out.println("ÏÂÓêÌì");
	}
		if (sex == 1)
		{System.out.println("Çë´øÉÏºÚÉ¡");
		}
		else if(sex == 0)
		{System.out.println("Çë´øÉÏÐ¡»¨É¡");
		}
		else
		{System.out.println("Whay are your sex?");
		}

	}	
	else if (weather == 0){
	
	{System.out.println("ÇçÌì");
	}
		System.out.print("ÇëÊäÈëÎÂ¶È£¨Êý×Ö£©");
		int tem = s.nextInt();
		if (tem >=  30)
			if (sex == 1)
			{System.out.println("´÷Ì«ÑôÑÛ¾µ");
			}
			else if(sex == 0)
			{System.out.println("Í¿·ÀÉ¹Ëª");
			}
			else
			{System.out.println("Whay are your sex?");
			}
		if (tem < 30)
		{System.out.println("¹§Ï²ÄãÊ²Ã´¶¼²»ÓÃ´ø");
		}
	}	
	else
	{System.out.println("ÄãÊäÈëµÄÌìÆø²»ºÏ·¨");
	}
	}
	
}

//ver0.2