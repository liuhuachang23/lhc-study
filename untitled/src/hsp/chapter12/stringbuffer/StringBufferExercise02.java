package hsp.chapter12.stringbuffer;
/*
Ҫ�󽫼۸��С����ǰÿ3λ���ö��Ÿ���
���罫��1123564.59
���Ϊ��1,123,564.59
 */
public class StringBufferExercise02 {
    public static void main(String[] args) {
        String price = "1123564.59";

        StringBuffer sb = new StringBuffer(price);

        int i = sb.lastIndexOf(".");
        //sb.insert(i-3,",");
        //System.out.println();

        for (int j = sb.lastIndexOf(".")-3; j > 0 ; j -=3) {
            sb.insert(j,",");
        }
        System.out.println(sb);


    }
}
