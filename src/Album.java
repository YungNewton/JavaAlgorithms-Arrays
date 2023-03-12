import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
    public boolean addSong(String name, double duration){
        if (findSong(name)==null){
            songs.add(new Song(name,duration));
            return true;
        }else {
            return false;
        }
    }
    private Song findSong(String name){
        for (Song it: this.songs){
            if (it.getTitle().equals(name)){
                return it;
            }
        }
        return null;
    }
    public boolean addToPlayList(int tracker,LinkedList<Song> playlist){
        int i = tracker-1;
        if ((i>=0)&&(i<=this.songs.size())){
            playlist.add(this.songs.get(i));
            return true;
        }else {
            return false;
        }
    }
    public boolean addToPlayList(String name, LinkedList<Song> playlist){
        Song it = findSong(name);
        if (it == null){
            return false;
        }else {
            playlist.add(it);
            return true;
        }
    }
}
