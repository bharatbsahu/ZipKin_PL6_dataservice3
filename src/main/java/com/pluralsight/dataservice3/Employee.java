package com.pluralsight.dataservice3;

import javax.persistence.*;


@Entity
@Table(name = "employees")
public class Employee {
	
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private int salary;
    
	public Employee() {
		//super();
	}

	public Employee(long id, String firstName, String lastName, String emailId, int salary) {
		//super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.salary = salary;
	}
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	@Column (name = "first_name", nullable = false)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column (name = "last_name", nullable = false)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column (name = "email_address", nullable = false)
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column (name = "salary", nullable = false)
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", salary=" + salary + ", getId()=" + getId() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getEmailId()=" + getEmailId() + ", getSalary()=" + getSalary()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
