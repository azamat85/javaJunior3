package lesson2;

public class Main6 {
    public static void main(String[] args) {
        // ������� ������ ������� 10 ���������, ������������� �������
        //������ ������� �� �������� ������� ��� � ����� �����
        int [] number = {1,2,3,4,5,6,7,8,9,10};
        int countChet = 0;
        int countNeChet = 0;
        for(int i = 0; i< number.length;i++){
          if(number[i]%2==0){
              countChet++;
          }else {
              countNeChet++;
          }
        }
        System.out.println("������:"+countChet);
        System.out.println("��������:"+countNeChet);
    }
}
