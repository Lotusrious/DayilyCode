package scanner;
import java.util.Scanner;

public class ScannerEx8 {
    static void main() {
        Scanner input = new Scanner(System.in);
        // 입력한 숫자의 합계와 평균, 사용자로부터 여러개의 정수를 입력받고 그 숫자들의 합계와 평균을 계산하는 프로그램
        // -1입력 시 숫자입력 종료
        System.out.println("정수를 입력해주세요");
        int sum = 0;
        double count = 0;
        while(true){
            int num = input.nextInt();
            if(num == -1){
                break;
            }
            sum = sum + num;
            count++;
        }
        System.out.println("입력한 숫자들의 합계 : " + sum);
        System.out.println("입력한 숫자들의 평균 : " + sum/count);
    }
}
