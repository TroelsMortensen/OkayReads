package okayreads;

import javafx.application.Application;
import javafx.stage.Stage;
import okayreads.core.ViewHandler;

public class OkayReadsApplication extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        stage.setMaximized(true);
        ViewHandler vh = new ViewHandler(stage);
        vh.start();
    }
}
