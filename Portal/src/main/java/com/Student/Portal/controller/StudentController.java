package com.Student.Portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Student.Portal.Service.StudentServiceImpl;
import com.Student.Portal.model.StudentDatabase;
@CrossOrigin(origins  = "http://localhost:5173")
@RestController
@RequestMapping("/students")

public class StudentController {

	@Autowired
	StudentServiceImpl sml;

	@GetMapping("/hello")
	String hello() {
		return "hi";
	}

	@PostMapping("/createss")
	StudentDatabase save_st(@RequestBody StudentDatabase sd) {
		return sml.save_student(sd);
	}

	@GetMapping("/allstudents")
	List<StudentDatabase> getAll() {
		return sml.get_Students();
	}
	@GetMapping("/one/{sid}")
	StudentDatabase getByidStud(@PathVariable Integer sid) {
		return sml.getByidStudent(sid);
	}

	@PutMapping("/update/{sid}")
	StudentDatabase update_stude(@RequestBody StudentDatabase sd, @PathVariable Integer sid) {
		return sml.update_student(sd, sid);
	}

	@DeleteMapping("/delete/{sid}")
	void deleted_student(@PathVariable Integer sid) {
		sml.delete(sid);
	}
}