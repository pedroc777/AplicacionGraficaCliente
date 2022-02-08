/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciongraficacliente;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import modelo.Cliente;
import modelo.ClienteDAO;

/**
 *
 * @author pedro
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML //indica que está definida en el XML
    private Label etiquetaObjetivo;
    
    @FXML
    private TextField nombreCliente;
    
    @FXML
    private TextField direccionCliente;
    @FXML
    private TextField rfcCliente;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Me has presionado");
        System.out.println("Nombre: " + nombreCliente.getText() + " Dirección: "
                + direccionCliente.getText() + " RFC: " + rfcCliente.getText());
        
        Cliente c = new Cliente();
        ClienteDAO cd = new ClienteDAO();
        
        //cd.insertarUnCliente(c);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
