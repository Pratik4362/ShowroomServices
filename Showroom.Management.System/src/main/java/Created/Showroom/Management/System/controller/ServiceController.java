package Created.Showroom.Management.System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Created.Showroom.Management.System.entity.ServiceEntity;
import Created.Showroom.Management.System.service.ServiceService;

@RestController
@RequestMapping("/service")
public class ServiceController {
	
	@Autowired
	ServiceService serviceservice;
	
	@PostMapping("/save")
	public ServiceEntity save(@RequestBody ServiceEntity serviceentity) {
		return serviceservice.save(serviceentity);
	}
	
	@GetMapping("/getbyid/{id}")
	public ServiceEntity getByid(@PathVariable Long id) {
		return serviceservice.getById(id);
	}
	
	@GetMapping("/getAll")
	public List<ServiceEntity> getall(){
		return serviceservice.getAll();
	}
	
	@PutMapping("/update/{id}")
	public ServiceEntity update(@RequestBody ServiceEntity entity ,@PathVariable Long id) {
		return serviceservice.update(entity, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete (@PathVariable Long id) {
		return serviceservice.deleteById(id);
	}
	
}
