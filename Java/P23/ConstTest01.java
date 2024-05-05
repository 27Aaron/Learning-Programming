package Java.P23;
/*
Java 中的字面量
    1、什么是字面量
    程序中的数据就是字面量。字面量是Java中最基本的表达式，无需转换，直接使用。
    2、字面量包括哪些类型？
    整数型字面量、浮点型字面量、布尔型字面量、字符型字面量、字符串型字面量
 */
public class ConstTest01 {
    public static void main(String[] args) {
        
        // 整数型字面量；
        System.out.println(10);
        System.out.println(-100);

        // 浮点型字面量
        System.out.println(3.14);

        // 布尔型字面量
        System.out.println(true); // true代表真
        System.out.println(false); // false代表假

        // 字符型字面量 (单个字符）
        // 所有的字符型字面量都要使用单引号括起来

        System.out.println('A');
        System.out.println('中');
        // System.out.println('AB');   // 一个字符型字面量只能存放一个字符

        // 字符串型字面量
        // 所有的字符串型字面量都要使用双引号括起来
        System.out.println("Hello World");
        System.out.println("Hello");

        System.out.println("10");
        System.out.println("true");
    }
}
