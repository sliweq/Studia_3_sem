import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Prosty rysunek JavaFX");

        Canvas canvas = new Canvas(400, 200);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        draw(gc);

        primaryStage.setScene(new Scene(canvas));
        primaryStage.show();
    }

    private void draw(GraphicsContext gc) {
        gc.strokeRect(50, 50, 300, 100);
        gc.fillText("Hello, JavaFX!", 100, 100);
    }
}