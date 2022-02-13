import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);
        String A = Keyboard.next();
        String B = Keyboard.next();
        System.out.println(A.length()+B.length());//Menampilkan jumlah panjang dari gabungan string A dan string B

        int length = A.compareTo(B);
        if(length>0){
            System.out.println("Yes");//Apabila secara lexicographically string A lebih besar dari string B
        }
        else{
            System.out.println("No");//Apabila secara lexicographically string B lebih besar dari string A
        }

        String stringA = A.substring(0,1).toUpperCase()+A.substring(1);//Mengubah huruf awal dari string A menjadi huruf kapital
        String stringB = B.substring(0,1).toUpperCase()+B.substring(1);;//Mengubah huruf awal dari string B menjadi huruf kapital
        System.out.println(stringA+" "+stringB);//Menggabungkan string A dan string B serta menambahkan spasi diantaranya
    }
}
