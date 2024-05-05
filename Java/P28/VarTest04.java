package Java.P28;
/*
 * 变量的作用域
 *     1、什么是作用域？
 *          作用域是变量的有效范围，在Java程序中通常是一个{}对应一个作用域
 *     2、出了大括号就不认识了
 *          
 */
public class VarTest04 {
    public static void main(String[] args) {

        // age 是main方法中声明的，所以作用域是整个main方法
        // 在main方法中，age是可以使用的
        int age = 20;
        System.out.println("age=" + age);

        int num = 100;
        if (num > 50) {
            int i = 666;
            System.out.println("i=" + i);
        }

        // System.out.println("i=" + i);
    }

    // 另一个方法
    // public static void main(String[] args) {
        // 错误：找不到符号
        // System.out.println("age=" + age);
    // }
}
