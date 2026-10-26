package practice;

public class Practice04 {
    static void main(String[] args) {
        String drinkName = "아이브 에너지드링크";
        int valueDrink = 1500;
        int yourMoney = 2000;
        int change = yourMoney - valueDrink;
        boolean okay = (yourMoney >= valueDrink);
        String profile = """
                ===================
                                  자판기
                ===================
                음료          : %s
                가격          : %,d원
                투입금액    : %,d원
                구매가능    :
                거스름돈    : %,d원
                ===================
                """.formatted(drinkName, valueDrink, yourMoney,change);
        System.out.println(profile);
    }
}
