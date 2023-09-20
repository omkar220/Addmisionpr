package Accadmey;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Courses {
	@Id
	
  private int id;
  private String crname;
  
  @ManyToMany
   List<Student >  student;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCrname() {
	return crname;
}

public void setCrname(String crname) {
	this.crname = crname;
}

public List<Student> getStudent() {
	return student;
}

public void setStudent(List<Student> student) {
	this.student = student;
}





}
