import java.util.Scanner;

public class datatypes {
        public static void main(String []args)
        {
            Scanner Keyboard = new Scanner(System.in);
            int T=Keyboard.nextInt();

            for(int i=0; i<T; i++)
            {
                try
                {
                    long n=Keyboard.nextLong();
                    System.out.println(n+" can be fitted in: ");
                    if(n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                        System.out.println("* byte");
                    }
                    if(n >= Short.MIN_VALUE && n <= Short.MAX_VALUE){
                        System.out.println("* short");
                    }
                    if(n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE){
                        System.out.println("* int");
                    }
                    if(n >= Long.MIN_VALUE && n <= Long.MAX_VALUE){
                        System.out.println("* long");
                    }
                }
                catch(Exception e)
                {
                    System.out.println(Keyboard.next()+" can't be fitted anywhere.");
                }

            }
        }
}

