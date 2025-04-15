package advanced.ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        //스캐너라는 부품 가져오기
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("x 값 입력 : ");
            String str = sc.nextLine();

            if (str.equals("q")) {
                break;
            }
            System.out.print("입력값 = " + str);
            System.out.println();
        }
        //스캐너 닫기
        System.out.println("종료");
    }
}