package scanner;
import java.util.Scanner;
public class ScannerEx3 {
    // 사용자로부터 음식의 이름 (foodname), 가격, 수량을 입력받아 음식의 총 가격을 계산하고 출력하는 프로그램을 작성하라
    // 음식의 총 가격은 각 음식의 가격과 수량을 곱한 값이며, totalPrice라는 변수에 저장
    // 주문정보와 총 가격을 출력하라.
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("주문하실 음식 이름을 입력해주세요");
        String foodName = scanner.nextLine();
        System.out.println("주문하실 음식의 가격을 입력해주세요");
        int foodPrice = scanner.nextInt();
        System.out.println("주문하실 음식의 수량을 입력해주세요");
        int foodQuantity = scanner.nextInt();


        int totalPrice = foodPrice * foodQuantity;
        System.out.println(foodName + " " + foodQuantity + "  개를 주문하셨습니다. 가격은 총" + totalPrice + "원 입니다.");

    }
}
