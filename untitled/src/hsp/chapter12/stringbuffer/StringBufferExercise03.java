package hsp.chapter12.stringbuffer;

/**
 * @Author: ������
 * @DATE: 2022/5/18 15:50 ������
 * @Operating:
 * @Description: ����һ�³��򣬲�Ҫ�󻭳��ڴ����ͼ
 */
public class StringBufferExercise03 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("a");
        StringBuffer b = new StringBuffer("b");
        operate(a, b);
        System.out.println(a);
        System.out.println(b);
    }

    public static void operate(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
        System.out.println(y);
    }
}
