package se.iths;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Album {

    private long albumId;

    private String title;



    public Album() {}

    public Album(long albumId, String title) {
        this.albumId = albumId;
        this.title = title;

    }

    public long getAlbumId() {
        return albumId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
