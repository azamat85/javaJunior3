package workPart1;

public class Processing {
    public static void analysis(String email) {
        int count1 = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                count1++;
            }
        }
        if (count1==1){

        } else {
            System.out.println("Что-то введено не правильно!!!");
        }
    }


}


