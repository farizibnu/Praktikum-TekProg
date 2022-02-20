import java.util.Scanner;
import java.math.*;

/**
 * @author Fariz Muhamad Ibnu Hisyam
 * @version 1.0
 * @since 2022 - 02 - 19
 */

public class Soal6 {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        BigInteger a = Keyboard.nextBigInteger();
        BigInteger b = Keyboard.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
