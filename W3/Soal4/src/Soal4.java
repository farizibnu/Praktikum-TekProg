import java.util.Scanner;

/**
 * @author Fariz Muhamad Ibnu Hisyam
 * @version 1.0
 * @since 2022 - 02 - 19
 */

public class Soal4 {
    public static void main(String[] args) {
        int penjualan, gaji_diterima;
        int item = 50000;
        int gaji_pokok = 500000;

        Scanner Keyboard = new Scanner(System.in);
        penjualan = Keyboard.nextInt();

        // Untuk penjualan kurang dari 15
        if(penjualan < 15){
            gaji_diterima = gaji_pokok - (((15*item)-(penjualan*item))*15/100);
            System.out.println(gaji_diterima);
        } // Untuk penjualan lebih dari 40 sampai 80
        else if(penjualan >= 40 && penjualan <= 80){
            gaji_diterima = gaji_pokok + ((penjualan*item)*35/100);
            System.out.println(gaji_diterima);
        } // Untuk penjualan lebih dari 80
        else if(penjualan > 80){
            gaji_diterima = gaji_pokok + ((penjualan*item)/4);
            System.out.println(gaji_diterima);
        }
        else{ // Untuk penjualan 15 sampai kurang dari 40
            gaji_diterima = gaji_pokok + ((penjualan*item)/10);
            System.out.println(gaji_diterima);
        }
    }
}
