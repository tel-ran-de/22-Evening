public class HelloBoolean {
    public static void main(String[] args) {
//        helloOne();
        helloTwo();
    }

    public static void helloOne() {
        int roomTemp = 21, conditionTemp = 22;

        boolean bool = (roomTemp > conditionTemp);

        System.out.println(bool);
    }

    public static void helloTwo() {
        boolean a = (7 + 8) * 5 > 7 + 8 * 5;


        boolean b = (7 + 8) * 4 != 7 + 4 * 5;



        boolean c = 3 + 4 > 9 + 1 && 16 - 5 > 3 * 4;  // false && false



        boolean d = 16 / 2 < 6 + 2 || 4 + 5 <= 4 * 5;  // false || true


        boolean e = !(3 * 4 < 7 + 8);

        System.out.println(a); // ожидаем тру
        System.out.println(b); // ожидаем тру
        System.out.println(c); // ожидаем false
        System.out.println(d); // ожидаем тру
        System.out.println(e); // ожидаем true  // false
    }
}
