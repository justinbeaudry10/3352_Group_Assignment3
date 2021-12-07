import views.*;

public class OWLToolEntryPoint {
    public static void main(String[] args) {
        models.Page m = new models.Page();
        EditingView editV = new EditingView();
        ViewingView viewV = new ViewingView();

        controllers.EditController editC = new controllers.EditController(m, editV);
        controllers.ViewController viewC = new controllers.ViewController(m, viewV);

    }
}