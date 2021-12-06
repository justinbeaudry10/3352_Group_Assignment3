package controllers;

public class EditController {
    models.Page model;
    views.EditingView view;

    public EditController(models.Page model, views.EditingView view) {
        this.model = model;
        this.view = view;
    }
}
