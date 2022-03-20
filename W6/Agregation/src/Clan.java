import java.io.*;
import java.util.*;

class Clan {
    String nama;
    private List<AnggotaClan> shinobi;
    Clan(String nama, List<AnggotaClan> shinobi)
    {
        this.nama = nama;
        this.shinobi = shinobi;
    }
    public List<AnggotaClan> getShinobi()
    {
        return shinobi;
    }
}
