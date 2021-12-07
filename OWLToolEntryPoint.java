public class OWLToolEntryPoint {
    public static void main(String[] args) {
        models.Page m = new models.Page();
        views.EditingView editV = new views.EditingView();
        views.ViewingView viewV = new views.ViewingView();

        controllers.EditController editC = new controllers.EditController(m, editV);
        controllers.ViewController viewC = new controllers.ViewController(m, viewV);

    }
}