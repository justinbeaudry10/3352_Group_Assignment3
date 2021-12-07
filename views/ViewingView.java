package views;
import models.Page;

public class ViewingView {
    Page pageModel;                 // Variable holds reference to the page being viewed
    
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
