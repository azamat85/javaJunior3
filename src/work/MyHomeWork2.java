package work;


import java.util.Random;

public class MyHomeWork2 {
    public static void main(String[] args) {
        int[] mas = new int[100];
        Random happening = new Random();
        int countChet = 0;
        int countNeChet = 0;
        for (int i = 0; i < mas.length; i++) {      //массив заполняется случайными числами
            mas[i] = happening.nextInt(1001);
        }
        for (int i = mas.length - 1; i > 0; i--) { // Сравниваются элементы массива
            for (int a = 0; a < i; a++) {
                if (mas[a] > mas[a + 1]) {
                    int b = mas[a];
                    mas[a] = mas[a + 1];
                    mas[a + 1] = b;
                }
            }
            if (mas[i] % 2 == 0) {
                countChet++;
            } else {
                countNeChet++;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.println("Четных:" + countChet);
        System.out.println("Нечетных:" + countNeChet);
    }
}

