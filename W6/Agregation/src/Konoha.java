import java.io.*;
import java.util.*;

class Konoha {
    String konohagakure;
    private List<Clan> clan;
    Konoha(String konohagakure, List<Clan> clan)
    {
        this.konohagakure = konohagakure;
        this.clan = clan;
    }

    public int getTotalAnggotaClanDiKonoha()
    {
        int jumlahAnggotaClan = 0;
        List<AnggotaClan> shinobi;
        for(Clan dept : clan)
        {
            shinobi = dept.getShinobi();
            for(AnggotaClan s : shinobi)
            {
                jumlahAnggotaClan++;
            }
        }
        return jumlahAnggotaClan;
    }
}
