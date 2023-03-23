package djb.number;

import java.math.BigDecimal;

/*
* 1、BigDecimal 属于大数据，精度极高。不属于基本数据类型，属于java对象（引用数据类型）
*   这是SUN提供的一个类，专门用在财务软件当中
*
* 2、注意：财务软件中的double是不够的。咱们前有个学生去面试，经理就问了这样一个问题：
*   你处理过财务相关的数据吗？用的哪一种类型？
*       千万别说double，说java.math.BigDecimal
* */
public class BigDecimalTest01 {
    public static void main(String[] args) {
        //这个100不是普通的100，是精度极高的100
        BigDecimal v1 = new BigDecimal(100);
        //精度极高的200
        BigDecimal v2 = new BigDecimal(200);
        //求和
        //不能直接 v1 + v2 他们都是引用，需要调用方法求和
        BigDecimal v3 = v1.add(v2);
        System.out.println(v3); //300
        //求和：add()  减法：subtract() 除法：divide() 乘法：
        System.out.println(v1.divide(v2)); // 0.5
        System.out.println(v1.subtract(v2)); // -100
    }
}
