/*
    1. 一个源文件中可以定义多个class
    2. 编译之后，每个class都会生成一个对应的.class文件
    3. 如果一个类是public的，那么这个类的类名必须和文件名一致
    4. public class 只能有一个, 如果有多个类，只能有一个public class
    5. 每个类中都可以有main方法，想执行哪个类，就执行哪个类的main方法
    6. 这里只是测试一下语法，实际开发中不要这样写
 */

class X {
    public static void main(String[] args) {
        System.out.println("X");
    }
}

class Y {
    public static void main(String[] args) {
        System.out.println("Y");
    }
}

class Z {
    public static void main(String[] args) {
        System.out.println("Z");
    }
}

public class A {
}