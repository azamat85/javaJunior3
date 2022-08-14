package work;

public class Main1 {
    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("3 * " + i + " =" + i * 3);
//        }
//        int numbers=5;
//        int sum = 0;
//        for (int i = 0; i<=numbers; i++){
//           sum = i+sum;
//        }
//        System.out.println(sum);
        //—оздайте программу, вывод€щую на экран все четырЄхзначные числа последовательности 1000 1003 1006 1009 1012 1015 Е.
//        for (int i = 1000; i <= 9999; i += 3) {
//            System.out.print(i + "\t");
//        }
        //¬ыведите на экран все члены последовательности 2an-1Ц1, где a1=2, которые меньше 10000.
//        for (int a= 2; a<=1000;a=a*2-1){
//            System.out.println(a);
//        }
//        int number = 5;
//        int a;
//        for (int i = number; i > 0; i--) {
//            a = number%i;
//            if (a==0) {
//                System.out.println(i);
//            }
//        }
        /**
         * —оздайте массив из всех чЄтных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, отдел€€ один элемент от другого пробелом, а затем в столбик (отдел€€ один элемент от другого началом новой строки). ѕеред созданием массива подумайте, какого он будет размера.
         * 2 4 6 Е 18 20
         * 2
         * 4
         * 6
         * Е
         */
//        int a = 0;
//        for (int i = 2; i <= 10; i++) {
//            if (i % 2 == 0) {
//                a++;
//            }
//        }
//        int[] numbers = new int[a];
//        for (int i = 2, b = 0; i <= 10; i++) {
//            if (i % 2 == 0) {
//                numbers[b] = i;
//                System.out.println(numbers[b]);
//            }
//        }
        /**
         * —оздайте массив из всех нечЄтных чисел от 1 до 99, выведите его на экран в строку,
         * а затем этот же массив выведите на экран тоже в строку, но в обратном пор€дке (99 97 95 93 Е 7 5 3 1).
         */
//        int a = 0;
//        for (int i = 1; i <= 99; i++) {
//            if (i % 2 == 0) {
//            } else {
//                a++;
//            }
//        }
//        int[] numbers = new int[a];
//        for (int i = 99, b = 0; i >= numbers.length; i--) {
//            if (i % 2 == 0) {
//            } else {
//                numbers[b] = i;
//                System.out.print(numbers[b] + " ");
//            }
//        }
        String text = "“ак как в самом начале StringBuffer инициализируетс€ строкой \"Java\", то его емкость составл€ет " +
                "4 + 16 = 20 символов. «атем мы увеличиваем емкость буфера с помощью вызова strBuffer";
        int amount = text.length();
        int count1 = 0;
        int count2 = 0;
        int result;
        for (int i = 0; i < amount; i++) {
            if (text.charAt(i) == ' ') {
                count1++;
            }
            if (text.charAt(i) == 'S' || text.charAt(i) == 't' || text.charAt(i) == 'r' || text.charAt(i) == 'i' || text.charAt(i) == 'n'
                    || text.charAt(i) == 'g' || text.charAt(i) == 'B' || text.charAt(i) == 'u' || text.charAt(i) == 'f' || text.charAt(i) == 'e'
                    || text.charAt(i) == 'J' || text.charAt(i) == 'a' || text.charAt(i) == 'v' || text.charAt(i) == 's') {
                count2++;
            }
//            if (text.charAt(i) == '1' || text.charAt(i) == '2' || text.charAt(i) == '3' || text.charAt(i) == '4' || text.charAt(i) == '5'
//                    || text.charAt(i) == '6' || text.charAt(i) == '7' || text.charAt(i) == '8' || text.charAt(i) == '9' || text.charAt(i) == '0') {
//                System.out.print("*");
//            } else {
//                System.out.print(text.charAt(i));
//            }
//            if (text.charAt(i) == '.' || text.charAt(i) == ',') {
//                System.out.println();
//            }
            if(text.charAt(i) == ' '){

            } else {
                System.out.print(text.charAt(i));
            }

        }
//        result = amount - count1;
//        System.out.println();
//        System.out.println(" оличество знаков без пробела в тексте: " + result);
//        System.out.println(" оличество английских букв: " + count2);
//        System.out.println(text.toUpperCase());
    }
}

