package work;

public class MyHomeWork3Part1 {
    public static void main(String[] args) {
        int[][] mass = new int[5][5];
        int length = mass.length - 1;
        int n = mass.length / 2;
//        for (int i = 0; i < mass.length; i++) {
//            for (int j = 0; j < mass[i].length; j++) {
//                if (i == j) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }
//        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {

                if (i + j == length) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {

                if (i != n && j != n) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {

                if ((i-j)%2==0) {
                    System.out.print("0 ");
                }  else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
