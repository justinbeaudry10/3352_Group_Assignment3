import views.*;

public class OWLToolEntryPoint {
    public static void main(String[] args) {
        // Creates new Page and views
        models.Page m = new models.Page();
        EditingView editV = new EditingView();
        ViewingView viewV = new ViewingView();

        // Creates new controllers and attaches the appropriate view
        controllers.EditController editC = new controllers.EditController(m, editV);
        controllers.ViewController viewC = new controllers.ViewController(m, viewV);

    }
}