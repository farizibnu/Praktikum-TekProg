package Soal2;

import java.util.Scanner;


class datatypes {
    public static void main(String []args)
    {
        //Berguna untuk memasukkan input pada program
        Scanner Keyboard = new Scanner(System.in);
        int T=Keyboard.nextInt();

        for(int i=0; i<T; i++)
        {
            try
            {
                long n=Keyboard.nextLong();
                System.out.println(n+" can be fitted in: ");
                if(n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");//Output akan menghasilkan *byte jika nilai berukuran -128 sampai 127
                }
                if(n >= Short.MIN_VALUE && n <= Short.MAX_VALUE){
                    System.out.println("* short");//Output akan menghasilkan *byte jika nilai berukuran -32,768 sampai 32,767
                }
                if(n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE){
                    System.out.println("* int");//Output akan menghasilkan *int jika nilai berukuran -2,147,483,648 sampai 2,147,483,647
                }
                if(n >= Long.MIN_VALUE && n <= Long.MAX_VALUE){
                    System.out.println("* long");//Output akan menghasilkan *long jika nilai berukuran -9,223,372,036,854,775,808 sampai 9,223,372,036,854,775,807
                }
            }
            catch(Exception e)
            {
                System.out.println(Keyboard.next()+" can't be fitted anywhere.");//Jika tidak memenuhi kondisi maka akan mendapatkan output seperti ini
            }

        }
    }
}