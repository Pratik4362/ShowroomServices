package Created.Showroom.Management.System.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class StaffRequest {
	@NotNull(message="name is invalid")
	private String name;
	@Pattern(regexp = "^\\d{10}$",message="invalid number")
	private String contact;
	@NotNull(message="invalid city")
	private String city;
	@NotNull(message = "invalid address")
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
