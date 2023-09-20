package Accadmey;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Addmission {

	@Id
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRegistnumb() {
		return registnumb;
	}

	public void setRegistnumb(int registnumb) {
		this.registnumb = registnumb;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	private int registnumb;
	private double fees;
	
	@ManyToOne
	Branch branch;
	
}
