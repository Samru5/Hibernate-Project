package com.capgemini.hibernate.impl;
import com.capgemini.hibernate.dao.*;
import org.hibernate.boot.registry.*;


import org.hibernate.boot.*;


import org.hibernate.*;


import javax.persistence.*;
import com.capgemini.hibernate.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.capgemini.hibernate.model.*;

public class PersonImpl implements PersonDao{


	public Person add(Person person)
	{
			SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			session.save(person);
			tx.commit();
			//SessionFactory.close();
		return person;

	}

}
