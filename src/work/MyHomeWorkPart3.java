package work;

public class MyHomeWorkPart3 {
    public static void main(String[] args) {
        //6)(***) ������� ������ ������ �����
        String text = "��� ��� � ����� ������ StringBuffer ���������������� ������� \"Java\", �� ��� ������� ���������� " +
                "4 + 16 = 20 ��������. ����� �� ����������� ������� ������ � ������� ������ strBuffer";
        String[] mass = text.split(" ");
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 == 0) {
                System.out.print(mass[i] + " ");
            } else {
            }
        }
    }
}
