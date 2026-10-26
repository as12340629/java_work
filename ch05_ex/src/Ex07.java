import java.util.Scanner;

public class Ex07 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //- 메뉴: 1.커피(1500원) 2.주스(1000원) 3.물(500원) 4.종료
        //- 초기 잔액: 0원
        //- 1번 선택 시: 투입 금액 입력 → 잔액에 추가
        //- 2번 선택 시: 음료 선택 후 잔액 차감 (잔액 부족 시 안내)
        //- 3번 선택 시: 현재 잔액 출력
        //- 4번 선택 시: 잔돈 반환 후 종료
        //> 힌트: `while(true)` + switch 표현식 조합으로 구현
        // 그럼 투입 금액을 스캐너 값으로 둬야겠네
        //메뉴
        String menu0 = """
                ========메뉴========
                1. 커피 (1,500원)
                2. 주스 (1,000원)
                3. 물 (500원)
                ===================
                """;
        //자판기
        String menu1 = """
                ===================
                1. 투입 금액 입력 ---> 잔액에 추가
                2. 음료 선택 후 잔액 차감
                3. 현재 잔액 출력
                4. 잔돈 반환 후 종료
                =================== 
                숫자를 입력하세요 : 
                """;


        System.out.println(menu0);

       // int priceCoffee = 1500; // 커피가격
       // int priceJuice = 1000; // 주스 가격
      //  int priceWater = 500; // 물 가격
        int money0 = 0; // 초기 잔액

        int choice;
        while (true) {
            System.out.println(menu1);
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("금액을 입력하세요 : "); //금액 입력

                    int moneyHave = sc.nextInt(); //입력

                    //money0 = money0 + moneyHave; //잔액에 추가

                    //System.out.println("현재 잔액 : " + money0); // 잔액표시
                    if (moneyHave > 0) {
                        money0 = money0 + moneyHave;
                        System.out.println("현재 잔액 : " + money0 + "원");
                    } else {
                        System.out.println("0원보다 큰 금액을 입력해주세요.");
                    }
                }
                case 2 -> {
                    System.out.println("음료를 선택하세요.");
                    System.out.println(menu0);
                    int choice2 = sc.nextInt();
                    switch (choice2) {
                        case 1 -> {
                            System.out.println("커피를 선택하였습니다.");
                            if (money0 >= 1500) {
                                money0 = money0 - 1500;
                                System.out.println("커피를 구매했습니다. 잔액 : " + money0 + "원");
                            } else {
                                System.out.println("잔액이 부족합니다.");
                            }
                        }
                        case 2 -> {
                            System.out.println("주스를 선택하였습니다.");
                            if (money0 >= 1000) {
                                money0 = money0 - 1000;
                                System.out.println("주스를 구매했습니다. 잔액 : " + money0 + "원");
                            } else {
                                System.out.println("잔액이 부족합니다.");
                            }
                        }
                        case 3 -> {
                            System.out.println("물을 선택하였습니다.");
                            if (money0 >= 500) {
                                money0 = money0 - 500;
                                System.out.println("물을 구매했습니다. 잔액 : " + money0 + "원");
                            } else {
                                System.out.println("잔액이 부족합니다.");
                            }
                        }

                        default -> System.out.println("1~3 중에서 선택해주세요.");
                    }
                }
                case 3 -> {
                    System.out.println("현재 잔액 : " + money0 + "원 입니다.");
                }
                case 4 -> {
                    System.out.println("남은 금액 : " + money0 + "원");
                    System.out.println("잔돈을 반환하고 종료합니다.");
                    return;
                }
                default -> System.out.println("1~4번중에 선택해주세요.");
            }
        }


        // System.out.println("투입 금액을 입력하세요 : ");

        // int money1 = sc.nextInt();

    }
}
