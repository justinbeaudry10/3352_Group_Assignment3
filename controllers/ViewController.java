package controllers;

import java.util.Date;
import models.*;

public class ViewController {
    models.Page model; // The page model
    views.ViewingView view; // The veiw only view

    // Constructor for view controller, assigns the args model and view to this model and this view
    public ViewController(models.Page model, views.ViewingView view) {
        this.model = model;
        this.view = view;
    }

    // Add comment functionality for the view only 
    public void addComment(String text, String author, Date date) {
        Comment c = new Comment(text, author, date); // Constructs a new comment model
        model.addComment(c); // Adds comment to the page model
    }
}
