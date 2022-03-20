import java.io.*;
import java.util.*;

class FindSong {
    public static void main (String[] args)
    {
        Song s1 = new Song("LOVE is", "ITZY");
        Song s2 = new Song("LAST WALTZ", "TWICE");
        Song s3 = new Song("Sweet Chaos", "DAY6");

        List<Song> songs = new ArrayList<Song>();
        songs.add(s1);
        songs.add(s2);
        songs.add(s3);

        Spotify spotify = new Spotify(songs);

        List<Song> sgs = spotify.getTotalSongInSpotify();
        for(Song sg : sgs){
            System.out.println("Title : " + sg.title + " from " +"Artist : " + sg.artist);
        }
    }
}
