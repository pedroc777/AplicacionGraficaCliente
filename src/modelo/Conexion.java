/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;


public class Conexion {
    
        
    
    
        public Conexion(){};
	public static Connection init() {//devuelve la conexión a la base de datos y es la misma para todas las estancias
		Connection con = null;
		String host="****";
                String bd="****";
		String password = "****";
		String usuario = "****";
                //construcción de una URL
		String url = "jdbc:mysql://"+host+"/"+bd+"?user=" + usuario+ "&password=" + password;
                //para generar una conexión
		try {
			con = DriverManager.getConnection(url);
			if (con != null) {
				System.out.println("Conectado");
			}
		} catch (SQLException e) {
			System.out.println("No se pudo conectar a la base de datos");
			e.printStackTrace();
		}
		return con;
	}
}