package hsp.chapter10.abstract_;

/*
 *   1.抽象类怎么定义？ 在class前面加abstract关键字就行。
 *   2.抽象类是无法实例化的，无法创建对象的，所以抽象类是用来被子类继承的。
 *   3.抽象方法不能使用private final static 修饰，因为关键字都是和重写违背的
 *   4.抽象类的子类可以是抽象类，也可以是非抽象类。
 *   5.抽象类虽然无法实例化，但是抽象类有构造方法，这个构造方法供子类使用。
 *   6.抽象类中不一定有抽象方法，但抽象方法必须出现在抽象类当中。
 *   7.抽象方法怎么定义：
 *       public abstract void doSome();
 *   8.一个非抽象类继承一个抽象类，必须将抽象类中的抽象方法进行实现（覆盖/重写），除非他声明为抽象类。
 *   9.抽象类可以有任何成员【抽象类本质还是类】，比如；非抽象方法、构造器、静态属性等等
 *
 * */
public class AbstractDetail {
    public static void main(String[] args) {

        //使用多态
        //父类型指向子类型对象
        Animal a = new Bird();

        //这就是面向抽象编程
        //a的类型是Animal , Animal是抽象的
        //面向抽象编程,不要面向具体编程,降低程序的耦合度,提高扩展力.这种编程思想符合OCP原则
        a.move();
    }
}
