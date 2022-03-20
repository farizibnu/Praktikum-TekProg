import java.io.*;
import java.util.*;

class Manusia {
    private String manusia;

    Manusia(String manusia){
        this.manusia = manusia;
    }
    public void Makan(Makanan makanan){
        String ManusiaMakan = makanan.getMakanan();
        System.out.println(ManusiaMakan);
    }
    public String getManusia(){
        return this.manusia;
    }
}
