/*
	����ѧ���ɼ�ϵͳ
	90-100[A]
	80-90[B]
	60-80[C]
	0-50[E]

*/

public class OperatorTest04IF
{
	public static void main (String[] args){
	
/*
	int grade = 90;
	if(grade >= 90)
	{
		System.out.println("A");
	}
	else if(grade >= 80)
	{
		System.out.println("B");
	}
	else if (grade >= 60)
	{
		System.out.println("C");
				
	}
	else if (grade >= 0)
	{
		System.out.println("D");
	}

*/

	double score =10;
	score = 99;
	if (score < 0 || score > 100)
	{
		System.out.println("�Բ������ṩ�ĳɼ����Ϸ�");
	}
	else if (score >= 90)
	{
		System.out.println("A");
	}
	else if (score >=80)
	{
		System.out.println("B");
	}
	else if (score >=60)
	{
		System.out.println("C");
	}
	
	else  
	{
		System.out.println("E");
	}

	score = 80;
	String grade ="�ÿ����ɼ��ȼ�ΪE";
	if (score < 0 || score > 100){
		grade = "���Ϸ�";
	}else if (score >= 90){
		grade = "A";
	}else if (score >= 80){
		grade = "B";
	}else if (score >= 60){
		grade = "C";
	}
	System.out.println(grade);





	}


}