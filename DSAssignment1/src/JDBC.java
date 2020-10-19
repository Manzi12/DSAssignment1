import java.sql.*;
import java.util.Properties;

public class JDBC {
	/**
	 * the database user name
	 */
	private final String UserName = "root";
	
	/**
	 * the database password
	 */
	private final String Password = "";
	
	/**
	 * the server name of the database
	 */
	private final String servername = "localhost";
	
	/**
	 * the name of the database
	 */
	private final String dbName = "Employee_db";
	
	/**
	 * the port where the database is running
	 */
	private final int portNumber = 3306;
	
	/**
	 * the table in the database
	 */
	private final String tableName = "Employee";
	
	/**
	 * the records in the database
	 */
	private ResultSet resultset;
	
	/**
	 * counter for the records in the database
	 */
	private int Counter;
	
	/**
	 * getter for the counter
	 * @return counter
	 */
	public int getCounter() {
		return Counter;
	}
	
	/**
	 * getter for the result set
	 * @return resultSet
	 */
	public ResultSet getResultset() {
		return resultset;
	}

	/**
	 * Setter for the counter
	 * @param counter
	 */
	public void setCounter(int counter) {
		Counter = counter;
	}

	/**
	 * setter for the resultSet
	 * @param resultset
	 */
	public void setResultset(ResultSet resultset) {
		this.resultset = resultset;
	}

	/***
	 * Setting up the connection
	 * @return
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException{
		Connection con = null;
		Properties connectionProperties = new Properties();
		connectionProperties.put("user", this.UserName);
		connectionProperties.put("password", this.Password);
		
		con = DriverManager.getConnection("jbdc:mysql://"
				+ this.servername + ":" + this.portNumber + "/" + this.dbName,connectionProperties);
		
		return con;
		
	}
	
	
	/**
	 * trying the connection
	 */
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

	
	/**
	 * listing the existing records in the database
	 */
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
	
	/**
	 * Adding a new Employee to the database
	 * @param taxNumber
	 * @param firstName
	 * @param lastName
	 * @param jobTitle
	 * @param email
	 * @param salary
	 */
	public void addEmployee(int taxNumber, String firstName,String lastName, String jobTitle, String email, int salary) {
		try {
			Statement s = this.getConnection().createStatement();
			s.executeUpdate("INSERT INTO employee ("
					+ "taxNumber,"
					+ "firstName,"
					+ "lastName,"
					+ "jobTitle,"
					+ "salary,"
					+ "email)"
					+ " VALUES ("
					+ taxNumber + ", '"
					+ firstName + "', '"
					+ lastName + "', '"
					+ jobTitle + "',"
					+ salary + ", '"
					+ email + "')");
			s.close();
			System.out.println("New Employee Added");
		} catch (SQLException e) {
			System.out.print("Error Could not add new Employee");
		}
	}
	
	/**
	 * updating an employee
	 * @param taxNumber
	 * @param firstName
	 * @param lastName
	 * @param jobTitle
	 * @param email
	 * @param salary
	 */
	public void updateEmployee(int taxNumber, String firstName,String lastName, String jobTitle, String email, int salary) {
		try {
			Statement s = this.getConnection().createStatement();
			s.executeUpdate("UPDATE employee SET"
					+ "taxNumber = " + taxNumber
					+ "firstName = " + firstName
					+ "lastName = " + lastName
					+ "jobTitle = " + jobTitle
					+ "email = " + email
					+ "salary = " + salary);
			s.close();
			System.out.println("Employee Updated");
		} catch (SQLException e) {
			System.out.println("Error could not update Employee");
		}
	}
	
	/**
	 * deleting an employee using the unique taxNumber
	 * @param taxNumber
	 */
	public void deleteEmployee(int taxNumber) {
		try {
			Statement s = this.getConnection().createStatement();
			s.executeUpdate("DELETE FROM employee where "
					+ "taxNumber = " + taxNumber );
			s.close();
			System.out.println("Successfully Deleted Employee");
		} catch (SQLException e) {
			System.out.println("Error Could not Delete Employee");
		}
	}
	
	/**
	 * searching for the employee using unique taxNumber
	 * @param taxNumber
	 */
	public void searchEmployee(int taxNumber) {
		try {
			Statement s = this.getConnection().createStatement();
			s.executeQuery("SELECT * FROM employee WHERE taxNumber = " + taxNumber);
			ResultSet rs = s.getResultSet();
			System.out.println("Employee was Retrieved");
			rs.close();
			s.close();
		} catch (SQLException e) {
			System.out.println("Error Could not retrieve the Employee");
		}
	}

}
