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
}
