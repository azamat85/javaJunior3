package work;

import java.util.Random;

public class MyHomeWorkPart2 {
    public static void main(String[] args) {
        int[] mas = new int[100];
        int countChet = 0;
        int countNeChet = 0;
        for (int i = 10; i < mas.length; i++) {
            Random r = new Random();
            mas[i] = r.nextInt(1001);
            int count;
            do {
                count = 0;
                for (int a = 0; a < mas.length - 1; a++) {
                    if (mas[a] > mas[a + 1]) {
                        int b = mas[a];
                        mas[a] = mas[a + 1];
                        mas[a + 1] = b;
                        count++;
                    }
                }
            } while (count > 0);
            System.out.print(mas[i] + " ");
            if (mas[i] % 2 == 0) {
                countChet++;
            } else {
                countNeChet++;
            }
        }
        for (int i = 10; i < mas.length; i++){
            System.out.print(mas[i]);
        }
        System.out.println();
        System.out.println("Четных:" + countChet);
        System.out.println("Нечетных:" + countNeChet);
    }
}
