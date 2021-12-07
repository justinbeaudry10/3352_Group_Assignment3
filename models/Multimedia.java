package models;

import java.util.Date;

//Class is used as a base for a multimedia page element.
public class Multimedia {
    //Variable Declaration
    String url;
    String author;
    Date date;

    //Multimedia element class constructor
    public Multimedia(String url, String author, Date date)
    {
        this.url = url;
        this.date = date;
        this.author = author;
    }
}
