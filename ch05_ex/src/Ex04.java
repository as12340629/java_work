import java.util.Scanner;

public class Ex04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("시간과 분을 입력하면 45분전 시간을 알려드립니다.");

        System.out.println("(0~23H) 시간을 입력하세요 : ");
        int hour = sc.nextInt();

        if (hour > 23) {
            System.out.println("시간을 정확하게 입력하세요"); return;
        } else if (hour >= 0) {
            System.out.println(hour + "시");
        } else {
            System.out.println("시간을 정확하게 입력하세요"); return;
        }

        System.out.println("(0~59M) 분을 입력하세요");
        int min = sc.nextInt();

        if (min > 59) {
            System.out.println("시간을 정확하게 입력하세요"); return;
        } else if (min >= 0) {
            System.out.println(min + "분");
        } else {
            System.out.println("시간을 정확하게 입력하세요"); return;
        }



        int minus = min - 45;

        if (minus<0) {
            hour =hour- 1; minus = 60+ minus;
            if (hour<=-1){
                hour = 24 + hour;
            } else {
                System.out.println( hour +"시"+ minus+"분"); return;
            }
        } else  {
            System.out.println( hour +"시"+ minus+"분"); return;
        }

        System.out.println(hour +"시"+ minus+"분");

    }
}
