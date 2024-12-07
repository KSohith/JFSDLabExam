package com.klef.jfsd.exam;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "client_table")
public class Client 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cid")
	private int id;
	@Column(name = "cname",length = 50,nullable = false)
	private String name;
	@Column(name = "cgender",length = 50,nullable = false)
	private String gender;
	@Column(name = "cage",nullable = false)
	private double age;
	@Column(name = "clocation",length = 50,nullable = false)
	private String location;
	@Column(name = "cemail",length = 50,nullable = false)
	private String email;
	@Column(name = "ccontact",length = 50,nullable = false)
	private String contact;
	public Client() {
		// TODO Auto-generated constructor stub
	}
	public Client(int id, String name, String gender, double age, String location, String email, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.location = location;
		this.email = email;
		this.contact = contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", location=" + location
				+ ", email=" + email + ", contact=" + contact + "]";
	}
}
