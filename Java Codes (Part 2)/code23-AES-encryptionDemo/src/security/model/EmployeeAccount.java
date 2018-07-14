package security.model;

import java.io.Serializable;
public class EmployeeAccount implements Serializable {

	private String userId;
	private String password;
	private String lastName;
	private String firstName;
	private String position;
	private String department;
	
	public EmployeeAccount() {}
	
	public EmployeeAccount(String userId,String password, 
		String lastName, String firstName, String position, 
		String department) {
		
		setUserId(userId);
		setPassword(password);
		setLastName(lastName);
		setFirstName(firstName);
		setPosition(position);
		setDepartment(department);
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}	
}
