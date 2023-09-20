package Accadmey;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Branch {
@Id
	private int id;
	public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getBrname() {
	return brname;
}

public void setBrname(String brname) {
	this.brname = brname;
}

public long getContactnumb() {
	return contactnumb;
}

public void setContactnumb(long contactnumb) {
	this.contactnumb = contactnumb;
}
	public List<Trainer> getTrainer() {
	return trainer;
}

public void setTrainer(List<Trainer> trainer) {
	this.trainer = trainer;
}

private String brname;
	private long contactnumb;
	
	@OneToMany
	List<Trainer >   trainer;
	
	

}
