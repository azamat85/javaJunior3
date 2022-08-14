package lesson2;

public class Main7 {
    public static void main(String[] args) {
        /**
         * Есть массив чисел, самостоятельно их заполнить
         * Напечатать то что в массиве, через ячейку, в обратном порядке
         */
        int [] nunmbers = {2,3,4,5,67,78,56,56,1,10};
        for(int i = nunmbers.length-1;i>=1;i-=2){
            System.out.println(nunmbers[i]);
        }
    }
}
