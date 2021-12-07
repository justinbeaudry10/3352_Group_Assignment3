package controllers;

import java.util.Date;
import models.*;

public class EditController {
    Page model;
    views.EditingView view;

    public EditController(Page model, views.EditingView view) {
        this.model = model;
        this.view = view;
    }

    public void addMultimedia(String url, String author, Date date) {
        Multimedia m = new Multimedia(url, author, date);
        model.addMedia(m);
    }

    public void addText(String text, String author, Date date) {
        Text t = new Text(text, author, date);
        model.addText(t);
    }

    public void addComment(String text, String author, Date date) {
        Comment c = new Comment(text, author, date);
        model.addComment(c);
    }
}
