import java.util.Scanner;

/**
 * @author Fariz Muhamad Ibnu Hisyam
 * @version 1.0
 * @since 2022 - 02 - 19
 */

public class Soal3 {
    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);
        int num1 = Keyboard.nextInt();
        char operator = Keyboard.next().charAt(0);
        int num2 = Keyboard.nextInt();

        switch (operator) {
            // Jika operatornya adalah "+" maka akan dilakukan penjumlahan
            case '+':
                int result = num1 + num2;
                System.out.println(result);
                break;

            // Jika operatornya adalah "-" maka akan dilakukan pengurangan
            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;

            // Jika operatornya adalah "*" maka akan dilakukan perkalian
            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;

            // Jika operatornya adalah "/" maka akan dilakukan pembagian
            case '/':
                result = num1 / num2;
                System.out.println(result);
                break;

            // Jika operatornya adalah "%" maka akan dilakukan operasi modulus
            case '%':
                result = num1 % num2;
                System.out.println(result);
                break;
        }
    }
}
