package lesson2;

public class Main2 {
    public static void main(String[] args) {
        /**
         * ���������� �� ������� ��� ����� �� 30 �� 60
         */
        for (int i =30; i<61; i++){
            System.out.println(i);
        }
        /**
         * ���������� �� ������� �����, � ��������� �� �� 20 �� 70, ������� ������� �� 5 � 6 ��� �������
         */
        for(int i=20; i<71; i++){
            if( i%5==0 && i%6==0 ){
                System.out.println(i);

            }
        }
    }
}
