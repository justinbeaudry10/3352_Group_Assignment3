package views;

import java.util.Date;

import controllers.EditController;
import models.Observer;
import models.Page;

//Editing page view
public class EditingView extends Observer
{
    //Reference to page being edited (model)
    private Page model;

    //Controller for editing the page
    private EditController controller;

    //Constructor
    public EditingView() {

    }

    //Constructor
    public EditingView(Page model, EditController controller) {
        this.setModel(model);
        this.setController(controller);
    }

    //Update the view
    public void update() {
        this.show();
    }

    public void displayEditBtns() {
        // Displays all the buttons that allow the owner to edit the page
    }

    // Loads page's comments
    public void loadComments(Page page) {
        this.model = page; // Referencing the called page
        model.showComments(); // Displays page's comments
    }

    // Loads page's text elements
    public void loadText(Page page) {
        this.model = page; // Referencing the called page
        model.showText(); // Displays page's text elements
    }

    // Loads page's multimedia elements
    public void loadMultiedia(Page page) {
        this.model = page; // Referencing the called page
        model.showMedia(); // Displays page's multimedia elements
    }

    public void show() {
        // Display or refresh
    }

    //Get the model
    public Page getModel() {
        return this.model;
    }

    //Set the model
    public void setModel(Page model) {
        if (this.model != null)
            this.model.dettach(this);

        this.model = model;
        this.model.attach(this);
    }

    //Get the controller
    public controllers.EditController getController() {
        return this.controller;
    }

    //Set the controller
    public void setController(controllers.EditController controller) {
        this.controller = controller;
    }
}
