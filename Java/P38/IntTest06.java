package Java.P38;

/*
 * 编译器的小心思
 */
public class IntTest06 {
    public static void main(String[] args) {

        byte b = 10 / 3;

        //这条语法规则需要记住: byte short 混合运算的时候,各自先转换成int在做运算
        //byte + byte = int
        //byte + short = int
        //short + short = int

        short m = 10;
        byte n = 10;
        // 编译报错, 最后结果是int类型 不能使用short类型接收
        // short result = m + n;

        int result = m + n;
        System.out.println(b);

        byte x = 10;
        byte y = 3;
        // 编译报错
        // byte c = x / y;

        //修改
        int c = x / y;

        byte e = 3;
        // 编译报错
        // byte f = 10 / e;

        // 第一种修改方式
        // int f = 10 / e;

        // 第二种修改方式
        byte f = (byte) (10 / e);
    }
}
