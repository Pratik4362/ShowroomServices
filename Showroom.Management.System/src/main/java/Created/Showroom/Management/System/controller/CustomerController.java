 package Created.Showroom.Management.System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Created.Showroom.Management.System.DTO.CustomerRequest;
import Created.Showroom.Management.System.entity.CustomerEntity;
import Created.Showroom.Management.System.service.CustomerService;
import jakarta.validation.Valid;
@RequestMapping("/map")
@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/savedata")
	public ResponseEntity<CustomerEntity> createData(@RequestBody @Valid CustomerRequest crequest){
		return new ResponseEntity<>(customerService.getdata(crequest),HttpStatus.CREATED);
	}
}
	
//	@PostMapping("/saveData")
//	public CustomerEntity createdata(@RequestBody CustomerEntity savedata) {
//		return customerService.createdata(savedata);
//	}
//	
//	@GetMapping("/getdata/{id}")
//	public CustomerEntity getdata(@PathVariable Long id) {
//		return customerService.getbyid(id);
//	}
//	@GetMapping("/getAll")
//	public List<CustomerEntity> getAll(CustomerEntity All){
//		return customerService.getAll(All);
//	}
//	@DeleteMapping("/delete/{id}")
//	public String deleteData(@PathVariable Long id) {
//		return customerService.deletebyid(id);
//	}
//	@DeleteMapping("/deleteall")
//	public String deleteAll() {
//		return customerService.deleteAll();
//	}
//	@PutMapping("/update/{id}")
//		public CustomerEntity updatebyId(@RequestBody CustomerEntity c,@PathVariable Long id) {
//			return customerService.updateByid(c, id);
//		}
//	}


