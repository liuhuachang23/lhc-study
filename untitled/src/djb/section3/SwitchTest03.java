/*�Լ�д��
public class SwitchTest03
{
	public static void main(String[] args){
	
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("��ӭʹ�ü򵥼����ϵͳ:");

		System.out.print("�������һ������:");
		int num1 = s.nextInt();

		System.out.print("�����������:");
		String operator = s.next();

		System.out.print("������ڶ�������:");
		int num2 = s.nextInt();


		switch(operator){

			case "+" :
				System.out.println(num1 + operator + num2 + "=" + (num1 + num2));
				break;
			
			case "-" :
				System.out.println(num1 + operator + num2 + "=" + (num1 - num2));
				break;

			case "*" :
				System.out.println(num1 + operator + num2 + "=" + (num1 * num2));
				break;
				
			case "/" :
				System.out.println(num1 + operator + num2 + "=" + (num1 / num2));
				break;
				
			case "%" :
				System.out.println(num1 + operator + num2 + "=" + (num1 % num2));
				break;
			default :
				System.out.println("�Բ���,�������֧�����ּ���");
		}

	}
}
*/

//��ʦд��
public class SwitchTest03
{
	public static void main(String[] args){
	
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("��ӭʹ�ü򵥼����ϵͳ:");

		System.out.print("�������һ������:");
		int num1 = s.nextInt();

		System.out.print("�����������:");
		String operator = s.next();

		System.out.print("������ڶ�������:");
		int num2 = s.nextInt();

		int result = 0;

		switch(operator){

			case "+" :
				result = num1 + num2;
				break;
				
			case "-" :
				result = num1 - num2;
				break;

			case "*" :
				result = num1 * num2;
				break;
					
			case "/" :
				result = num1 / num2;
				break;
					
			case "%" :
				result = num1 % num2;
				break;
		}

		System.out.println("������Ϊ:" + num1 + operator + num2 + "=" + result);

	}
}
