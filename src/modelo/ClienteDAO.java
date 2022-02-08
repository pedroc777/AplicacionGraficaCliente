/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Data Access Object
 * @author pedro
 */
public class ClienteDAO {
    
    //conversión de objeto result set a un objeto Cliente
    
    
    public int insertarUnCliente(Cliente c){
        int result = 0;
        
        
        PreparedStatement stm = null;
        ResultSet rs = null;
        String sql = "insert into Cliente (ClienteID,ClienteNombre,ClienteDireccion,ClienteRFC,ClienteFechaNac) values(?,?,?,?,?)";
        //instancia de la clase conexion
        
        Connection con = Conexion.init();
        
        try {
            stm = con.prepareStatement(sql);
            
            stm.setInt(1, c.getClienteID());
            stm.setString(2, c.getClienteNombre());
            stm.setString(3, c.getClienteDireccion());
            stm.setString(4, c.getClienteRFC());
            stm.setDate(5, c.getFechaNac());
            
            result = stm.executeUpdate();
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    
    
    
    
    public Cliente buscarUnCliente(int id){
        Cliente c = new Cliente();
        PreparedStatement stm = null;
        ResultSet rs = null;
        String sql = "select * from Cliente where ClienteID=? limit 1";
        //instancia de la clase conexion
        
        Connection con = Conexion.init();
        
        try {
            stm = con.prepareStatement(sql);
            stm.setInt(1, id);
            rs = stm.executeQuery();
            while(rs.next()){//para recorrer y obtener todos los registros
                c.setClienteID(rs.getInt("ClienteID"));//rellenar el campo "Cliente"
                c.setClienteNombre(rs.getString("ClienteNombre"));
                c.setClienteDireccion(rs.getString("ClienteDireccion"));
                c.setClienteRFC(rs.getString("ClienteRFC"));
                c.setFechaNac(rs.getDate("ClienteFechaNac"));
            }
            
            rs.close();
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return c;
    }
}

