package com.ninja.DevOps_Demo_Employee_Management_API_Project;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@DynamicInsert
@DynamicUpdate

@Entity(name="employee")  
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
String name;
String gender;
int age;
String phone;
String email;
String city;
String country;
String address;
String postalcode;
String department;
String designation;
double salary;
String dateOfJoining;
String employmentType;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPostalcode() {
	return postalcode;
}
public void setPostalcode(String postalcode) {
	this.postalcode = postalcode;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDateOfJoining() {
	return dateOfJoining;
}
public void setDateOfJoining(String dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}
public String getEmploymentType() {
	return employmentType;
}
public void setEmploymentType(String employmentType) {
	this.employmentType = employmentType;
}
}


