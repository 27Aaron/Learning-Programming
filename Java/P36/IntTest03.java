package Java.P36;

/*
 * 强制类型转换
 *  Java 中 大容量不能附值给小容量.
 *  大容量转换成小容量的时候,需要加上强制类型转换符.
 */
public class IntTest03 {
    public static void main(String[] args) {

        long x = 1000L;

        // 错误 从 long 转换成int 有损失
        // int y = x;

        // 强制类型转换
        int y = (int) x;

        long a = 55L;

        int b = (int) a;

        System.out.println("b = " + b);

        int k = 128;

        byte e = (byte) k;

        System.out.println("e = " + e);

        int m = 129;
        byte n = (byte) m;
        System.out.println("n = " + n);
    }
}
