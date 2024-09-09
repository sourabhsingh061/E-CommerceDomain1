package in.co.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import in.co.common.BaseDTO;
import in.co.common.BaseForm;
import in.co.dto.UserDTO;

public class UserForm extends BaseForm {

	@NotEmpty(message = "Please enter the first name")
	private String firstName;
	@NotEmpty(message = "Please enter the last name")
	private String lastName;
	@NotEmpty(message = "Please enter the loginId")
	private String loginId;
	@NotEmpty(message = "Please enter the email")
	private String email;
	@NotEmpty(message = "Please enter the password ")
	private String password;
	@NotEmpty(message = "Please enter the role")
	private String role;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@NotNull(message = "please enter dob")
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
	public BaseDTO getDTO() {

		UserDTO dto = initDTO(new UserDTO());
		dto.setFirstName(firstName);
		dto.setLastName(lastName);
		dto.setLoginId(loginId);
		dto.setPassword(password);
		dto.setDob(dob);
		dto.setRole(role);
		dto.setEmail(email);
		return dto;
	}
}
