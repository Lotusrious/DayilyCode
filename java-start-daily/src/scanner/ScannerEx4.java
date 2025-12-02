package scanner;
import java.util.Scanner;
public class ScannerEx4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        // 사용자로부터 정수 n을 입력받고, 입력받은 정수 n의 구구단을 출력하는 프로그램을 작성하라
        System.out.println("2~9 사이 정수를 입력해주세요");
        int n = scanner.nextInt();
        int i = 0;
        for(i=1;i<10;i++){
            int sum = n*i;
            System.out.println(n + "x" + i + "=" + sum);
        }


    }

}
