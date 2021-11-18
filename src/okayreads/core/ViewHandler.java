package okayreads.core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import okayreads.views.ViewController;
import okayreads.views.mainview.MainViewController;

public class ViewHandler {

    private Stage primaryStage;

    private static ViewHandler instance;

    private ViewHandler() {}

    public static ViewHandler getInstance(){
        if(instance == null){
            instance = new ViewHandler();
        }
        return instance;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }


    public void start() {
        openMainView("mainview/MainView.fxml");
    }

    private void openMainView(String path) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/okayreads/views/"+path));
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

    public Parent openSubView(String path, Object args){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/okayreads/views/"+path+".fxml"));
            Parent root = loader.load();
            ViewController controller = loader.getController();
            controller.init(args);
            return root;
        } catch (Exception e) {
            throw new RuntimeException("Root not loaded: " + e.getMessage());
        }
    }

    public Parent openSubView(String path) {
        return openSubView(path, null);
    }
}
