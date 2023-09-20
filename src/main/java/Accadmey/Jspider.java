package Accadmey;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Jspider {
	
	@Id
private int id;
private String name;

@OneToMany
   List<Branch>  branch;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<Branch> getBranch() {
	return branch;
}

public void setBranch(List<Branch> branch) {
	this.branch = branch;
}



}
