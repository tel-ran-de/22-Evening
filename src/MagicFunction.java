
public class MagicFunction {
    public static void main(String[] args) {
        f1();
        // ctrl + alt + L
    }

    public static void f1() {
        f3();
    }

    public static void f2() {
        f4();
    }

    public static void f3() {
        f5();
    }

    public static void f4() {
        f6();
    }

    public static void f5() {
        f2();
    }

    public static void f6() {

    }
}
