package okayreads.views.viewbooks;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import okayreads.views.ViewController;

public class BooksViewController implements ViewController {
    public BorderPane mainPane;

    @Override
    public void init(Object args) {

        System.out.println("Books view initialized");
    }
}
