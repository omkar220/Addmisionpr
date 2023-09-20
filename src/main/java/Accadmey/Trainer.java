package Accadmey;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainer {
	
	@Id
	private int id;
	private String trname;
	private String subject;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTrname() {
		return trname;
	}
	public void setTrname(String trname) {
		this.trname = trname;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
}
