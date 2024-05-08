package Java.P37;

/*
 * 当一个整数行字面量没有超出byte取值范围的时候,可以直接附值给byte类型的变量
 * 当一个整数型字面量没有超出short取值范围的时候,可以直接附值给short类型的变量
 */
public class IntTest04 {
    public static void main(String[] args) {

        // 可以直接附值,不需要强制类型转换
        byte b = 1;
        byte a = 127;

        // 超出byte取值范围,编译报错
        // byte c = 128;

        // 如果想编译通过,需要强制类型转换
        byte c = (byte) 128;
        System.out.println(c);

        // shrot 取值范围 -32768 ~ 32767
        short s = 32767;

        // 编译报错
        // short s1 = 32768;

        // 必须强制类型转换
        short s1 = (short) 32768;
        System.out.println(s1);
    }

}
