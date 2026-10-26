import java.util.Scanner;

public class Ex01 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하시오 : ");
        int firstNumber = scanner.nextInt(); // 첫번째 숫자

        System.out.println("두번째 숫자를 입력하시오 : ");
        int secondNumber = scanner.nextInt(); // 두번째 숫자

        System.out.println("첫번째 입력수 : "+ firstNumber + "/ 두번째 입력수 : "+secondNumber);

        if (firstNumber > secondNumber) {
            System.out.println("큰수 : " + firstNumber);
        } else {
            System.out.println("큰수 : "+ secondNumber);


        }

    }
}
