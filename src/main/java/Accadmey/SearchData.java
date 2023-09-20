package Accadmey;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SearchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("omkar");
		EntityManager em=emf.createEntityManager();
		
		Branch b=em.find(Branch.class, 2);
		Trainer t1=em.find(Trainer.class, 2);
		Student se=em.find(Student.class, 2);
		System.out.println(b.getId());
		System.out.println(b.getBrname());
		System.out.println(b.getContactnumb());
	  //  System.out.println(b.getTrainer());
	
		
		System.out.println("Trainer details");
		
		System.out.println(t1.getId());
		System.out.println(t1.getSubject());
		System.out.println(t1.getTrname());
		
		System.out.println("Student Details");
		System.out.println(se.getId());
		System.out.println(se.getStname());
		System.out.println(se.getYop());
		System.out.println(se.getAdmi());

	}

}
