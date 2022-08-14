package lesson2;

public class Main2 {
    public static void main(String[] args) {
        /**
         * напечатать на консоль все числа от 30 до 60
         */
        for (int i =30; i<61; i++){
            System.out.println(i);
        }
        /**
         * Напечатать на консоль числа, в диапозоне от от 20 до 70, которые делятся на 5 и 6 без остатка
         */
        for(int i=20; i<71; i++){
            if( i%5==0 && i%6==0 ){
                System.out.println(i);

            }
        }
    }
}
