import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Fariz Muhamad Ibnu Hisyam
 * @version 1.0
 * @since 2022 - 02 - 18
 */

public class Soal1 {
    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);
        String input = Keyboard.nextLine();
        /* Memisahkan string menjadi token jika terdapat
        spasi, "!", ",", "?", ".", "_", "'", dan "@".
         */
        String[] array = input.trim().split(("[ !,?._'@]+"));
        // Membuat sebuah ArrayList yang akan menampung string pada list
        ArrayList<String> token = new ArrayList(Arrays.asList(array));
        System.out.println(token.size());

        for(String result : token) {
            System.out.println(result);
        }
    }
}

