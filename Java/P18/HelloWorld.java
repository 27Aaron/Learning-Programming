
//public 表示公开的
//class 表示定义一个类
//HelloWorld 是类名

public class HelloWorld {

    // 类体
    // 类体当中不能直接编译Java语句

    // 1. 这是main方法，是程序的入口
    // 2. main方法是JVM规定的，固定写法，这是程序的入口
    // 3. 对于main方法来说只能修改 args 这个参数
    // 4. public 表示公开的
    // 5. static 表示静态的
    // 6. void 表示main方法之行结束后不返回任何数据

    public static void main(String[] args) {

        // 方法体
        // 方法体当中由一行一行的Java语句组成
        // Java语句以 ; 结尾
        // 方法体当中的代码是有顺序的，按照代码的书写顺序执行
        // 没有ln的话，输出的内容不会换行

        System.out.println("Hello, World!");
        System.out.println("Hello, World! 2");
    }


} 