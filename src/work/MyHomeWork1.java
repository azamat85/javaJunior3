package work;

public class MyHomeWork1 {
    public static void main(String[] args) {
        /**
         * � ������� ����� For, ���������� �� �������:
         * 1) ������ ������ �� -100 �� -50
         */
        for (int i = -100; i <= -50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //2) ��� ����� � �������� ������� �� 10 �� 30
        for (int i = 30; i >= 10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //3) ���-�� ������ ����� � ��������� �� 30 �� 61
        int countChet = 0;
        for (int i = 30; i <= 61; i++) {
            if (i % 2 == 0) {
                countChet++;
            }
        }
        System.out.println("���-�� ������ �����: " + countChet);
        //4) ��������� ������� ����� ���, ���� ������� ����� � 200� ������, ���� ����������� ���������� �� 9500�
        int month = 0;
        for (int vklad = 0; vklad <= 200000; vklad += 9500) {
            month++;
        }
        double years = (double) month / 12;
        System.out.println("���: " + Math.ceil(years));
        //5) ������� �� ������� ��� ����� �� 20 �� 60, ��������� �������� �� 30 �� 40 ������������
        for (int i = 20; i <= 60; i++) {
            if (i >= 30 && i <= 40) {
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
