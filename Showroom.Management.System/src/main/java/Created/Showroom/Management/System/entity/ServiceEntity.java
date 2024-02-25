package Created.Showroom.Management.System.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ServiceEntity {
	@Id
	private Long id;
	private String serviceName;
	private int serviceCost;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public int getServiceCost() {
		return serviceCost;
	}
	public void setServiceCost(int serviceCost) {
		this.serviceCost = serviceCost;
	}
	
}
