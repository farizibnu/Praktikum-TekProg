import java.io.*;
import java.util.*;

class Spotify {
    private final List<Song> songs;
    Spotify (List<Song> songs)
    {
        this.songs = songs;
    }
    public List<Song> getTotalSongInSpotify(){
        return songs;
    }
}
