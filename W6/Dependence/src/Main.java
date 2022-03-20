import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args)
    {
        Manusia manusia1 = new Manusia("Dadang");
        Manusia manusia2 = new Manusia("Dudung");

        Makanan makanan1 = new Makanan("Baso");
        Makanan makanan2 = new Makanan("Nasi");

        System.out.print(manusia1.getManusia() + " memakan ");
        manusia1.Makan(makanan1);
        System.out.print(manusia2.getManusia() + " memakan ");
        manusia2.Makan(makanan2);
    }
}
