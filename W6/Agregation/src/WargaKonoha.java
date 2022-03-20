import java.io.*;
import java.util.*;

class WargaKonoha {
    public static void main (String[] args)
    {
        AnggotaClan s1 = new AnggotaClan("Naruto", 1, "Uzumaki");
        AnggotaClan s2 = new AnggotaClan("Boruto", 2, "Uzumaki");
        AnggotaClan s3 = new AnggotaClan("Itachi", 1, "Uchiha");
        AnggotaClan s4 = new AnggotaClan("Sasuke", 2, "Uchiha");

        List <AnggotaClan> clan_uzumaki = new ArrayList<AnggotaClan>();
        clan_uzumaki.add(s1);
        clan_uzumaki.add(s2);

        List <AnggotaClan> clan_uchiha = new ArrayList<AnggotaClan>();
        clan_uchiha.add(s3);
        clan_uchiha.add(s4);

        Clan Uzumaki = new Clan("Uzumaki", clan_uzumaki);
        Clan Uchiha = new Clan("Uchiha", clan_uchiha);
        List <Clan> clan = new ArrayList<Clan>();
        clan.add(Uzumaki);
        clan.add(Uchiha);

        Konoha konoha = new Konoha("Konoha", clan);
        System.out.print("Total shinobi di Konoha: ");
        System.out.print(konoha.getTotalAnggotaClanDiKonoha(
        ));
    }
}
