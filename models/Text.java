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

    //TextString getter
    public String getTextString() {
        return textString;
    }

    //TextString setter
    public void setTextString(String textString) {
        this.textString = textString;
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
