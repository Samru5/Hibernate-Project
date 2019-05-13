package com.capgemini.hibernate.model;
import javax.persistence.*; 
@Entity
public class Person{

@Id
public int id;
public String name;


	public Person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	public String toString()
	{
		return "Id is +id+ Name is +name";
	}
}
