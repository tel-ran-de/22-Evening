/*
Это один из вариантов комментариев.
 */
// Это однострочный комментарий

/**
 * Документация к программе, детали когда нибудь
 */
public class HelloInteger {
    public static void main(String[] args) {
        myFirstFunction(); // здесь происходит вызов метода/функции

        mySecondFunction();
    }

    public static void myFirstFunction() {
        System.out.println("Hello Function");

        myThirdFunction();
    }

    public static void mySecondFunction() {
        System.out.println("Привет мой второй метод");
    }

    public static void myThirdFunction() {
        System.out.println("Привет третий метод");
    }
}
