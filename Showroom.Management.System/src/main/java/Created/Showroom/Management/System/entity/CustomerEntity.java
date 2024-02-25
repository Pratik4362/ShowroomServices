package Created.Showroom.Management.System.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class CustomerEntity {
	@Id
	@GeneratedValue
	
	private Long id;
	private String name;
	private String email;
	private String contact;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public static CustomerEntity build(long id, String name, String email, String contact) {
		CustomerEntity custom=new CustomerEntity();
		custom.setId(id);
		custom.setName(name);
		custom.setContact(contact);
		custom.setEmail(email);
		return custom;
	}
	
	
}
