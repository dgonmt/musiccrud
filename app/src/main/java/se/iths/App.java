/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package se.iths;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;


import static se.iths.Constants.*;

public class App {

    static Collection<Artist> artists;
    static Collection<Customer> customers;


    public static void main(String[] args) {

        App app = new App();
        app.load();

        for (Artist artist : artists) {
            System.out.println(artist.getAlbums());
        }


    }

    private void load() {

        artists = loadArtists();
        customers = loadCustomers();

    }

    private void printCollection(Collection<?> collection) {
        for (Object o : collection) {
            System.out.println(o);
        }
    }



    private Collection<Artist> loadArtists() {
        Collection<Artist> artists = new ArrayList<>();
        Configuration config = new Configuration();
        Connection connection = null;
        ResultSet resultSet = null;
        long oldId = -1;
        Artist artist = null;
        try {

            connection = DriverManager.getConnection(config.getDbUrl(), config.getDbUser(), config.getDbPassword());
            resultSet = connection.createStatement().executeQuery(SQL_SELECT_ALL_ARTISTS_WITH_ALBUMS);

            while (resultSet.next()) {
                long id = resultSet.getLong(SQL_COL_ARTIST_ID);
                String name = resultSet.getString(SQL_COL_ARTIST_NAME);
                long albumId = resultSet.getLong(SQL_COL_ALBUM_ID);
                String title = resultSet.getString(SQL_COL_ALBUM_TITLE);

                if (id != oldId) {
                    artist = new Artist(id, name);
                    artists.add(artist);
                    oldId = id;
                }
                artist.add(new Album(albumId, title));

            }

        } catch (SQLException e) {
            System.err.println(String.format("Fel vid läsning av databas:%s", e.toString()));
        } finally {
            try {
                resultSet.close();
            } catch (Exception ignore) {
            }
            try {
                connection.close();
            } catch (Exception ignore) {

            }
        }

        return artists;
    }

    private Collection<Customer> loadCustomers() {
        Collection<Customer> customers = new ArrayList<>();
        Configuration config = new Configuration();
        Connection connection = null;
        ResultSet resultSet = null;
        long oldId = -1;
        Customer customer = null;
        try {

            connection = DriverManager.getConnection(config.getDbUrl(), config.getDbUser(), config.getDbPassword());
            resultSet = connection.createStatement().executeQuery(SQL_SELECT_ALL_CUSTOMERS);

            while (resultSet.next()) {
                long id = resultSet.getLong(SQL_COL_CUSTOMER_ID);
                String firstName = resultSet.getString(SQL_COL_CUSTOMER_FIRSTNAME);
                String lastName = resultSet.getString(SQL_COL_CUSTOMER_LASTNAME);
                String phoneNumber = resultSet.getString(SQL_COL_CUSTOMER_PHONE);
                String emailAdress = resultSet.getString(SQL_COL_CUSTOMER_EMAIL);

                if (id != oldId) {
                    customer = new Customer(id, firstName, lastName, phoneNumber, emailAdress);
                    customers.add(customer);
                    oldId = id;
                }


            }

        } catch (SQLException e) {
            System.err.println(String.format("Fel vid läsning av databas:%s", e.toString()));
        } finally {
            try {
                resultSet.close();
            } catch (Exception ignore) {
            }
            try {
                connection.close();
            } catch (Exception ignore) {
            }
        }

        return customers;
    }





}
