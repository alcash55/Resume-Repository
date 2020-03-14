package sample;

import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class logInController {

    public void menuButton(ActionEvent event) throws IOException {
        Parent menuViewParent = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene viewMenu = new Scene(menuViewParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(viewMenu);
        window.show();
    }

    public void RMU(MouseEvent mouseEvent) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.rmu.edu/"));
    }

    public void twitter(MouseEvent mouseEvent) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://twitter.com/search?q=%23colonialpride&ref_src=twsrc%5Etfw&ref_url=http%3A%2F%2Frmu.edu%2Fnewsroom%2FSocialMedia"));
    }

    public void snapchat(MouseEvent mouseEvent) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.snapchat.com/add/rmu_1921"));
    }

    public void instagram(MouseEvent mouseEvent) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.instagram.com/robertmorrisuniversity/"));
    }

    public void facebook(MouseEvent mouseEvent)throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.facebook.com/RMUpgh/"));
    }

    public void youtube(MouseEvent mouseEvent) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.youtube.com/user/RMUNewsTube"));
    }


    public void linkedIn(MouseEvent mouseEvent) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.linkedin.com/school/robert-morris-university/"));
    }


    public void flickr(MouseEvent mouseEvent) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.flickr.com/photos/rmunews/albums/"));
    }
}
