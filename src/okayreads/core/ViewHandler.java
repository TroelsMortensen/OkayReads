package okayreads.core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import okayreads.mainview.MainViewController;

public class ViewHandler {

    private Stage primaryStage;

    public ViewHandler(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void start() {
        openView("mainview/MainView.fxml");
    }

    private void openView(String path) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/okayreads/"+path));
            Parent root = loader.load();
            MainViewController controller = loader.getController();
            controller.init();

            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
