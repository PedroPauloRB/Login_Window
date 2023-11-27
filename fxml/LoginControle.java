package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControle{
	
	@FXML 
	private TextField emailField;
	@FXML
	private PasswordField senhaField;
	
	
	
	public void entrar() {
		boolean emailvalido = emailField.getText().equals("Pedrop60");
		boolean senhavalida = senhaField.getText().equals("Batman18");
		
		if(emailvalido && senhavalida) {
			Notifications.create()
				.title("login FXML")
				.text("login realizado com sucesso")
				.showInformation();
		} else {
			Notifications.create()
			.title("login FXML")
			.text("login ou senha invalido")
			.showError();
			
		}
		
	}

}
