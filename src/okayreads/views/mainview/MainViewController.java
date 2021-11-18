package okayreads.views.mainview;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import okayreads.core.ViewHandler;

public class MainViewController {

    public AnchorPane subViewContent;

    public void init() {

    }

    public void openBooksView() {
        Parent subViewRoot = ViewHandler.getInstance().openSubView("viewbooks/BooksView");

        AnchorPane.setTopAnchor(subViewRoot, 0.0);
        AnchorPane.setRightAnchor(subViewRoot, 0.0);
        AnchorPane.setLeftAnchor(subViewRoot, 0.0);
        AnchorPane.setBottomAnchor(subViewRoot, 0.0);


        subViewContent.getChildren().clear();
        subViewContent.getChildren().add(subViewRoot);
    }
}
