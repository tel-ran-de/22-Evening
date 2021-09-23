
public class MathOperations {
    public static void main(String[] args) {
/*        plus();
        concatenation();*/
//        minus();
        multiply();
    }

    public static void minus() {
        int a, b, c;
        a = 10;
        b = 20;
        c = a - b;
        System.out.println(c);
        // = знак присваивания
        // == знак равно, равняется
        c = c - 1;
        c--;
        --c;
        c -= 1;
        System.out.println(c);
    }

    public static void concatenation() {
        System.out.println("Слово Один" + "Слово два");
    }

    public static void plus() {
        int a, b, c;
        a = 6;
        b = 7;
        c = a + b;
        c = c + 1;
        c++;
        c += 2;
        ++c;
        System.out.println(c);
    }

    public static void multiply() {
        int a, b, c;
        a = 2;
        b = 3;
        c = a * b;
        c = c *2;
        System.out.println(c);
        c *= 2;
        System.out.println(c);
    }

}
