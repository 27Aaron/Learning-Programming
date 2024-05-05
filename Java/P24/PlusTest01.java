package Java.P24;
/*
Java语言中的 + 运算符
    1、 + 运算符在Java语言中有两个作用
        1、加法运算
        2、字符串连接运算
    2、 什么情况下是求和？
        两边都是数字的时候，+代表求和
    3、 什么情况下是字符串拼接？
        两边只要有一个是字符串，+代表字符串拼接，并且凭借完后还是字符串。
 */
public class PlusTest01 {
    public static void main(String[] args) {

        // 求和
        System.out.println(10 + 20); // 30

        // 字符串拼接
        System.out.println("10" + 20); // 1020

        // 一个表达式中有多个 + 号的情况，从左往右依次执行 + 号运算
        // 第一个加号是求和，第二个加号是字符串拼接
        System.out.println(10 + 20 + "30"); // 3030

        System.out.println(10 + (20 + "30")); // 102030
        System.out.println("10" + 20 + 30); // 102030
        System.out.println("10" + (20 + 30)); // 1050
    }
}
