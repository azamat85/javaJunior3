package lesson1;

public class MyFirstProgramm {
    public static void main(String[] args) {
        int a = 12;
        int b = 10;
        int c = 7;
        int perimetr = a + b + c;
        System.out.println(perimetr);
        // напечать на консоль слово „≈“Ќќ≈  или Ќ≈„≈“Ќќ≈
        //  в зависимости от числа которое ввел пользователь
        int number = 10;
        int ostatok = number % 2;
        // 1 -не четное
        // 0 - четное
        boolean isChetnoe = ostatok == 0;
        System.out.println(isChetnoe);



    }
}
