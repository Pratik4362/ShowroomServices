package Created.Showroom.Management.System.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class StaffEntity {
	@Id
	private Long id;
	private String name;
	private String contact;
	private String city;
	private String address;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public static StaffEntity build(long id, String name, String city, String address) {
		StaffEntity staff= new StaffEntity();
		staff.setId(id);
		staff.setName(name);
		staff.setCity(city);
		staff.setAddress(address);
		return staff;
	}
	
}
