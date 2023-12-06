package sql.mysql;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

import sql.Connector;
/**
 * This class is useful to create connections to a MySQL database.
 * 
 * @author PablCendrero8310
 * 
 */
public class MySQLConnector implements Connector{
	private Connection connection;
	private String host;
	private int port;
	private String database;
	private String user;
	private String password;

	public MySQLConnector(String host, int port, String database, String user, String password) {
		this.host = host;
		this.port = port;
		this.database = database;
		this.user = user;
		this.password = password;

	}

	public Connection getConnection() throws SQLException {
		connection = DriverManager.getConnection("jdbc:mysql//" + host + ":" + port +"/"+ database, user, password);
		return connection;
	}



	public Connection setHost(String host) throws SQLException {
		this.host = host;
		return getConnection();
	}

	public Connection setPort(int port) throws SQLException {
		this.port = port;
		return getConnection();
	}

	public Connection setDatabase(String database) throws SQLException {
		this.database = database;
		return getConnection();
	}

	public Connection setUser(String user) throws SQLException {
		this.user = user;
		return getConnection();
	}

	public Connection setPassword(String password) throws SQLException {
		this.password = password;
		System.out.println("Hola");
		return getConnection();
	}

}
