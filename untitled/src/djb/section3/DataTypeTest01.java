public class DataTypeTest01
{
	public static void main(String[] args){
	
		char c = 'a';
		System.out.println(c);

		//���� \n ��ʾһ���ַ� ������ �ַ���������һ�� �����з���������char���͵�����
		//��б����java���Ե��о���ת�幦��
		char x = '\n';

		//�ڿ���̨���һ������б���ַ���
		//��һ����б�ܾ���ת�幦�ܣ�������ķ�б��ת��Ϊ��ͨ�ķ�б���ַ���
		//���ۣ���java���Ե�������б�ܴ���һ����ͨ�ķ�б���ַ���
		char k = '\\';
		System.out.println(k);
	
		//�ڿ���̨�����һ���������ַ�
		//��б�ܾ���ת�幦�ܣ����ڶ���������ת�����ͨ�����ţ��������һ�����������
		//��һ�������������һ�����������
		char a = '\'';
		System.out.println(a);

		//ͬ�� �ڿ���̨�����һ��"HelloWorld!"
		System.out.println("\"HelloWorld\"");

	}	
}