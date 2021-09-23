
public class MyLovelyLong {
    public static void main(String[] args) {
        // дублирование строки ctrl+ D
        myLongOne();
    }

    public static void myLongOne() {
        long l1 = 9223372036854775807L;
        long l2 = 9223372036854775807l; // Надо заменять на L
        long l3 = 9_223_372_036_854_775_807L;
        int price = 148_99;
        int veryInteresting = 1_2_3_4_5;
        int цена = 905783409; // так делать категорически нельзя
        System.out.println(veryInteresting);
        System.out.println(l1);
        System.out.println(l2);
    }


    public static void myLongTwo() {

    }

}
