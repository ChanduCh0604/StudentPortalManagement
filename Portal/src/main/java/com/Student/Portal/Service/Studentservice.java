package com.Student.Portal.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Student.Portal.model.StudentDatabase;

@Service
public interface Studentservice{

	StudentDatabase save_student(StudentDatabase sd);
	List<StudentDatabase> get_Students();
	StudentDatabase update_student(StudentDatabase sd,Integer sid);
	void delete(Integer sid);
	StudentDatabase getByidStudent(Integer sid);
}
