package Java.P30;

/*
 * 二进制与十进制的转换:
 * 1.十进制如何转换为二进制 ?
 *  处2取余,一直到商0为止,最后将所有的余数逆序输出.
 *  将75转化为2进制
 * 
 * 2.二进制如何转换为十进制?
 *   每一位与权值相乘,最后求和.
 *    将二进制1001011转换位十进制
 * 
 */
public class BinaryTest01 {
    public static void main(String[] args) {

        // 这是一个二进制的字面量
        // 二进制的字面量需要以0b开头
        System.out.println(0b1001011); // 75
    }

}
