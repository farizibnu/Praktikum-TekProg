import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author Fariz Muhamad Ibnu Hisyam
 * @version 1.0
 * @since 2022 - 02 - 20
 */

public class Soal5 {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        String plat = Keyboard.nextLine();

        StringTokenizer strTokens;
        strTokens = new StringTokenizer(plat);
        String angka = "";
        Long bilangan;
        Long hitung;

        while(strTokens.hasMoreTokens()){
            angka = angka + strTokens.nextToken();
        }

        //Perhitungan untuk menentukan status keadaan mobil
        bilangan = Long.parseLong(angka);
        hitung = (bilangan - 999999) % 5;

        if(hitung == 0){
            System.out.println("jalan");
        }
        else{
            System.out.println("berhenti");
        }
    }
}
