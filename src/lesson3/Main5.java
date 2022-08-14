package lesson3;

public class Main5 {
    public static void main(String[] args) {
        String s = "123";
        int i = s.length();
        System.out.println(i);


        char c =s.charAt(2);
        System.out.println(c);
        for (int j = 0 ; j <
                s.length();j++){
            if(s.charAt(j)=='2'){
                System.out.println("двойка");
            } else {
                System.out.println(s.charAt(j));
            }
        }
    }
}
