package views;
import java.util.Date;
import models.Page;

public class EditingView {
    Page pageModel; 

    public void displayEditBtns() {
        // Displays all the buttons that allow the owner to edit the page
    }

    // Loads page's comments
    public void loadComments(Page page) {
        this.pageModel = page;      // Referencing the called page
        pageModel.showComments();   // Displays page's comments
    }

    // Loads page's text elements
    public void loadText(Page page) {
        this.pageModel = page;      // Referencing the called page
        pageModel.showText();       // Displays page's text elements
    }

    // Loads page's multimedia elements
    public void loadMultiedia(Page page) {
        this.pageModel = page;      // Referencing the called page 
        pageModel.showMedia();      // Displays page's multimedia elements
    }
}
