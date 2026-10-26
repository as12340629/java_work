public static class MemoryEx {
    static int value = 50;
    int n2 = 100;
    int n3 = 200;
    void add() {
        int n1 = 1;
        System.out.println("add함수의 n1 : " + n1);
        //System.out.println("밖에 있는 n2 :"+ n2);
        int money = 0;
        if (true){
            int i = 10;
            System.out.println("i = " + i);
            money = money + 10000;
        }
        if (true){
            int i = 10;
            System.out.println("i = " + i);
            money = money + 20000;
        }
        System.out.println(money);
        // 이때 첫번째 i랑 두번째 i랑은 다른 i이다.
    }
    static void main(String[] args) {
        System.out.println("value = " + MemoryEx.value);
//        com.memory.MemoryEx.add();

        // 항상 new를 붙이자
        MemoryEx ex = new MemoryEx();
        System.out.println(ex.n3);
        System.out.println(ex.n2);
        ex.add();
    }
}

void main() {
}
