package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;



public class registrationPlannerController {

    @FXML public ListView selectedClasses;
    @FXML private TextArea classTextArea;

    public void menuButton(ActionEvent event) throws IOException {
        Parent menuViewParent = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene viewMenu = new Scene(menuViewParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(viewMenu);
        window.show();
    }

    public void courseRegistrationButton(ActionEvent event) throws IOException {
        Parent courseRegistrationViewParent = FXMLLoader.load(getClass().getResource("CourseRegistration.fxml"));
        Scene viewCR = new Scene(courseRegistrationViewParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(viewCR);
        window.show();
    }

    public void calendarButton(ActionEvent event) throws IOException {

        Parent calendarViewParent = FXMLLoader.load(getClass().getResource("calendar.fxml"));
        Scene CMenu = new Scene(calendarViewParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(CMenu);
        window.show();

    }

    public void registrationStatusButton(ActionEvent event) throws IOException {
        Parent courseRegistrationViewParent = FXMLLoader.load(getClass().getResource("registrationStatus.fxml"));
        Scene viewCR = new Scene(courseRegistrationViewParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(viewCR);
        window.show();
    }

    public void RMU(MouseEvent mouseEvent) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.rmu.edu/"));
    }



    public void listView(){
    selectedClasses.getItems().addAll("C++ Programming","Data Structures & Algorithms","Prototyping & Interface Design","Fundamentals Of Software Eng",
                                              "Comp Archit For Software Eng","Software Verif and Validation","Database Management System","Java Programming");
        //selectedClasses.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }

    public void listViewButtonPushed(){
        String textareaString = "";

        ObservableList listOfItems = selectedClasses.getSelectionModel().getSelectedItems();

        for(Object item : listOfItems) {
            textareaString += String.format("%s%n,(String) item");
        }

        this.classTextArea.setText(textareaString);
    }

    public void initialize(){

    }

}
