package work;

public class MyHomeWorkPart3 {
    public static void main(String[] args) {
        //6)(***) вывести каждое второе слово
        String text = "Так как в самом начале StringBuffer инициализируется строкой \"Java\", то его емкость составляет " +
                "4 + 16 = 20 символов. Затем мы увеличиваем емкость буфера с помощью вызова strBuffer";
        String[] mass = text.split(" ");
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 == 0) {
                System.out.print(mass[i] + " ");
            } else {
            }
        }
    }
}
