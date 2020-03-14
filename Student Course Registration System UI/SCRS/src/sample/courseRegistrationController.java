package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;

import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class courseRegistrationController {

    ObservableList<String> majorClasses = FXCollections.observableArrayList("C++ Programming","Data Structures & Algorithms","Prototyping & Interface Design","Fundamentals Of Software Eng",
            "Comp Archit For Software Eng","Software Verif and Validation","Database Management System","Java Programming");

    ObservableList<String> coreClasses = FXCollections.observableArrayList("Chemistry I","Chemistry I Lab","Reading & Writing Strategies","Argument and Research","Public Speaking and Persuasion","Professnl Commun In Workplace",
            "Survey Of Economics","Humanities: Art and Music","Calculus W/Analytic Geom I","General Psychology","Principles Of Sociology");

    public void menuButton(ActionEvent event) throws IOException {
        Parent menuViewParent = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene viewMenu = new Scene(menuViewParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(viewMenu);
        window.show();
    }

    public void registrationPlannerButton (ActionEvent event) throws IOException {
        Parent rpViewParent = FXMLLoader.load(getClass().getResource("registrationPlanner.fxml"));
        Scene viewRP = new Scene(rpViewParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(viewRP);
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

    @FXML private ComboBox classComboBox;
    @FXML private ComboBox classComboBox2;
    @FXML private ComboBox classComboBox3;
    @FXML private ComboBox classComboBox4;
    @FXML private ComboBox classElectiveComboBox;
    @FXML private ComboBox classElectiveComboBox2;

    @FXML private ListView selectedClasses;

    @FXML
    private void initialize(){

        classComboBox.getItems().addAll(majorClasses);
        classComboBox2.getItems().addAll(majorClasses);
        classComboBox3.getItems().addAll(majorClasses);
        classComboBox4.getItems().addAll(majorClasses);
        classElectiveComboBox.getItems().addAll(coreClasses);
        classElectiveComboBox2.getItems().addAll(coreClasses);

    }

    public void planClassBoxButton(ActionEvent event) throws IOException {
        String className = classComboBox.getValue().toString();
        String className2 = classComboBox2.getValue().toString();
        String className3 = classComboBox3.getValue().toString();
        String className4 = classComboBox4.getValue().toString();
        String classElectiveName = classElectiveComboBox.getValue().toString();
        String classElectiveName1 = classElectiveComboBox2.getValue().toString();

        ObservableList<String> Classes = FXCollections.observableArrayList(className, className2, className3, className4, classElectiveName, classElectiveName1);

        //doesnt work this code is jank
        //FXMLLoader loader = new FXMLLoader();
        //loader.setLocation(getClass().getResource("registrationPlannerController.fxml"));
      //  Parent tableViewParent = loader.load();

      //  Scene tableViewScene = new Scene(tableViewParent);

       // registrationPlannerController controller = loader.getController();
       // controller.listView(Classes);

       // Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

      //  window.setScene(tableViewScene);
       // window.show();


    }


}