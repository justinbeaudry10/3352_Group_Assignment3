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

    //Comment getter
    public String getCommentString() {
        return commentString;
    }

    //Comment setter
    public void setCommentString(String commentString) {
        this.commentString = commentString;
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
