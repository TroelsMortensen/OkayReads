package okayreads.views.mainview;

import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import okayreads.core.ViewHandler;

public class MainViewController {

    public AnchorPane subViewContent;
    public TextField searchField;

    public void init() {

    }

    public void openBooksView() {
        loadView("viewbooks/BooksView", null);
    }

    public void onSearch() {
        String searchString = searchField.getText();
        loadView("search/SearchView", searchString);
    }

    private void loadView(String path, Object args) {
        Parent subViewRoot = ViewHandler.getInstance().openSubView(path, args);

        AnchorPane.setTopAnchor(subViewRoot, 0.0);
        AnchorPane.setRightAnchor(subViewRoot, 0.0);
        AnchorPane.setLeftAnchor(subViewRoot, 0.0);
        AnchorPane.setBottomAnchor(subViewRoot, 0.0);


        subViewContent.getChildren().clear();
        subViewContent.getChildren().add(subViewRoot);
    }
}
