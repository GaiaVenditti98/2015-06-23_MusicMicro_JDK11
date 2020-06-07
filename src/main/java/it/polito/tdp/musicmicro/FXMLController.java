package it.polito.tdp.musicmicro;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.musicmicro.model.Model;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

//controller turno B --> switchare al branch master_turnoA o master_turnoC per turno A o turno C

public class FXMLController {

	private Model model;
	
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> boxGiorno;

    @FXML
    private Button btnCitta;

    @FXML
    private Button btnBraniComuni;

    @FXML
    private TextArea txtResult;

    @FXML
    void initialize() {
        assert boxGiorno != null : "fx:id=\"boxGiorno\" was not injected: check your FXML file 'MusicB.fxml'.";
        assert btnCitta != null : "fx:id=\"btnCitta\" was not injected: check your FXML file 'MusicB.fxml'.";
        assert btnBraniComuni != null : "fx:id=\"btnBraniComuni\" was not injected: check your FXML file 'MusicB.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'MusicB.fxml'.";

    }

	public void setModel(Model model) {
		this.model = model;
	}
}
