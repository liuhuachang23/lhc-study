/*
public class IfTest01
{
	public static void main(String[] args){
	 
		int grade = 90;

		if (grade >= 90){
			System.out.println('A');
		}else if (grade >= 80){
			System.out.println('B');
		}else if (grade >= 70){
			System.out.println('C');
		}else if (grade >= 60){
			System.out.println('D');
		}else{
			System.out.println('E');
		}
	}
}
*/
public class IfTest01
{
	public static void main(String[] args){
		
		int soore = 30;

		String grade = "�ÿ����Ŀ��Գɼ��ȼ��ǣ�E�ȼ�";

		if (soore <0 || soore >100){
			grade = "�ÿ����Ŀ��Գɼ��ȼ��ǣ�E�ȼ�";
		}else if (soore >= 90){
			grade = "�ÿ����Ŀ��Գɼ��ȼ��ǣ�A�ȼ�";
		}else if (soore >= 80){
			grade = "�ÿ����Ŀ��Գɼ��ȼ��ǣ�B�ȼ�";;
		}else if (soore >= 70){
			grade = "�ÿ����Ŀ��Գɼ��ȼ��ǣ�C�ȼ�";
		}else if (soore >= 60){
			grade = "�ÿ����Ŀ��Գɼ��ȼ��ǣ�D�ȼ�";
		}
		System.out.println(grade);
	}
}
