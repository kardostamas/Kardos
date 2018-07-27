package ro.sapientia.KardosTamas.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import ro.sapientia.KardosTamas.dao.StudentDAO;
import ro.sapientia.KardosTamas.pojo.StudentPojo;
import ro.sapientia.KardosTamas.service.StudentService;

@Service("StudentService")
public class StudentServiceImpl implements StudentService	 {

	@Autowired
	private StudentDAO studentsDAO;

	@Override
	public List<StudentPojo> listAllStudents() {
		return studentsDAO.findAll();
	}

	@Override
	public StudentPojo createStudent(StudentPojo student) {
		return studentsDAO.save(student);
	}

	@Override
	public void deleteById(Integer studentId) {
		studentsDAO.deleteById(studentId);
		
	}

	@Override
	public void updateStudent(Integer studentId,StudentPojo studentDetails) {
		StudentPojo student = studentsDAO.findById(studentId)
	    		.orElseThrow(() -> new ResourceNotFoundException("Student"));
		
		student.setId(studentId);
	    student.setLastName(studentDetails.getLastName());
	    student.setFirstName(studentDetails.getFirstName());
	    student.setDepartment(studentDetails.getDepartment());
	    student.setYear(studentDetails.getYear());
	    
	    Timestamp stamp = new Timestamp(System.currentTimeMillis());
	    Date date = new Date(stamp.getTime());
	    student.setUpdated(date);
		
		studentsDAO.save(student);
	}

	@Override
	public StudentPojo findStudentById(Integer studentId) {
		// TODO Auto-generated method stub
		return studentsDAO.findById(studentId)
				.orElseThrow(() -> new ResourceNotFoundException("Student"));
	}

}