package ro.sapientia.KardosTamas.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.sapientia.KardosTamas.pojo.StudentPojo;
import ro.sapientia.KardosTamas.service.StudentService;

@Service
public class StudentBL {

	@Autowired
	private StudentService studentService;
	
	public List<StudentPojo> listAllStudents() {
		return studentService.listAllStudents();
	}
}
