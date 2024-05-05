package Java.P26;
/*
    变量的作用
        第一个作用：便于代码的维护。
        第二个作用：增强代码的可读性。

 */
public class VarTest02 {
    public static void main(String[] args) {
        System.out.println(100 + 456);
        System.out.println(100 + 111);
        System.out.println(100 + 222);
        System.out.println(100 + 333);
        System.out.println(100 + 444);
        System.out.println(100 + 555); 
        
        // 新的需求来了： 要计算50和后面数字的和
        // 问题： 修改的代码位置太多了，不好维护
        /*
        System.out.println(50 + 456);
        System.out.println(50 + 111);
        System.out.println(50 + 222);
        System.out.println(50 + 333);
        System.out.println(50 + 444);
        System.out.println(50 + 555); 
        */

        System.out.println("====================================");

        int num =50;
        System.out.println(num + 456);
        System.out.println(num + 111);
        System.out.println(num + 222);
        System.out.println(num + 333);
        System.out.println(num + 444);
        System.out.println(num + 555); 

        System.out.println("====================================");

        // 需求：计算半径是10cm的圆的面积。
        System.out.println(3.14 * 10 * 10);

        System.out.println("====================================");

        // 怎么增强代码的可读性？
        double π = 3.14;
        double r = 10;
        System.out.println(π * r * r);
    }
}
