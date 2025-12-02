package scanner;
import java.util.Objects;
import java.util.Scanner;
public class ScannerEx7 {
    static void main() {
        //사용자로부터 이름과 나이를 반복해서 입력받고, 입력받은 이름과 나이를 출력하는 프로그램을 작성하라.
        // 사용자가 '종료' 입력 시 프로그램은 종료되어야 한다.
        Scanner scanner = new Scanner(System.in);
        for(int i=0;;i++){
            System.out.println("이름을 입력하세요 (종료 입력 시 프로그램은 종료됩니다)");
            String name = scanner.nextLine();
            if (name.equals("종료")){
                break;
            }
            System.out.println("나이를 입력하세요");
            int age = scanner.nextInt();
            scanner.nextLine(); // \n 읽고 버리기

            System.out.println("입력한 이름 : " + name + ", 입력한 나이 : " + age);
        }



    }
}
