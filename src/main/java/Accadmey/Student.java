package Accadmey;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public String getYop() {
		return yop;
	}

	public void setYop(String yop) {
		this.yop = yop;
	}

	public Addmission getAdmi() {
		return admi;
	}

	public void setAdmi(Addmission admi) {
		this.admi = admi;
	}

	private String stname;
	private String yop;
	//private String coursename;
	
	@OneToOne
	Addmission admi;
	
}
