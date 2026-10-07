package com.Student.Portal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.Student.Portal.Repo.StudentRepo;
import com.Student.Portal.model.StudentDatabase;

@Service
public class StudentServiceImpl implements Studentservice  {

	@Autowired
	StudentRepo studentrepo;
	@Override
	public StudentDatabase save_student(StudentDatabase sd) {
		// TODO Auto-generated method stub
		
		return studentrepo.save(sd);
	}
	@Override
	public List<StudentDatabase> get_Students() {
		// TODO Auto-generated method stub
		return studentrepo.findAll();
	}
	@Override
	public StudentDatabase update_student(@RequestBody StudentDatabase sd,Integer sid) {
		// TODO Auto-generated method stub
		
		StudentDatabase st = studentrepo.getById(sid);
		st.setStudent_Fname(sd.getStudent_Fname());
		st.setStudent_Lname(sd.getStudent_Lname());
		st.setAge(sd.getAge());
		return studentrepo.save(st);
	}
	@Override
	public void delete(Integer sid) {
		// TODO Auto-generated method stub
		
		studentrepo.deleteById(sid);
		
		
	}
	@Override
	public StudentDatabase getByidStudent(Integer sid) {
		// TODO Auto-generated method stub
		return studentrepo.findById(sid).orElseThrow();
	}

}
