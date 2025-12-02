package scanner;
import java.util.Scanner;
public class ScannerEx6 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력해주세요");
        int num1 = scanner.nextInt();
        System.out.println("두번째 숫자를 입력해주세요");
        int num2 = scanner.nextInt();
        int temp;
        if (num1 > num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.print("두 숫자 사이의 모든 정수 : ");
        for(int i=num1+1;i<num2;i++){
            System.out.print(i);
            if(i!=num2-1) {
                System.out.print(",");
            }
        }
    }
}
