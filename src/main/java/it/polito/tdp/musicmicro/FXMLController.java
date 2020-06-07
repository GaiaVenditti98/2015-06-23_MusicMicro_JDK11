package it.polito.tdp.musicmicro;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.musicmicro.model.Model;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

//controller turno C --> switchare al branch master_turnoA o master_turnoB per turno A o turno B

public class FXMLController {

	private Model model;
	
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> boxNazione;

    @FXML
    private Button btnUtenti;

    @FXML
    private Button btnConnesso;

    @FXML
    private TextArea txtResult;

    @FXML
    void initialize() {
        assert boxNazione != null : "fx:id=\"boxNazione\" was not injected: check your FXML file 'MusicC.fxml'.";
        assert btnUtenti != null : "fx:id=\"btnUtenti\" was not injected: check your FXML file 'MusicC.fxml'.";
        assert btnConnesso != null : "fx:id=\"btnConnesso\" was not injected: check your FXML file 'MusicC.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'MusicC.fxml'.";

    }

	public void setModel(Model model) {
		this.model = model;
	}
}
