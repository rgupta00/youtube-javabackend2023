package com.demo.one2one.uni;

import com.demo.factory.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class DemoTesterN_Plus_OneSol {

	public static void main(String[] args) {
		
		Employee employee1=new Employee("raj");
		Employee employee2=new Employee("ekta");
		Employee employee3=new Employee("gun");
		Employee employee4=new Employee("keshav");
		Employee employee5=new Employee("vikas");
		
		Parking parking1=new Parking("A12");
		Parking parking2=new Parking("M2");
		Parking parking3=new Parking("B2");
		Parking parking4=new Parking("T11");
		Parking parking5=new Parking("U12");
		
		
		parking1.setEmployee(employee1);
		parking2.setEmployee(employee2);
		parking3.setEmployee(employee3);
		parking4.setEmployee(employee4);
		parking5.setEmployee(employee5);
		
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session session = factory.openSession();// getCurrentSession (web application spring)

		//from Parking p join fetch p.employee Employee
		List<Parking> parkings=
				session.createQuery("from Parking p join fetch p.employee Employee").getResultList();

		for(Parking parking : parkings) {
			System.out.println(parking.getParkingLocation());
			System.out.println(parking.getEmployee().getEmpName());
		}


//		Transaction tx=session.getTransaction();
//
//		try{
//			tx.begin();
//			session.save(parking1);
//			session.save(parking2);
//			session.save(parking3);
//			session.save(parking4);
//			session.save(parking5);
//			//due to cascading in dont need to that   session.save(employee1);
//
//			tx.commit();
//		}catch (HibernateException ex){
//			System.out.println(ex);
//			tx.rollback();
//		}



		session.close();
		factory.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Spring tx*
//		Transaction tx = session.getTransaction();
//		try {
//			tx.begin();		
//			Parking parking=session.get(Parking.class, 5);
//			session.delete(parking);
//			
//			tx.commit();
//			
//		} catch (HibernateException ex) {
//			tx.rollback();
//			ex.printStackTrace();
//		}

	}

}



//select p from Parking p
	/*	List<Parking>parkings=session
				.createQuery("from Parking p join fetch p.employee Employee").getResultList();
		System.out.println("------------------------------------");
		for(Parking parking : parkings) {
			System.out.println(parking);
			//System.out.println(parking.getEmployee());
		}
		*/


//		for(Parking parking : parkings) {
//			System.out.println(parking.getEmployee());
//		}