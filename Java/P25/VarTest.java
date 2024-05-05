package Java.P25;
/* 
变量
    1、什么是变量
        变量是内存中的一小块区域，是计算机中的一块内存区域，用来存储数据
        变量时用来解决数据存储问题的
        先把数据存起来，以后程序需要使用的时候，可以通过变量名来获取数据
    2、变量的三要素
        数据类型
        变量名
        变量值
        注意：
            数据类型是决定空间大小的
            数据类型 和 值的数据 类型要一致
    3、变量的声明、赋值、访问
        声明（定义）语法格式
            数据类型 变量名;
            数据类型：
                int 整数类型
                double 浮点型
                string 字符串
                ······
        
        赋值的语法格式
            变量名 = 变量值;

        访问怎么做？
            访问包括两种情况： 一种是读取变量的值，一种是修改变量的值。
            读：System.out.println(变量名);
            修改： 变量名 = 变量值;

 */
public class VarTest {
    public static void main(String[] args) {
        
        // 声明/定义一个int变量，起名age，用来存储人的年龄
        int age;

        // 给age变量赋值
        age = 20;

        // 读
        System.out.println("年龄=" + age);

        // 修改
        age = 30;
        System.out.println("年龄=" + age);

        age = 60;
        System.out.println("年龄=" + age);

        // 不兼容的类型：String无法转换为int
        // age = "100";

        //定义一个变量，用来存储数学中的π
        double π = 3.1415926;
        System.out.println("圆周率：" + π);

        // 声明一个String类型的name变量 用来存储人的名字
        // 变量的声明和赋值可以同时进行
        String name = "张三";
        System.out.println("名字：" + name);

        // 可以重新赋值
        name = "李四";
        System.out.println("名字：" + name);
    }
    
}
