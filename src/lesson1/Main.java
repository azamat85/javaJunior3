package lesson1;

public class Main {
    public static void main(String[] args) {
        /**
         * �������� �� ������� ����� ��� ������������ � ������������
         * �������������� �������������� ��� ��������������
         */

        // ����������� ����������� if else
        int a = 7;
        int b = 4;
        int c = 5;
        if (a != b && b != c && c != a) {
            System.out.println("��� �������������� �����������");
        } else if (a == b && b == c && c == a) {
            System.out.println("��� ������������� �����������");
        } else {
            System.out.println("��� �������������� �����������");
        }

    }
}
