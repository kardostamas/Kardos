package ro.sapientia.KardosTamas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.sapientia.KardosTamas.bl.StudentBL;
import ro.sapientia.KardosTamas.pojo.StudentPojo;

@RestController	
@RequestMapping("/api")	
public class StudentController {

	@Autowired
	private StudentBL studentBL;
	
	@GetMapping("/students")
	public List<StudentPojo> getAllNotes() {
	    return studentBL.listAllStudents();
	}		
	
	
	
}
