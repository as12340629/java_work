package ifCondition;

import java.util.Scanner;

public class MenuSelect {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("투입 금액을 적어주세요");
        int total = scanner.nextInt();
        int coffeePrice = 1500;
        int juicePrice = 1000;
        int waterPrice = 500;
        String result;

        if (total>=coffeePrice) {
            result = "커피, 주스, 물 모두 구매 가능합니다.";
        } else if (total >=juicePrice) {
            result = "주스, 물 구매 가능합니다.";
        } else if (total >= waterPrice) {
            result = "물만 구매 가능합니다.";
        } else {
            result = "잔액이 부족합니다.";
        }
        System.out.println(result);

    }
}
