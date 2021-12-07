package controllers;

import java.util.Date;
import models.*;

public class ViewController {
    models.Page model;
    views.ViewingView view;

    public ViewController(models.Page model, views.ViewingView view) {
        this.model = model;
        this.view = view;
    }

    public void addComment(String text, String author, Date date) {
        Comment c = new Comment(text, author, date);
        model.addComment(c);
    }
}
