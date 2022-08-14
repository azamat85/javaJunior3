package lesson4;

public class Ture {
    public static void getCountry(String[][] mass, String country) {
        for (int i = 0; i < mass.length; i++) {
            System.out.printf(
                    (mass[i][0] == country ?
                            "Страна %s, стоимость%s,добираться%s,кормят%s\n" : ""),
                    mass[i][0], mass[i][1], mass[i][2], mass[i][3], mass[i][4]
            );

        }
    }

    public static void getCountry(String[][] mass, String country, int max) {
        for (int i = 0; i < mass.length; i++) {

            if (Integer.parseInt(mass[i][1]) < max)
                System.out.printf(
                        (mass[i][0] == country ?
                                "Страна %s, стоимость%s,добираться%s,кормят%s\n" : ""),
                        mass[i][0], mass[i][1], mass[i][2], mass[i][3], mass[i][4]
                );

        }
    }
    public static void getCountry(String[][] mass, String country, int max,int min) {
        for (int i = 0; i < mass.length; i++) {

            if (Integer.parseInt(mass[i][1])>min&&
            Integer.parseInt(mass[i][1])<max)
                System.out.printf(

                        (mass[i][0] == country ?
                                "Страна %s, стоимость%s,добираться%s,кормят%s\n" : ""),
                        mass[i][0], mass[i][1], mass[i][2], mass[i][3], mass[i][4]
                );

        }
    }
}
