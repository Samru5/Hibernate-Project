package com.capgemini.hibernate.test;
import com.capgemini.hibernate.impl.*;
import com.capgemini.hibernate.dao.*;
import  com.capgemini.hibernate.model.*;
public class Main{

public static void main(String args[]){

	PersonDao p=new PersonImpl();
	p.add(new Person(102,"Seema"));
	System.out.println("Successful");

	}
}
			
				

