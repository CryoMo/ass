package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.util.ArrayList;

public class gbookController {


    @FXML
    private ListView<String> gBookVeiw;

    ArrayList<Student> roster = new ArrayList<>();

    @FXML
    private void initialize () throws Exception {

        Student john = new Student();
        Student jane =new Student();
        Student mike =new Student();
        Student mary =new Student();
        Student joseph =new Student();
        ObservableList<String> studentObservableList = FXCollections.observableArrayList(john.text);
        roster.add(john);
        roster.add(jane);
        roster.add(mike);
        roster.add(mary);
        roster.add(joseph);

        gBookVeiw.setItems(studentObservableList);

    }

}
