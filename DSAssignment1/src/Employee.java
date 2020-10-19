
public class Employee {
	
	private int taxNumber;
	private String firstName;
	private String lastName;
	private String jobTitle;
	private int salary;
	private String email;
	
	public Employee(int taxNumber, String firstName,String lastName, String jobTitle, int salary, String email) {
		
		// *********VALIDATION OF DATA**************//
		
		if((taxNumber>=100) && (taxNumber<=200)) {
			this.taxNumber = taxNumber;
		}else {
			this.taxNumber = 100;
		}
		
		if(firstName.length()<=15) {
			this.firstName = firstName;
		}else {
			this.firstName = firstName.substring(0,15);
		}
	
		if(lastName.length()<=20) {
			this.lastName = lastName;
		}else {
			this.lastName = lastName.substring(0,20);
		}
		
		if(jobTitle.length()<=50) {
			this.jobTitle = jobTitle;
		}else {
			this.jobTitle = jobTitle.substring(0,50);
		}
		
		if((salary>=20000) && (salary<=150000)) {
			this.salary = salary;
		}else {
			this.salary = 20000;
		}
		
		if(email.length()<=50) {
			this.email = email;
		}else {
			this.email = email.substring(0,50);
		}
		
	}
	
	
	//*******GETTERS FUCNTIONS********//
	
	public int getTaxNumber() {
		return taxNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public int getSalary() {
		return salary;
	}

	public String getEmail() {
		return email;
	}
	
	
	//*******SETTERS FUCNTIONS***********//
	
	public void setTaxNumber(int taxNumber) {
		this.taxNumber = taxNumber;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Tax Number: "  +  taxNumber + ", " +
				"First Name : "  +  firstName + ", " +
				"Last Name : "  + lastName + ", " +
				"Job Tittle : "  +  jobTitle + " " +
				"Salary : "  +  salary + ", " +
				"Email :"  +  email;
	}

}
