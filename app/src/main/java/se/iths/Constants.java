package se.iths;

public class Constants {

    public static final String SQL_SELECT_ALL_ARTISTS = "SELECT ArtistId, Name FROM Artist";
    public static final String SQL_COL_ALBUM_ID = "AlbumId";
    public static final String SQL_COL_ALBUM_TITLE = "Title";
    public static final String SQL_COL_ARTIST_ID = "ArtistId";
    public static final String SQL_COL_ARTIST_NAME = "name";
    public static final String SQL_COL_SONG_ID = "TrackId";
    public static final String SQL_COL_SONG_NAME = "Track.name";
    public static final String SQL_SELECT_ALL_ARTISTS_WITH_ALBUMS = "SELECT ArtistId, AlbumId, Name, Title FROM Artist JOIN Album USING (ArtistId) ORDER BY ArtistId";
    public static final String SQL_SELECT_ALL_CUSTOMERS = "SELECT * FROM Customer ORDER BY CustomerId";
    public static final String SQL_COL_CUSTOMER_ID = "CustomerId";
    public static final String SQL_COL_CUSTOMER_FIRSTNAME = "FirstName";
    public static final String SQL_COL_CUSTOMER_LASTNAME = "LastName";
    public static final String SQL_COL_CUSTOMER_PHONE = "Phone";
    public static final String SQL_COL_CUSTOMER_EMAIL = "Email";
    public static final String SQL_SELECT_ALL_ARTISTS_WITH_ALBUMS_AND_SONGS = "SELECT ArtistId, AlbumId, TrackId, Artist. Name, Title, Track.Name FROM Artist JOIN Album USING (ArtistId) JOIN Track USING (AlbumId) ORDER BY ArtistId";

}
