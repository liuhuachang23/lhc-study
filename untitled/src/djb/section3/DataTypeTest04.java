public class DataTypeTest04

{
	public static void main(String[] args){

		int a = 10;
		int b = 010;
		int c = 0x10;

		System.out.println(a); //10
		System.out.println(b); //8
		System.out.println(c); //16
		System.out.println(a + b + c); //34

		//123�������������ֵ��int����
		//i����������ʱ��Ҳ��int����
		//int���͵�123��ֵ��int���͵ı���i������������ת��
		int i = 123;
		System.out.println(i);

		//456����������ֵ��int���ͣ�ռ��4���ֽ�
		//x������������ʱ����long���ͣ�ռ��8���ֽ�
		//int���͵�����ֵ456��ֵ��long���͵ı���x����������ת��
		//int����ת��Ϊlong���ͣ���С����ת��Ϊ������
		//С����ת��Ϊ�����������Զ�ת������Ϊ�Զ�ת�����ơ�
		long x = 456;
		System.out.println(x);

		//2147483647����ֵ��int���ͣ�ռ��4���ֽ�
		//y��long���ͣ�ռ��8���ֽڣ��Զ�����ת��
		long y = 2147483647;
		System.out.println(y);
	
		//������󣺹����������2147483648
		//2147483648������int����4���ֽڴ��������������ֵ����int���ͷ�Χ
		//long z = 2147483648;

		//�������
		//2147483648����ֵһ�����͵���long����������������ֵ�����L
		//2147483648L��8���ֽڵ�long����
		//z��long���ͱ��������³��򲻴�������ת��
		long z = 2147483648L;
		System.out.println(z);
	}
}

