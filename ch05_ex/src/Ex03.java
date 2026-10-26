import java.util.Scanner;

public class Ex03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("성적을 입력하세요 : ");
        int grade = sc.nextInt();

        String result;

        if (grade > 100) {
            result = "성적을 잘못 입력하셨습니다.";
        } else if (grade >= 90) {
            result = "A";
        } else if (grade >= 80) {
            result = "B";
        } else if (grade >= 70) {
            result = "C";
        } else if (grade >= 60) {
            result = "D";
        } else if (grade >0){
            result = "F";
        } else {
            result = "성적을 잘못 입력하셨습니다.";
        }
        System.out.println("성적 : " + result);

    }
}
