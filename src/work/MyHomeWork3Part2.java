package work;

public class MyHomeWork3Part2 {
    public static void main(String[] args) {
//        дл€ текста /*“ак как в самом начале StringBuffer инициализируетс€ строкой "Java", то его емкость составл€ет
//        4 + 16 = 20 символов. «атем мы увеличиваем емкость буфера с помощью вызова strBuffer */
//        1) посчитать количество букв без пробела
//        2) посчитать количество английских букв
//        3) все цифры заменить на звездочку (*)
//        4) после каждой точки или зап€той перходить на новую строчку
//        5)вывести все с заглавной буквы
//        6)(***) вывести каждое второе слово


//        String text = "“ак как в самом начале StringBuffer инициализируетс€ строкой \"Java\", то его емкость составл€ет " +
//                "4 + 16 = 20 символов. «атем мы увеличиваем емкость буфера с помощью вызова strBuffer";
//        int amount = text.length();
//        int count1 = 0;
//        int count2 = 0;
//        int result;
//        for (int i = 0; i < amount; i++) {    //        1) посчитать количество букв без пробела
//            if (text.charAt(i) == ' ') {
//                count1++;
//            }
//            //        2) посчитать количество английских букв
//            if (text.charAt(i) == 'S' || text.charAt(i) == 't' || text.charAt(i) == 'r' || text.charAt(i) == 'i' || text.charAt(i) == 'n'
//                    || text.charAt(i) == 'g' || text.charAt(i) == 'B' || text.charAt(i) == 'u' || text.charAt(i) == 'f' || text.charAt(i) == 'e'
//                    || text.charAt(i) == 'J' || text.charAt(i) == 'a' || text.charAt(i) == 'v' || text.charAt(i) == 's') {
//                count2++;
//            }
//            //        3) все цифры заменить на звездочку (*)
//            if (text.charAt(i) == '1' || text.charAt(i) == '2' || text.charAt(i) == '3' || text.charAt(i) == '4' || text.charAt(i) == '5'
//                    || text.charAt(i) == '6' || text.charAt(i) == '7' || text.charAt(i) == '8' || text.charAt(i) == '9' || text.charAt(i) == '0') {
//                System.out.print("*");
//            } else {
//                System.out.print(text.charAt(i));
//            }
//            //        4) после каждой точки или зап€той перходить на новую строчку
//            if (text.charAt(i) == '.' || text.charAt(i) == ',') {
//                System.out.println();
//            }
//
//        }
//        result = amount - count1; //        1) посчитать количество букв без пробела
//        System.out.println();
//        System.out.println(" оличество знаков без пробела в тексте: " + result);
//        System.out.println(" оличество английских букв: " + count2);
//        System.out.println(text.toUpperCase());  //        5)вывести все с заглавной бук
       String str1= new String("“ак как в самом");
       String str2 = "Java main 842";
       String[] strings= str2.split(" ");
       for (int i = 0; i < strings.length; i++){
           if (i%2==0){
               System.out.print(strings[i]+" ");
           } else {

           }

       }


    }
}
