package models;
import java.util.Date;

public class Comment {
    //Variable declaration
    String commentText;
    String author;
    Date date;

    //Comment constructor
    public Comment(String commentText, String author, Date date)
    {
        this.commentText = commentText;
        this.author = author;
        this.date = date;
    }
}
