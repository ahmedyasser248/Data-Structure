package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import classes.App;
import classes.Contact;
public class ControllerSignUp {
@FXML
private TextField tf1;
@FXML
private PasswordField pw1;
@FXML 
private TextField tf2;
@FXML
private PasswordField pw2;
@FXML
private TextField otherEmails;
@FXML
private Label lbl1;
@FXML
private Label lbl2;
@FXML
private Label lbl3;
@FXML
private Label lbl4;


public void save(ActionEvent event) {
try{App obj=new App();
if(tf1.getText().trim().isEmpty()) {
	lbl1.setText("fill");
	return;}
if(tf2.getText().trim().isEmpty()) {lbl2.setText("please fill");return;}
if(pw1.getText().trim().isEmpty()) {lbl3.setText("please fill");return;}
if(pw2.getText().trim().isEmpty()) {lbl4.setText("please fill");return;}
if(!pw1.getText().equals(pw2.getText())) {lbl4.setText("must match password");return;}
String emails;
if(otherEmails.getText().trim().isEmpty()) {
	emails="";
} else {
	emails=otherEmails.getText();}
Contact obj2=new Contact(tf1.getText(),tf2.getText(),pw1.getText(),emails);
if(obj.signup(obj2)) {
	//hnft7 7agto b2a 
	
}else {
	lbl2.setText("choose another user name");
}	
}catch(Exception e) {System.out.println(e);}
}


}
