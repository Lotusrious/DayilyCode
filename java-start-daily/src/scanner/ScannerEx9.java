package scanner;
import java.util.Scanner;
public class ScannerEx9 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int price = 0;
        int quantity = 0;
        int total = 0;
        String name = null;
        while(true) {
            System.out.println("1 : 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();


            if (option == 3) {
                System.out.println("프로그램이 종료됩니다");
                break;
            } else if (option == 1) {
                input.nextLine();
                System.out.print("상품명을 입력하세요 : ");
                name = input.nextLine();

                System.out.print("가격을 입력하세요 : ");
                price = input.nextInt();
                System.out.print("구매 수량을 입력하세요 : ");
                quantity = input.nextInt();
                total = price * quantity;

            } else if (option == 2) {
                if (price == 0 || quantity == 0 || name == null){
                    System.out.println("상품을 입력해주세요");
                }
                else{
                    System.out.println("상품명 : " + name + " 가격 : " + price + " 원 " + "수량 : " + quantity + " 총합 : " + total + " 원 입니다");
                    price = 0;
                    quantity = 0;
                    name = null;
                    total = 0;
                }

            }
        }
    }
}
