import java.util.Scanner;

/**
 * @author Fariz Muhamad Ibnu Hisyam
 * @version 1.0
 * @since 2022 - 02 - 18
 */

public class Soal2 {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        System.out.println("================================");
        for(int i=0; i<3; i++)
        {
            String str = Keyboard.next();
            int digit = Keyboard.nextInt();
            System.out.printf("%-15s%03d%n", str, digit);
            /* %-15s dipakai agar output integer dimulai pada string ke-16
             %03d dipakai agar output integer memiliki tiga digit,
             apabila belum maka akan berisi 0 untuk membentuk 3 digit
             */
        }
        System.out.println("================================");
    }
}

