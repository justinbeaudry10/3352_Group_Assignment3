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

    public String getCommentString() {
        return commentString;
    }

    public void setCommentString(String commentString) {
        this.commentString = commentString;
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
