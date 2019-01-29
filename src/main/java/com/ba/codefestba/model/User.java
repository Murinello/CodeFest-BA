package com.ba.codefestba.model;

import java.time.*;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;


@Entity
@Table(name = "user")
public class User {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	 
	 @Column(name = "firstname")
	 @NotEmpty(message = "*Please provide your first name")
	 private String firstname; 
	 
	 @Column(name = "lastname")
	 @NotEmpty(message = "*Please provide your last name")
	 private String lastname;
	 
	 @Column(name = "email")
	 private String email;
	 
	 @Column(name = "password")
	 @Length(min = 5, message = "*Your password must have at least 5 characters")
	 private String password;
	 
	 @Column(name = "dni")
	 @NotEmpty(message = "*Please provide your DNI")
	 @Length(min = 9, message = "*Your DNI must have at least 9 characters")
	 private String dni;
	 
	 @Column(name = "birthdate")
	 @NotEmpty(message = "*Please provide your birthdate")
	 private LocalDate birthdate;
	 
	 @Column(name = "telephone")
	 private String telephone;
	 
	 @Column(name = "active")
	 private int active;
	 
	 @ManyToMany(cascade=CascadeType.ALL)
	 @JoinTable(name="user_role", joinColumns=@JoinColumn(name="user_id"), inverseJoinColumns=@JoinColumn(name="role_id"))
	 private Set<Role> roles;
	 
	 public int getId() {
		  return id;
		 }

	 public void setId(int id) {
		  this.id = id;
		 }

	 public String getFirstname() {
		  return firstname;
		 }

	 public void setFirstname(String firstname) {
		  this.firstname = firstname;
		 }

	 public String getLastname() {
		  return lastname;
		 }

	 public void setLastname(String lastname) {
		  this.lastname = lastname;
		 }
	 
	 public String getEmail() {
		  return email;
		 }

	 public void setEmail(String email) {
		  this.email = email;
		 }

	 public String getPassword() {
		  return password;
		 }

	 public void setPassword(String password) {
		  this.password = password;
		 }

	 public int getActive() {
		  return active;
		 }

	 public void setActive(int active) {
		  this.active = active;
		 }

	 public Set<Role> getRoles() {
		  return roles;
		 }

	 public void setRoles(Set<Role> roles) {
		  this.roles = roles;
		 }

}
