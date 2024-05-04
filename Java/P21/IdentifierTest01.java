package Java.P21;
/*
标识符
    1. 什么是标识符？
        在源代码中程序员自己有权力命名的单词都是标识符。
    2. 标识符可以标识什么？
        变量名，方法名，类名，接口名，包名等等。
    3. 标识符的命名规则？
        1. 由26个英文字母大小写，0-9，_或$组成
        2. 数字不可以开头
        3. 不可以使用关键字
        4. 区分大小写
        5. 见名知意

 */

public class IdentifierTest01 {
    public static void main(String[] args) {

        // 定义一个变量，用于存储一个人的年龄
        // age 是一个变量名，是一个标识符。
        int age = 20;

        int age_ = 20;

        int $_age = 20;

        int $_age123 = 20;

        // int 123$age = 20;

        int 年龄 = 20;

        int a =200;

        int A = 200;
    }

    class 学生类 {
    }

}
