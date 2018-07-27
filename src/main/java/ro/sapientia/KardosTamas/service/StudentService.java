package ro.sapientia.KardosTamas.service;

import java.util.List;

import ro.sapientia.KardosTamas.pojo.StudentPojo;

public interface StudentService {

	public List<StudentPojo> listAllStudents();	
	
	public StudentPojo createStudent(StudentPojo student);
	
	public void deleteById(Integer studentId);

	public void updateStudent(Integer studentId, StudentPojo studentDetails);

	public StudentPojo findStudentById(Integer studentId);

}	
