package lesson1;

public class Main {
    public static void main(String[] args) {
        /**
         * Напечать на консоль какой ыид треугольника у пользователя
         * равнобедренный равносторонний или разносторонний
         */

        // управляющая конструкция if else
        int a = 7;
        int b = 4;
        int c = 5;
        if (a != b && b != c && c != a) {
            System.out.println("ЭТО РАЗНОСТОРОННИЙ ТРЕУГОЛЬНИК");
        } else if (a == b && b == c && c == a) {
            System.out.println("Это раносторонний треугольник");
        } else {
            System.out.println("Это равнобедренный треугольник");
        }

    }
}
