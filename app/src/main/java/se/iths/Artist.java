package se.iths;

import java.util.ArrayList;
import java.util.Collection;

public class Artist {

    private final long id;
    private String name;
    public Collection<Album> albums;

    public Artist(long id, String name){
        this.id = id;
        this.name = name;
        albums = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbums() {
        String printString=this.name + "\n";
        for (Album album : albums) {
            printString += " " + album + "\n";
        }

        return printString;
    }

    public String toString(){
        return String.format("%d %s", id, name);
    }

    public void add(Album album) {
        albums.add(album);
    }

}
