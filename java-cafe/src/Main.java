import cafe.Cafe;

public class Main {
    static void main(String[] args) {
        System.out.println("===="+ Cafe.CAFE_NAME +"===="); //카페이름
        String name; //이름
        int age;  //나이
        boolean sign; // 회원여부
        String rate; // 회원등급
        int money; // 지갑
        int stamp; // 스탬프
        int friend; //함께온 친구

        //STEP 3. 첫 손님
        name = "김자바"; //손놈이름
        age = 20; //손놈나이
        sign = true; //회원여부
        rate = "S"; //회원 등급
        money = 20_000; // 지갑
        stamp = 8; //스탬프 개수
        friend = 0; //친구 없음
        System.out.println("고객 : "+ name +"/ 나이 : "+ age + "/ 회원 : "
        + "/ 등급 : "+rate);

        //STEP 4. 주문번호 받기
        int number1 = 200; // 주문 번호 기계의 현재 번호는 200
        int number2 = number1+1; // 기계의 번호는 1증가
        System.out.println("내 주문번호 : "+ number1 +
                ", 다음 주문번호 : "+ number2); //주문번호 출력까지완료
        String nt =(number1%2 ==0)? "픽업대 A": "픽업대 B"; //주문번호 짝홀
        System.out.println("안내 : "+ nt); //안내완료

        //STEP 5. 주문하기
        int coffeeAM = 4_500; //커피 가격
        int cake = 6_800; // 케이크 가격
        int coffeeRate = 2; //커피 개수
        int orderCF = (coffeeAM*coffeeRate); //커피 2개시킴
        Cafe.orderCount=+2; // 주문수1
        Cafe.cupCount=+3; // 커피 판매수2

        //STEP 6. 할인과 결제
        boolean signTrue=(sign=true); //회원임
        double extra = (orderCF + cake)*Cafe.SALE_RATE; // 할인금액
        double price = (orderCF+cake)-((orderCF + cake)*Cafe.SALE_RATE);
        // 할인된 가격
        double money2 = (money - price); //남은 거스름돈
        System.out.println("주문 금액 : "+(orderCF+cake)+"원");//주문금액
        System.out.println("할인 금액 : "+ (int)extra+"원");
        System.out.println("결제 금액 : "+(int)price +"원");
        System.out.println("거스름돈 : "+ (int)money2+"원");

        //STEP 7. 거스름돈 내주기
        int money3 = (int) money2; //거스름돈 실수로 바꾸고 5,780원 남음
        int money3_1000 = (money3/1000); // 천원 나누고
        money3 = money3 % 1000;
        int money3_100 = (money3/100); // 백원 나누고
        money3 = money3 % 100;
        int money3_10 = (money3/10); // 십원 나누고
        money3 = money3 % 10;

        System.out.println("천원권 : "+ money3_1000
        +"장/ "+"백원 : "+money3_100+ "개/ " + "십원 : "+ money3_10
        + "개/ "+"남은 금액 : "+ money3+"원"); //거스름돈 내주고 남은금액 출력완료

        //STEP 8. 스탬프와 쿠폰
        int stampTotal = coffeeRate; // 커피 1잔당 스탬프 1개
        int stamp2 = stamp + stampTotal;  // 토탈 스탬프
        String freeCoffee = (signTrue=true)&&(stamp2>=10)? "true": "false";
        // 회원이고 스탬프가 10개 이상
        String dutchPay = (friend<=0)||(price/friend >5000)? "true" : "false";
        //함께 온 친구가 0명이 아니고, 결제 금액을 친구 수로 나눈 값이 5,000원 이상인 경우
        System.out.println("스탬프 : "+stamp2 + "개");
        System.out.println("무료 음료 쿠폰 : " + freeCoffee);
        System.out.println("더치 페이 대상 : "+ dutchPay);
        System.out.println("오늘의 주문 : "+Cafe.orderCount+"건"
        +"/  판매 잔 수 : "+Cafe.cupCount + "잔");

    }
}
