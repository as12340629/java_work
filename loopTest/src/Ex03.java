import java.util.Scanner;

public class Ex03 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("N을 입력하세요: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("1부터 " + n + "까지의 합: " + sum);
    }
}
