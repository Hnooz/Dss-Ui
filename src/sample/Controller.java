package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    Button next;
    @FXML
    TextField stat;
    @FXML
    TextField fact;

    @FXML
    Label lab;

    @FXML
     void gotNext(){

        try {
            Double status = Double.valueOf(stat.getText());
            Double factories = Double.valueOf(fact.getText());
            Table table = new Table();
            table.creteTable(status,factories);
        }catch (NumberFormatException e){
            lab.setText("Sorry you should enter a number");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
