package com.db;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Main {
	public static Connection getConnection() throws Exception{
		//get datasource
		InitialContext ic = new InitialContext();
		DataSource ds = (DataSource) ic.lookup("java:/MySqlDS");
		
		//get connection
		Connection con = ds.getConnection();
		return con;
	}
}
