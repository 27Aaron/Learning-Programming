package Java.P36;
/*
 * Java中任何一个带"整数型"的字面值,都会默认被当int类型来处理.
 * Java中允许小容量的数据直接附值给大容量的变量.
 *      byte < short < int < long < float < double
 * 如果在整数型的字面值后面加上L,就可以把这个整数型的字面值当作long类型来处理.
 */
public class IntTest02 {
    public static void main(String[] args) {
        
        // 这个没有类型转换
        // = 是赋值运算符. = 的右边先执行.
        // 程序先执行右边,分配一块空间去存储100这个数字,给100分配的是四个字节(当作int来处理)
        // a 变量正好也是4个字节.所以不存在类型转换.
        int a = 100;

        // 100 是4个字节
        // b 是8个字节
        // 小容量可以自动附值给大容量,叫做自动类型转换.
        long b = 100;

        // 100L 一上来就是分配8个字节.所以这个代吗不存在类型转换.
        long c = 100L;

        // d 是8个字节 ˙存在类型转换
        long d = 2147483647;
        System.out.println(d);

        // 默认4个字节, 存不下8个字节
        // long e = 2147483648;
        // System.out.println(e);

        long e = 2147483648L;
        System.out.println(e);
    }
}
