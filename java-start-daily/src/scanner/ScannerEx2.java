package scanner;
import java.util.Scanner;

public class ScannerEx2 {
    //하나의 정수를 입력받고, 해당 수가 홀수인지 짝수인지 판별하는 프로그램 작성
    static void main() {
        System.out.println("정수를 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number%2 == 0){
            System.out.println(number +"는 짝수입니다");
        }
        else{
            System.out.println(number +"는 홀수입니다");
        }

    }
}
