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
        //�������� ���������, ��������� �� ����� ��� ������������� ����� ������������������ 1000 1003 1006 1009 1012 1015 �.
//        for (int i = 1000; i <= 9999; i += 3) {
//            System.out.print(i + "\t");
//        }
        //�������� �� ����� ��� ����� ������������������ 2an-1�1, ��� a1=2, ������� ������ 10000.
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
         * �������� ������ �� ���� ������ ����� �� 2 �� 20 � �������� �������� ������� �� ����� ������� � ������, ������� ���� ������� �� ������� ��������, � ����� � ������� (������� ���� ������� �� ������� ������� ����� ������). ����� ��������� ������� ���������, ������ �� ����� �������.
         * 2 4 6 � 18 20
         * 2
         * 4
         * 6
         * �
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
         * �������� ������ �� ���� �������� ����� �� 1 �� 99, �������� ��� �� ����� � ������,
         * � ����� ���� �� ������ �������� �� ����� ���� � ������, �� � �������� ������� (99 97 95 93 � 7 5 3 1).
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
        String text = "��� ��� � ����� ������ StringBuffer ���������������� ������� \"Java\", �� ��� ������� ���������� " +
                "4 + 16 = 20 ��������. ����� �� ����������� ������� ������ � ������� ������ strBuffer";
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
//        System.out.println("���������� ������ ��� ������� � ������: " + result);
//        System.out.println("���������� ���������� ����: " + count2);
//        System.out.println(text.toUpperCase());
    }
}

