package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;


public class Table {

@FXML
GridPane table;
@FXML
ColumnConstraints columnConstraints;
@FXML
RowConstraints rowConstraints;
@FXML
Button calculate;

Label label1[];
  void creteTable(Double st,Double fact) throws Exception{
//    Stage TableStage = new Stage();
//    Parent table = FXMLLoader.load(getClass().getResource("table.fxml"));
//    TableStage.setTitle("Table");
//    TableStage.setScene(new Scene(table, 500, 500));
//    TableStage.show();

    creteColumns(st,fact);
}

    private void creteColumns(Double st, Double fact) throws IOException {
        Stage primaryStage = new Stage();
        GridPane gridPane = new GridPane();
        Parent table = FXMLLoader.load(getClass().getResource("table.fxml"));
        primaryStage.setTitle("Table");
        BorderPane borderPane = new BorderPane();



        TextField[][] textFields = new TextField[st.intValue()][fact.intValue()];
//        HBox root = new HBox(10);
        gridPane.setPadding(new Insets(50, 75, 10, 75));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
         label1 = new Label[st.intValue()];
//        gridPane.setRowIndex(label, 0);
//        gridPane.setColumnIndex(label, 0);

// Add the child to the grid
        label1[0] = new Label("state/factor");
        gridPane.add(label1[0],0,0);
        for(int i =0 ;i < st.intValue(); i++){
            int count1 =0;
            for (int j = 0; j < fact.intValue(); j++) {
                TextField tf = new TextField();
                textFields[i][j] = tf;

                if (j==0 ){

                    label1[count1+1] = new Label("state " + i );
                    gridPane.add(label1[count1+1],i,j);

                }else{
                    gridPane.add(textFields[i][j],i,j);
                }

                count1++;
            }



        }


//        borderPane.setTop(root);
//        borderPane.setLeft(root);
        Scene scene = new Scene(new ScrollPane(gridPane), 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
