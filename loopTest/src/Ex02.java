public class Ex02 {
    static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) continue;
            System.out.print(i + " ");
            // 짝수인경우 다음단계 생략하고 넘어가는거니까
            // 홀수만 프린트 됩니다
        }
        int i = 10;
        while (i > 0) {
            System.out.print(i + " ");
            i -= 3;
            // 10 , 7 , 4 , 1 출력


        }
        for (int k = 1; k <= 3; k++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) break;
                System.out.print(k + "-" + j + " ");
            }
        }

            // 1 - 1
        // 1 - 3 ... 뒤에 2를 생략한 1~3 1,3 이 나옴




    }

}
