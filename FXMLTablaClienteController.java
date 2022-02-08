/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciongraficacliente;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import modelo.Cliente;

/**
 * FXML Controller class
 *
 * @author pedro
 */
public class FXMLTablaClienteController implements Initializable {

    @FXML
    private TableView<Cliente> tablaCliente; //se define la tabla de tipo cliente
    @FXML
    private ObservableList<Cliente> listaClientes;//se define una lista en la que se guardarán los objetos a mostrar

    @FXML
    public void muestraTabla() {
        listaClientes = FXCollections.observableArrayList();
        Cliente c = new Cliente(1, "Leonidas", "Enmicasa", "MRFC", null);
        Cliente c1 = new Cliente(2, "Pedro", "Norway", "940526", null);
        listaClientes.add(c);
        listaClientes.add(c1);
        tablaCliente.setItems(listaClientes);//Incluyelalistaenlosregistrosdelatabal
    }

    public void initialize(URL url, ResourceBundle rb) {
        // primer método a ejecutar dentro de una clase de un controlador
        //se pueden validar si se hace una conexción a la base de datos para mostrar los registros de la tabla
        muestraTabla();
    }

}
