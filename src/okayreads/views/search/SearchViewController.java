package okayreads.views.search;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import okayreads.views.ViewController;

public class SearchViewController implements ViewController {
    public VBox searchContent;

    @Override
    public void init(Object args) {
        Label label = new Label(args.toString());
        searchContent.getChildren().add(label);
    }
}
