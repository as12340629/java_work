import java.util.Scanner;

public class Ex06 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dice1 = 0;
        int dice2 = 0;
        int dice3 = 0;


        System.out.println("1을 눌러 주사위 1 을 굴리세요.");
        int choice1 = sc.nextInt();


        switch (choice1) {
            case 1:
                dice1 = (int) (Math.random() * 6) + 1;
                System.out.println("주사위 1 : " + dice1);
                break;
            default:
                System.out.println("잘못된 선택");
                return;
        }

        System.out.println("2를 눌러 주사위 2 를 굴리세요.");

        int choice2 = sc.nextInt();

        switch (choice2) {
            case 2:
                dice2 = (int) (Math.random() * 6) + 1;
                System.out.println("주사위 2 : " + dice2);
                break;
            default:
                System.out.println("잘못된 선택");
                return;
        }

        System.out.println("3를 눌러 주사위 3 를 굴리세요.");

        int choice3 = sc.nextInt();

        switch (choice3) {
            case 3:
                dice3 = (int) (Math.random() * 6) + 1;
                System.out.println("주사위 3 : " + dice3);
                break;
            default:
                System.out.println("잘못된 선택");
                return;
        }

        System.out.println("===============");
        System.out.println("주사위 1 : "+dice1);
        System.out.println("주사위 2 : "+dice2);
        System.out.println("주사위 3 : "+dice3);

        int prize;   // 상금

        if (dice1 == dice2 && dice2 == dice3) {
            prize = 10000 + dice1 * 1000;              // 3개 같음
        } else if (dice1 == dice2 || dice1 == dice3) {
            prize = 1000 + dice1 * 100;                // dice1이 다른 하나와 같음
        } else if (dice2 == dice3) {
            prize = 1000 + dice2 * 100;                // dice2, dice3이 같음
        } else {
            int max = dice1;                           // 모두 다름: 가장 큰 눈 찾기
            if (dice2 > max) {
                max = dice2;
            }
            if (dice3 > max) {
                max = dice3;
            }
            prize = max * 100;                         // 비교가 끝난 뒤에 한 번만 곱함
        }

        System.out.println("상금 : " + prize + "원");


    }
}
