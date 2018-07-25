package ro.sapientia.KardosTamas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ro.sapientia.KardosTamas.pojo.StudentPojo;

@Repository
public interface StudentDAO extends JpaRepository<StudentPojo, Integer>{	

}
