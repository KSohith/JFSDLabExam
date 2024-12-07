package com.klef.jfsd.exam;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ClientDemo 
{
	public static void main(String[] args) 
	{
		ClientDemo cd = new ClientDemo();
		//cd.addClient();
		cd.viewallClients();
	}
	
	public void addClient()
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		Transaction transaction = session.beginTransaction();

		Client cl = new Client();
		cl.setName("Sohith");
		cl.setGender("Male");
		cl.setAge(20);
		cl.setLocation("Guntur");
		cl.setEmail("sohith@gmail.com");
		cl.setContact("9876543210");

		session.persist(cl);
		transaction.commit();
		System.out.println("Client Added Successfully");

		session.close();
		sf.close();
	}
	
	public void viewallClients()
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		String hql = "from Client";
		Query<Client> qry = session.createQuery(hql, Client.class);
		List<Client> cl = qry.getResultList();
		
		System.out.println("Total Clients : " + cl.size());
		
		for(Client c : cl)
		{
			System.out.println("ID:" + c.getId());
			System.out.println("Name:" + c.getName());
			System.out.println("Gender:" + c.getGender());
			System.out.println("Age:" + c.getAge());
			System.out.println("Location:" + c.getLocation());
			System.out.println("Email:" + c.getEmail());
			System.out.println("Contact:" + c.getContact());
		}
		session.close();
		sf.close();
	}
}
