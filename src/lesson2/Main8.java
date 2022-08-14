package lesson2;

public class Main8 {
    public static void main(String[] args) {
        /**
         * ≈сть массив символов, наполним его сами
         * вывести на консоль только гласные с массива
         */
        char [] chars = {'r','u','p','v','c','j','q','e','y','r',};
       for(int i = 0; i< chars.length; i++){
           if(chars[i]=='u'||chars[i]=='e'||chars[i]=='y'){
               System.out.println(chars[i]);

           }
       }
    }
}
