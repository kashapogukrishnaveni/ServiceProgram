package com.xworkz.spring.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.spring.entity.ValentineServiceEntity;

@Component
public class ValentineDAOImpl implements ValentineDAO  {
	
	public ValentineDAOImpl() {
		System.out.println("Created \t "+this.getClass().getSimpleName());
	}

	public Integer save(ValentineServiceEntity entity) {
		
		try {
			Configuration cfg = new Configuration();
			cfg.configure("mysql.xml");
			cfg.addAnnotatedClass(ValentineServiceEntity.class);
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();
			System.out.println("Transaction started");
			session.beginTransaction();
			session.save(entity);
			System.out.println("Transaction comited");
			session.getTransaction().commit();
			session.close();
			factory.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}


