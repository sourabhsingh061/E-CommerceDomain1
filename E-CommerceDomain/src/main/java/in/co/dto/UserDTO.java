package in.co.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import in.co.common.BaseDTO;

@Entity
@Table(name = "USER")
public class UserDTO extends BaseDTO {

	@Column(name = "FIRST_NAME", length = 50)

	private String firstName;

	@Column(name = "LAST_NAME", length = 50)
	private String lastName;

	@Column(name = "LOGINID", length = 50)
	private String loginId;
	@Column(name = "EMAIL", length = 50)
	private String email;

	@Column(name = "PASSWORD", length = 50)
	private String password;

	@Column(name = "ROLE", length = 50)
	private String role;

	@Column(name = "DOB", length = 50)
	private Date dob;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
