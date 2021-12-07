package models;
import java.util.Date;

//Class is used as a base for a comment page element.
public class Comment {
    //Variable declaration
    String commentString;
    String author;
    Date date;

    //Comment element class constructor
    public Comment(String commentText, String author, Date date)
    {
        this.commentString = commentText;
        this.author = author;
        this.date = date;
    }
}
