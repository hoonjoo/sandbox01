package dev.hoon.sandbox.adaptors.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dev.hoon.sandbox.adaptors.IAdaptor;

public abstract class JDBCAdaptor implements IAdaptor {
  protected Connection conn;
  
  private String url;
  private String usr;
  private String pwd;
  private String cls;
  
  public JDBCAdaptor(String connectionString) {
  	// TODO: parse connection string
  	// TODO: error checking
  }

  @Override
	public boolean connect() {
  	try {
	  	Class.forName(cls);
	    conn = DriverManager.getConnection(url, usr, pwd);
  	} catch(ClassNotFoundException e) {
  		// TODO: class exception
  		return false;
  	} catch(SQLException e) {
  		// TODO: driver exception
  		return false;
  	}
  	
  	return true;
  }
}
