package controllers;

import java.util.Date;
import models.*;

public class EditController {
    Page model;  // The page model
    views.EditingView view; // The editor view

    // Constructor for edit controller, assigns the args model and view to this model and this view
    public EditController(Page model, views.EditingView view) {
        this.model = model;
        this.view = view;
    }

    // Method to add multimedia
    public void addMultimedia(String url, String author, Date date) {
        Multimedia m = new Multimedia(url, author, date); // Constructs a new multimedia model
        model.addMedia(m); // Adds multimedia to the page model
    }

    // Method to add text
    public void addText(String text, String author, Date date) {
        Text t = new Text(text, author, date); // Constructs a new text model
        model.addText(t); // Adds text to the page model
    }

    // Method to add a comment
    public void addComment(String text, String author, Date date) {
        Comment c = new Comment(text, author, date); // Constructs a new comment model
        model.addComment(c); // Adds comment to the page model
    }
}
