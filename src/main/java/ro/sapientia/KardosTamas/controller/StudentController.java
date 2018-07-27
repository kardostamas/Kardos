package ro.sapientia.KardosTamas.controller;

import java.util.List;
import javax.validation.Valid;

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

import ro.sapientia.KardosTamas.bl.StudentBL;
import ro.sapientia.KardosTamas.pojo.StudentPojo;

@RestController	
@CrossOrigin(origins = "*")
@RequestMapping("/api")	
public class StudentController {

	@Autowired
	private StudentBL studentBL;
	
	@GetMapping("/students")
	public List<StudentPojo> getAllNotes() {
	    return studentBL.listAllStudents();
	}
	
	@PostMapping("/students")
	public StudentPojo createStudent(@RequestBody StudentPojo student) {
		try {
			return studentBL.createStudent(student);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@GetMapping("/students/{id}")
	public StudentPojo getStudentById(@PathVariable(value = "id") Integer studentId) {
			return studentBL.findStudentById(studentId);

	}
	
	@PutMapping("/students/{id}")
	public StudentPojo updateStudent(@PathVariable(value = "id") Integer studentId,
            @Valid @RequestBody StudentPojo studentDetails) {
		try {
			studentBL.updateStudent(studentId,studentDetails);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}
	
	@DeleteMapping("/students/{id}")
	public StudentPojo deleteStudentById(@PathVariable(value = "id") Integer studentId) {
		try {
				studentBL.deleteById(studentId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;	
	}
	
	
}
