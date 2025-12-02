package scanner;
public class ScannerEx5 {
    static void main() {
        // 변수 a=10 b=20. 두 변수 값을 교환하는 코드를 완성하라
        int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;


        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
