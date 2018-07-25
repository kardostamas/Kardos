package ro.sapientia.KardosTamas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.sapientia.KardosTamas.dao.StudentDAO;
import ro.sapientia.KardosTamas.pojo.StudentPojo;

@Service	
public class StudentServiceImpl implements StudentService	 {

	@Autowired
	private StudentDAO studentDAO;
	
	@Override
	public List<StudentPojo> listAllStudents() {
		return studentDAO.findAll();
	}

}