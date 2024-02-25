package Created.Showroom.Management.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Created.Showroom.Management.System.entity.ServiceEntity;
import Created.Showroom.Management.System.repository.ServiceRepository;

@Service
public class ServiceService {
	
	@Autowired
	ServiceRepository servicerepository;

	public ServiceEntity save(ServiceEntity serviceentity) {
		return servicerepository.save(serviceentity);
	}
	
	public ServiceEntity getById(Long id) {
		return servicerepository.findById(id).get();
	}
	
	public List<ServiceEntity> getAll(){
		return servicerepository.findAll();
	}
	
	public String deleteById(Long id){
		servicerepository.deleteById(id);
		return "Record deleted successfully";
	}
	
	public ServiceEntity update(ServiceEntity correctEntity, Long id) {
		ServiceEntity serviceentity =servicerepository.findById(id).get();
		if(correctEntity.getServiceName()!=null) {
			serviceentity.setServiceName(correctEntity.getServiceName());
		}
		if(correctEntity.getServiceCost()!=0) {
			serviceentity.setServiceCost(correctEntity.getServiceCost());
		}
		return servicerepository.save(serviceentity);
	}
}




















