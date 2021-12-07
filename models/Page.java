package models;

import java.util.ArrayList;

public class Page extends Subject {

    //Holds a reference to comments, multimedia and text on the page
    ArrayList<Comment> comments = new ArrayList<>();
    ArrayList<Multimedia> medias = new ArrayList<>();
    ArrayList<Text> texts = new ArrayList<>();

    //Constructor
    public Page() {

    }

    //Add comment
    public void addComment(Comment comment) {
        comments.add(comment);
    }

    //Add media
    public void addMedia(Multimedia multimedia) {
        medias.add(multimedia);
    }

    //Add text
    public void addText(Text text) {
        texts.add(text);
    }

    //Edit comment
    public void editComment(Comment comment, String text) {
        int index = comments.indexOf(comment);
        comments.get(index).setCommentString(text);
    }

    //Edit media
    public void editMedia(Multimedia media, String url) {
        int index = medias.indexOf(media);
        medias.get(index).setUrl(url);
    }

    //Edit text
    public void editText(Text text, String textStr) {
        int index = texts.indexOf(text);
        texts.get(index).setTextString(textStr);
    }

    //Show comments
    public void showComments() {
        // Method loads array of page's comments
    }

    //Show media
    public void showMedia() {
        // Method loads array of page's media
    }

    //Show text
    public void showText() {
        // Method loads array of page's texts
    }
}
