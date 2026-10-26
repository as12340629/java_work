import java.util.Scanner;

public class Ex02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 수를 입력하시오.");
        int a = sc.nextInt();

        System.out.println("두번째 수를 입력하시오.");
        int b = sc.nextInt();

        System.out.println("첫번째 수 : "+ a +" / 두번째 수 : "+b);

        int x = a; //a 랑 b를 바꿀려면 a값을 보관할 x가 필요하다
        a = b; // x에 보관을 했으면 b를 a에다가 대입한다
        b = x; // a==b가 되었으니 보관했던 x를 다시 b에 대입한다.
        System.out.println("첫번째 수 : "+ a + " / 두번째 수 : "+b);


    }
}
