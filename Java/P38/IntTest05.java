package Java.P38;

/*
 * 当两个int类型的变量进行运算的时候,结果也是int类型的
 * 多种类型的数据进行运算的时候,结果是最大的类型
 */
public class IntTest05 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // 应该是这样的结果 3.3333333333333335
        // 但Java中不是 结果是 int类型的3
        System.out.println(a / b); // 3

        byte x = 10;
        int y = 3;
        long z = 100L;

        // 编译报错
        // int result = x + y + z;

        // 修改
        long result = x + y + z;

        System.out.println(result);
    }
}
