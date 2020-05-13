package application;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.PasswordField;
import java.net.URL;
import java.io.IOException;

import classes.App;
public class Controller1 {
@FXML
private AnchorPane rootpane;
@FXML
private TextField tf;
@FXML
private PasswordField pw;
@FXML
private Label lbl;

public void signin(ActionEvent Event) {
String username=tf.getText();
String password=pw.getText();
App obj=new App();
if(obj.signin(username, password)) {
	
	
}else {
	lbl.setText("wrong inputs try again");
}

}

public void signUp(ActionEvent Event) throws IOException {
	System.out.println("i reached here");
	AnchorPane pane=FXMLLoader.load(getClass().getResource("signup.fxml"));
	rootpane.getChildren().setAll(pane);


	
	
}


}
