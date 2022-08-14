package lesson2;

public class Main6 {
    public static void main(String[] args) {
        // Создать массив длинной 10 элементов, произвольными числами
        //Задача вывести на конслось сколько чет и нечет чисел
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
        System.out.println("Четных:"+countChet);
        System.out.println("Нечетных:"+countNeChet);
    }
}
