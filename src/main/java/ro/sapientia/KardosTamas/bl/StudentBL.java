package ro.sapientia.KardosTamas.bl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.sapientia.KardosTamas.pojo.StudentPojo;
import ro.sapientia.KardosTamas.service.StudentService;

@Service
public class StudentBL {

	@Autowired
	private StudentService studentService;
	
	public List<StudentPojo> listAllStudents() {
		System.out.println("----------->>>>>>>>" + (studentService == null));
		return studentService.listAllStudents();
	}
	public StudentPojo createStudent(StudentPojo student) throws Exception	 {
		// TODO leelenorizni a student pojo valie-e
		if (student == null) throw new Exception("Empty student found!");	
		if (student.getFirstName()==null || student.getFirstName().isEmpty()) throw new Exception("Student first name null or empty!");	
		return studentService.createStudent(student);
	}


	public void deleteById(Integer studentId) throws Exception {
		if (studentService.findStudentById(studentId)==null) throw new Exception("No student with this id!");
		studentService.deleteById(studentId);
		
	}

	public void updateStudent(Integer studentId,StudentPojo studentDetails) throws Exception {
		if (studentService.findStudentById(studentId)==null) throw new Exception("No student with this id!");
		if (studentDetails == null) throw new Exception("Empty student found!");	
		if (studentDetails.getFirstName()==null || studentDetails.getFirstName().isEmpty()) throw new Exception("Student first name null or empty!");	
		studentService.updateStudent(studentId,studentDetails);
		
	}

	public StudentPojo findStudentById(Integer studentId) {
		return studentService.findStudentById(studentId);
	}

}
