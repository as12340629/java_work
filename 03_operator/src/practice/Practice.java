package practice;

public class Practice {
    static void main(String[] args) {
        int age = 20;

        // (1) 성인 여부 출력
        if (age == 20) {
            System.out.println("성인입니다.");
        }

        // (2) 퍼센트 출력
        int rate = 85;
        System.out.println("%d%%".formatted(rate));

        // (3) 소수점 나눗셈
        int total = 3;
        int part  = 1;
        double ratio = (double)part / total;
        System.out.println(ratio);  // 0.333...을 기대했지만...
    }
}
