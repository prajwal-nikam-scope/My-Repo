package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Controller {

	@Autowired
	StudentRepo stdRepo;
	
	@PostMapping("/add")
	public String addAll(@RequestBody Student std) {
		stdRepo.save(std);
		return "Information add successfully";
	}
	
	@GetMapping("/get")
	public List<Student> getAll() {
		List<Student> stdList = new ArrayList<>();
//		Student obj = stdRepo.findById(id).get();
//		String name = obj.getCity();
		stdRepo.findAll().forEach(stdList::add);
		return stdList;
	}
	
	@PutMapping("/update")
	public String updateAll(@RequestParam int id,@RequestBody Student std) {
		Student stdObj = stdRepo.findById(id).get();
		stdObj.setCity(std.getCity());
		stdObj.setName(std.getName());
		stdObj.setRoll(std.getRoll());
		stdRepo.save(stdObj);
		return "update successfully";
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam int id) {		
		stdRepo.deleteById(id);
		return "Deleted successfully";
	}
}
