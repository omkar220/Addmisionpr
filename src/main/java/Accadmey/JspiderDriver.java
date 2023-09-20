package Accadmey;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JspiderDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("omkar");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Jspider j=new Jspider();
		j.setId(1);
		j.setName("pune");
		
		Branch br=new Branch();
		br.setId(1);
		br.setBrname("Deccan");
		br.setContactnumb(883221545);
		
		Branch br1=new Branch();
		br1.setId(2);
		br1.setBrname("Wakad");
		br1.setContactnumb(883221545);
	     
		Branch br2=new Branch();
		br2.setId(3);
		br2.setBrname("karvenagar");
		br2.setContactnumb(883221545);
	     
		Branch br3=new Branch();
		br3.setId(4);
		br3.setBrname("Bhudhvarpeth");
		br3.setContactnumb(883221545);
		
		List<Branch>b=new ArrayList<Branch>();
		b.add(br);
		b.add(br1);
		b.add(br2);
		b.add(br3);
		
		j.setBranch(b);
		
		Trainer tr=new Trainer();
		tr.setId(1);
		tr.setSubject("Java");
        tr.setTrname("Tejus");
        

		Trainer tr1=new Trainer();
		tr1.setId(2);
		tr1.setSubject("phython");
        tr1.setTrname("Dinga");
        

		Trainer tr2=new Trainer();
		tr2.setId(3);
		tr2.setSubject(".net");
        tr2.setTrname("Ringa");
        

		Trainer tr3=new Trainer();
		tr3.setId(4);
		tr3.setSubject("sql");
        tr3.setTrname("Ankur");
        
        List<Trainer>t=new ArrayList<Trainer>();
        t.add(tr);
        t.add(tr1);
        t.add(tr2);
        t.add(tr3);
        
        br.setTrainer(t);
      //  br1.setTrainer(t);
        
		
		
		Addmission add=new Addmission();
		add.setId(1);
		add.setRegistnumb(101);
		add.setFees(45036);
		add.setBranch(br);
		
		Addmission add1=new Addmission();
		add1.setId(2);
		add1.setRegistnumb(102);
		add1.setFees(45036);
		add.setBranch(br1);
		
		Addmission add2=new Addmission();
		add2.setId(3);
		add2.setRegistnumb(103);
		add2.setFees(45036);
		add.setBranch(br2);
		
		Addmission add3=new Addmission();
		add3.setId(4);
		add3.setRegistnumb(104);
		add3.setFees(45036);
		add3.setBranch(br3);
		
		Student st=new Student();
		st.setId(1);
		st.setStname("omkar");
		st.setYop("10/aug/2022");
		st.setAdmi(add);
		
		Student st1=new Student();
		st1.setId(2);
		st1.setStname("aks");
		st1.setYop("10/aug/2022");
		st1.setAdmi(add1);
		
		Student st3=new Student();
		st3.setId(3);
		st3.setStname("Sumit");
		st3.setYop("10/aug/2022");
		st3.setAdmi(add2);
		
		Student st4=new Student();
		st4.setId(4);
		st4.setStname("Ram");
		st4.setYop("10/aug/2022");
		st4.setAdmi(add3);
		
		List<Student>s1=new ArrayList<Student>();
		s1.add(st);
		s1.add(st1);
		s1.add(st3);
		s1.add(st4);
		
	
		
		Courses cr=new Courses();
		cr.setId(1);
		cr.setCrname("devloper");
		
		Courses cr1=new Courses();
		cr1.setId(2);
		cr1.setCrname("fullstack");
		
		Courses cr2=new Courses();
		cr2.setId(3);
		cr2.setCrname("fontenddev");
		
		Courses cr3=new Courses();
		cr3.setId(4);
		cr3.setCrname("debvops");
		
		cr.setStudent(s1);
		
		
		et.begin();
		em.persist(j);
		em.persist(br);
		em.persist(br1);
		em.persist(br2);
		em.persist(br3);
		em.persist(tr);
		em.persist(tr1);
		em.persist(tr2);
		em.persist(tr3);
		em.persist(add);
		em.persist(add1);
		em.persist(add2);
		em.persist(add3);
		em.persist(st);
		em.persist(st1);
		em.persist(st3);
		em.persist(st4);
		em.persist(cr);
		em.persist(cr1);
		em.persist(cr2);
		em.persist(cr3);
		
		et.commit();
		
		
		

	}

}
