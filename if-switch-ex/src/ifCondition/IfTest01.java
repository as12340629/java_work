package ifCondition;

import java.util.Scanner;

public class IfTest01 {
    // 나이를 입력받아서 20세 이상이면, 성인
    // 그렇지 않으면 미성년을 출력하도록...
    // 1. 스캐너 생성
    // 2. 나이를 저장할 변수 선언
    // 3. 스캐너로 나이 입력 받기
    // 4. 비교하기
    static void main(String[] args) {

        System.out.println("나이를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("입력 하신 나이 : " + age + "세");
        if (age >= 20) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년입니다.");
        }
        System.out.println("조사 끝");

    }
}
