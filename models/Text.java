package models;

import java.util.Date;

//Class is used as a base for a text page element.
public class Text {
    //Variable declaration
    String textString;
    String author;
    Date date;

    //Text element class constructor
    public Text(String text, String author, Date date)
    {
        this.textString = text;
        this.author = author;
        this.date = date;
    }

    public String getTextString() {
        return textString;
    }

    public void setTextString(String textString) {
        this.textString = textString;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
