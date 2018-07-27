package ro.sapientia.KardosTamas.pojo;

import java.util.Date;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
	
@Entity
@Table(name = "student")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"created", "updated"}, 
        allowGetters = true)
public class StudentPojo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@NotBlank
	@Column(name = "first_name")
	private String firstName;
	
	@NotBlank
	@Column(name = "last_name")
	private String lastName;

	@NotBlank
	@Column(name = "department")
	private String department;
	
	@Column(name = "year")
	private Integer year;
	
	@Column(nullable = false, updatable = false,name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date created;
	
	@Column(nullable = false,name = "updated")
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
	private Date updated;
	
	@Column(name = "status")
	private Integer status;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return id + firstName + lastName + department + year + updated + created + status;
	}
}
