package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class calendarController {

    public void RMU(MouseEvent mouseEvent) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.rmu.edu/"));
    }

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

    public void courseRegistrationButton(ActionEvent event) throws IOException {

        Parent CRViewParent = FXMLLoader.load(getClass().getResource("courseRegistation.fxml"));
        Scene CRMenu = new Scene(CRViewParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(CRMenu);
        window.show();

    }

    public void registrationStatusButton(ActionEvent event) throws IOException {
        Parent courseRegistrationViewParent = FXMLLoader.load(getClass().getResource("registrationStatus.fxml"));
        Scene viewCR = new Scene(courseRegistrationViewParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(viewCR);
        window.show();
    }

}


