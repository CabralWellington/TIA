/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiav2;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;

/**
 *
 * @author SAMSUNG
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private Button btn_iniciar, btn_curso;

    @FXML
    private ListView list_school;

    @FXML
    private AnchorPane h_iniciar, h_school, h_curso;

    @FXML
    private void handleButtonAction(Event event) {
        if (event.getTarget() == btn_iniciar) {
            mudaTela("h_school");
            List<String> values = Arrays.asList("Fametro", "Fucapi", "Uninorte");
            list_school.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
            list_school.setItems(FXCollections.observableList(values));

        }

        if (event.getTarget() == btn_curso) {
            mudaTela("h_curso");
            System.out.println(list_school.getSelectionModel().getSelectedItem().toString());
            
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    private void mudaTela(String flag) {
        switch (flag) {
            case "h_school":
                h_iniciar.setVisible(false);
                h_school.setVisible(true);
                h_curso.setVisible(false);
                break;

            case "h_curso":
                h_iniciar.setVisible(false);
                h_school.setVisible(false);
                h_curso.setVisible(true);
                break;
        }
    }

}
