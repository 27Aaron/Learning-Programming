package Java.P36;

public class IntTest01 {

    public static void main(String[] args) {
        int a = 10;
        int b = 0b10;
        int c = 010;
        int d = 0x10;
        System.out.println(a); //10
        System.out.println(b); //2
        System.out.println(c); //8
        System.out.println(d); //16
        System.out.println(a + b + c + d); //36
    }
}