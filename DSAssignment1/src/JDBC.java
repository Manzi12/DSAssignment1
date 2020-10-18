import java.sql.*;
import java.util.Properties;

public class JDBC {
	
	private final String UserName = "root";
	private final String Password = "";
	private final String servername = "localhost";
	private final String dbName = "Employee_db";
	private final int portNumber = 3306;
	private final String tableName = "Employee";
	private ResultSet resultset;
	private int Counter;
	
	
	public int getCounter() {
		return Counter;
	}


	public void setCounter(int counter) {
		Counter = counter;
	}


	public Connection getConnection() throws SQLException{
		Connection con = null;
		Properties connectionProperties = new Properties();
		connectionProperties.put("user", this.UserName);
		connectionProperties.put("password", this.Password);
		
		con = DriverManager.getConnection("jbdc:mysql://"
				+ this.servername + ":" + this.portNumber + "/" + this.dbName,connectionProperties);
		
		return con;
		
	}
	
	
	public void run() {
		try {
			this.getConnection();
			System.out.println("Connected to the Database");
			this.getExixtsingDataFromDB();
			System.out.println(this.getResultset().toString());
		}catch (SQLException e) {
			System.out.print("Error Could not connect to the databse");
		}
	}


	public ResultSet getResultset() {
		return resultset;
	}


	public void setResultset(ResultSet resultset) {
		this.resultset = resultset;
	}
	
	public void getExixtsingDataFromDB() {
		try {
			Statement s = this.getConnection().createStatement();
			s.executeQuery("SELECT * FROM employee");
			setResultset(s.getResultSet());
			setCounter(0);
			getResultset().close();
			s.close();
			System.out.println(Counter + " row were retrived");
		} catch (SQLException e) {
			System.out.println("Error could not retrieve any data");
		}
	}
	
	public void addEmployee(int taxNumber, String firstName,String lastName, String jobTitle, String phoneNumber, String email, int salary) {
		try {
			Statement s = this.getConnection().createStatement();
			s.executeUpdate("INSERT INTO employee ("
					+ "taxNumber,"
					+ "firstName,"
					+ "lastName",
					+ "jobTitle,"
					+ "phoneNumber,"
					+ "email,"
					+ "salary)"
					+ "VALUES ("
					+ taxNumber + ","
					+ firstName + ","
					+ lastName + ","
					+ jobTitle + ","
					+ phoneNumber + ","
					+ email + ","
					+ salary +")");
			
		}
	}

}
