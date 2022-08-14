package work;

public class MyHomeWork1 {
    public static void main(String[] args) {
        /**
         * С помощью цикла For, напечатать на консоль:
         * 1) Только четные от -100 до -50
         */
        for (int i = -100; i <= -50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //2) Все числа в обратном порядке от 10 до 30
        for (int i = 30; i >= 10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //3) Кол-во четных чисел в диапазоне от 30 до 61
        int countChet = 0;
        for (int i = 30; i <= 61; i++) {
            if (i % 2 == 0) {
                countChet++;
            }
        }
        System.out.println("Кол-во четных чисел: " + countChet);
        //4) Посчитать сколько нужно лет, чтоб собрать сумму в 200т рублей, если откладывать ежемесячно по 9500т
        int month = 0;
        for (int vklad = 0; vklad <= 200000; vklad += 9500) {
            month++;
        }
        double years = (double) month / 12;
        System.out.println("Лет: " + Math.ceil(years));
        //5) Вывести на консоль все числа от 20 до 60, пропуская диапазон от 30 до 40 включительно
        for (int i = 20; i <= 60; i++) {
            if (i >= 30 && i <= 40) {
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
