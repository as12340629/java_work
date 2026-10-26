import bank.Bank;

public class Main {
    static void main(String[] args) {
        String bankName = Bank.BANK_NAME;

//## STEP 3. 첫 손님 등장

        int conNumber = 1; // 고객 번호
        String conName = "홍길동"; // 고객 이름
        int conAge = 25; // 고객 나이
        boolean conVip = false; // VIP 여부
        String conRate = "B"; // 고객등급
        int conBalance = 0; // 잔액
        int conSalary = 0; // 급여
        int number = Bank.guestCount + conNumber; // 고객번호
        Bank.guestCount++; //고객수


//## STEP 4. 번호표 뽑기
        int muNumber = 100; // 기계의 현재 번호
        int nextNumber = muNumber + number; // 다음대기번호 (번호표 + 고객번호)
        String notice = (muNumber % 2 == 0) ? "1번 창구" : "2번 창구"; // 짝수 1번창구 홀수 2번창구

        //STEP 5. 입금과 출금
        int input = 50_000; // 입금 금액
        int totalBalance = conBalance + input; // 입금 후 잔액
        int output = 12_500; //출금 금액
        int total = totalBalance - output - Bank.FEE; // 출금후 남은금액(출금 금액+수수료)
        int changeCount = Bank.workCount + 1; // 거래건수

        // STEP 6. 이자 지급
        // 이자
        double realTotal = total + (total * Bank.BONUS_RATE); // 이자 지급후 잔액

        //STEP 7. 대출 상담
        String loan = (conAge >= 19) && (realTotal >= 30000) ? "true" : "false";
        // 대출 가능 여부
        String prefer = (conSalary > 0) && (realTotal > (conSalary * 2)) ? "true" : "false";
        //우대 사항

        //STEP 8. 현금 인출기
        // 1. 만원권 , 잔액 realTotal
        // 38110 / 10000 -> 몫3, 나머지 8100
        double count_10000 = realTotal / 10000; //몫 만원
        realTotal = realTotal % 10000;
        double count_1000 = realTotal / 1000; //몫 천원
        realTotal = realTotal % 1000;
        double count_100 = realTotal / 100; //몫 백원
        realTotal = realTotal % 100;

        //STEP 9. 두 번째 손님
        Bank.guestCount++;


        String endList = """
                ==== %s ====
                고객번호 : %d/ 이름 : %s / 나이 : %d 세 /등급 : %s
                내 번호표 :%d , 다음대기번호 :  %d
                안내 : %s
                입금 후 잔액 : %,d 원
                출금 수수료 : %,d 원
                출금 후 잔액 : %,d 원
                이자 : %.2f
                이자 지급 후 잔액 :  %,d 원
                대출 가능 : %s
                우대 대상 : %s
                만원권 %,d 장, 천원권 %,d 장, 백원 %,d 개, 남은 금액 
                오늘의 총 고객 수 :%d 명  , 거래 건수 : %d 건
                
                """.formatted(bankName, number, conName, conAge,
                conRate, muNumber, nextNumber, notice, totalBalance, Bank.FEE,
                total, Bank.BONUS_RATE, (int) realTotal, loan, prefer,
                (int) count_10000, (int) count_1000, (int) count_100, Bank.guestCount, changeCount);
        System.out.println(endList);
    }
}
