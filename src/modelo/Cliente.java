/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author pedro
 */
public class Cliente {
    private int ClienteID;
    private String ClienteNombre;
    private String ClienteDireccion;
    private String ClienteRFC;
    private Date fechaNac;

    public Cliente() {
    }

    public Cliente(int ClienteID, String ClienteNombre, String ClienteDireccion, String ClienteRFC, Date fechaNac) {
        this.ClienteID = ClienteID;
        this.ClienteNombre = ClienteNombre;
        this.ClienteDireccion = ClienteDireccion;
        this.ClienteRFC = ClienteRFC;
        this.fechaNac = fechaNac;
    }

    public int getClienteID() {
        return ClienteID;
    }

    public void setClienteID(int ClienteID) {
        this.ClienteID = ClienteID;
    }

    public String getClienteNombre() {
        return ClienteNombre;
    }

    public void setClienteNombre(String ClienteNombre) {
        this.ClienteNombre = ClienteNombre;
    }

    public String getClienteDireccion() {
        return ClienteDireccion;
    }

    public void setClienteDireccion(String ClienteDireccion) {
        this.ClienteDireccion = ClienteDireccion;
    }

    public String getClienteRFC() {
        return ClienteRFC;
    }

    public void setClienteRFC(String ClienteRFC) {
        this.ClienteRFC = ClienteRFC;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Clientes{" + "ClienteID=" + ClienteID + ", ClienteNombre=" + ClienteNombre + ", ClienteDireccion=" + ClienteDireccion + ", ClienteRFC=" + ClienteRFC + ", fechaNac=" + fechaNac + '}';
    }
    
    
}
