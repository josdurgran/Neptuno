package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
	
	private String driver = "org.postgresql.Driver";
	private String host = "localhost";
	private String port = "5432";
	private String database = "neptuno";
	private String user = "core";
	private String password = "Mi7j+ZozR5dIN7R7yH#U4SI+Y";
	
	public Connection establecer( )	{
		
	String connectString = "jdbc:postgresql://"+this.host+":"+this.port+"/"+this.database;
	Connection con = null;
	try{
	Class.forName(this.driver);
	con = DriverManager.getConnection(connectString, this.user , this.password);	
	}catch ( Exception e ){
		//System.out.println(e.getMessage());
		System.out.println("Error de conexion con la BD...");
	}
	
	return con;
	
	}	
	
    public void cerrar( Connection connection ) throws SQLException {
        if (connection != null && connection.isClosed() == false) {
            connection.close();
        }
    }
	


	}
