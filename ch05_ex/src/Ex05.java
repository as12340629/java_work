import java.util.Scanner;

public class Ex05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("24H로 입력하세요");
        System.out.println("현재 시간(시)을 입력하세요 : ");

        int hour = sc.nextInt();

        if (hour > 23) {
            System.out.println("시간을 정확하게 입력하세요"); return;
        } else if (hour >= 0) {
            System.out.println(hour + "시");
        } else {
            System.out.println("시간을 정확하게 입력하세요"); return;
        }

        System.out.println("현재 시간(분)을 입력하세요 : ");

        int min = sc.nextInt();
        if (min > 59) {
            System.out.println("시간을 정확하게 입력하세요"); return;
        } else if (min >= 0) {
            System.out.println(min + "분");
        } else {
            System.out.println("시간을 정확하게 입력하세요"); return;
        }

        System.out.println("요리 시간(분)을 입력하세요 : ");
        int time = sc.nextInt();

        if (time>=1000){
            System.out.println("시간이 너무 많습니다.");
        }else if (time>=0){
            System.out.println(time + "분");
        }else {
            System.out.println("시간을 정확하게 입력하세요.");
        }

        int timeHour = time/60; //요리 소요시간 60분법으로 나눔
        int timeMinute = time%60;

        System.out.println("요리 시간"+timeHour +" 시간 "+timeMinute+ " 분 ");

        hour = hour + timeHour; // 현재 시간에 요리시간(시) 더함
        min = min + timeMinute; //현재 시간에 요리 시간(분) 더함

        if (hour>=24 && min>=60){ // 더했을때 시간24시 이상,분 60분 이상
            hour=hour-23; min= min - 60;
        } else if (hour>=24 || min >=60){ // 더했을때 시간이 24시 이상 또는 분이 60분이상
            if (hour>=24){ // 더한 시간이 24시 이상
                hour=hour-23;
            }else { //더한 시간이 60분 이상 일때 시간에1을 더함
                hour=hour+1; min= min - 60;
            }
        }

        System.out.println(hour+"시"+min+"분");







    }
}
