package scanner;

import java.util.Scanner;

public class Scanner3 {
    static void main() {
        //사용자로부터 입력을 받아 두 수 중 더 큰 수를 출력하는 프로그램을 만들어라
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요");
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println("두 수중 더 큰 수 = " + num1);
        }
        else if(num1 < num2){
            System.out.println("두 수중 더 큰 수 = " + num2);
        }
        else{
            System.out.println("두 수는 같습니다");
        }
    }
}
