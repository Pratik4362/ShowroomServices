package Created.Showroom.Management.System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Created.Showroom.Management.System.DTO.StaffRequest;
import Created.Showroom.Management.System.entity.StaffEntity;
import Created.Showroom.Management.System.service.StaffService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/Staff")
public class StaffController {
	
	@Autowired
	StaffService staffService;
	
	@PostMapping("/Staffpost")
		public ResponseEntity<StaffEntity> data(@RequestBody @Valid StaffEntity datta){
			return new ResponseEntity<>(staffService.getStaff(datta),HttpStatus.CREATED);
		}
	}

//	
//	@PostMapping("/save")
//	public StaffEntity saveEntity(@RequestBody StaffEntity staffentity) {
//		return staffService.save(staffentity);
//	}
//	
//	@GetMapping("/getByid/{id}")
//	public StaffEntity getById(@PathVariable Long id){
//		return staffService.getById(id);
//	}
//	
//	@GetMapping("/getAll")
//	public List<StaffEntity> getAll() {
//		return staffService.getAll();
//	}
//	
//	@DeleteMapping("/delete/{id}")
//	public String delete(@PathVariable Long id) {
//		return staffService.deleteByid(id);
//	}
//	
//	@PutMapping("/update/{id}")
//	public StaffEntity update(@RequestBody StaffEntity staffentity,@PathVariable Long id) {
//		return staffService.update(staffentity, id);
//	}
//}









