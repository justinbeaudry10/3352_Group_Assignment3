package views;

import controllers.ViewController;
import models.Observer;
import models.Page;

//Viewing page view
public class ViewingView extends Observer
{
    // Variable holds reference to the page being viewed
    private Page model;

    // Variable holds reference to the controller for viewing
    private ViewController controller;

    //Constructor
    public ViewingView() {

    }

    //Constructor
    public ViewingView(Page model, ViewController controller) {
        this.setModel(model);
        this.setController(controller);
    }

    //Update the view
    public void update() {
        this.show();
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

    //Show the view
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
    public controllers.ViewController getController() {
        return this.controller;
    }

    //Set the controller
    public void setController(controllers.ViewController controller) {
        this.controller = controller;
    }
}
