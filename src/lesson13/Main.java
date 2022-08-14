package lesson13;

import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C://java/ip.txt");
            int i;
            String result = "";
            while ((i = fin.read()) != -1) {
                if (i == 13) {
                    continue;
                }else if(i==10){
                   String ip =result.split(":")[0];
                   int port = Integer.parseInt(result.split(":")[1]);
                   chekProxy(ip,port);
                   result = "";

                }
                else if (i == 9) {
                    result += ":";
                } else {
                    result += (char) i;
                }
            }
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void chekProxy(String ip, int port) {
        System.out.println("«апрос к северу с " + ip + ":" + port);
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip,port));
            URL url = new URL("https://vozhzhaev.ru/test.php");
            URLConnection connection= url.openConnection(proxy);
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            System.out.println("ip"+ip+"port"+port+"работает");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ip"+ip+"port"+port+" не работает");
        }

    }


//    public static void main(String[] args) {
//        String text = "Hello world \n ";
//        try {
//            FileOutputStream fos = new FileOutputStream("C://java/text.txt",true);
//            byte[] buffer = text.getBytes();
//            fos.write(buffer, 0, buffer.length);
//
//            System.out.println("The file has been written");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
