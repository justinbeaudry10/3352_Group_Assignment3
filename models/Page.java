package models;

import java.util.ArrayList;

public class Page extends Subject {

    ArrayList<Comment> comments = new ArrayList<>();
    ArrayList<Multimedia> medias = new ArrayList<>();
    ArrayList<Text> texts = new ArrayList<>();

    public Page() {

    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void addMedia(Multimedia multimedia) {
        medias.add(multimedia);
    }

    public void addText(Text text) {
        texts.add(text);
    }

    public void editComment(Comment comment, String text) {
        int index = comments.indexOf(comment);
        comments.get(index).setCommentString(text);
    }

    public void editMedia(Multimedia media, String url) {
        int index = medias.indexOf(media);
        medias.get(index).setUrl(url);
    }

    public void editText(Text text, String textStr) {
        int index = texts.indexOf(text);
        texts.get(index).setTextString(textStr);
    }

    public void showComments() {
        // Method loads array of page's comments
    }

    public void showMedia() {
        // Method loads array of page's media
    }

    public void showText() {
        // Method loads array of page's texts
    }

}
