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

    //URL getter
    public String getUrl() {
        return url;
    }

    //URL Setter
    public void setUrl(String url) {
        this.url = url;
    }

    //Author getter
    public String getAuthor() {
        return author;
    }

    //Author setter 
    public void setAuthor(String author) {
        this.author = author;
    }

    //Date getter 
    public Date getDate() {
        return date;
    }

    //Date setter
    public void setDate(Date date) {
        this.date = date;
    }
}
