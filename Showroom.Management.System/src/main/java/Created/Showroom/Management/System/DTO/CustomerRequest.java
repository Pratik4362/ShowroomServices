package Created.Showroom.Management.System.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class CustomerRequest {
	@NotNull(message ="name shouldn't not be null")
	private String name;
	@Email(message="invalid Email")
	private String email;
	@Pattern(regexp="^\\d{10}$",message="invalid number")
	private String contact; 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setContact(String contact) {
		this.contact=contact;
	}
	public String getContact() {
		return contact;
	}
}
