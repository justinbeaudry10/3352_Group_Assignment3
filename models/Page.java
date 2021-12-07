package models;

import java.util.ArrayList;

public class Page {

    ArrayList<Comment> comments = new ArrayList<>();
    ArrayList<Multimedia> medias = new ArrayList<>();
    ArrayList<Text> texts = new ArrayList<>();

    public Page()
    {

    }

    public void addComment(Comment comment)
    {
        comments.add(comment);
    }

    public void addMedia(Multimedia multimedia)
    {
        medias.add(multimedia);
    }

    public void addText(Text text)
    {
        texts.add(text);
    }





}
