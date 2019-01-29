package com.ba.codefestba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "activity")
public class Activity {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	 
	 @Column(name = "title")
	 private String title; 
	 
	 @Column(name = "description")
	 private String description;
	 
	 @Column(name = "requirements")
	 private String requirements;
	 
	 public int getId() {
		  return id;
		 }

	 public void setId(int id) {
		  this.id = id;
		 }

	 public String getTitle() {
		  return title;
		 }

	 public void setTitle(String title) {
		  this.title = title;	 
		 }
	 
	 public String getDescription() {
		  return description;
		 }

	 public void setDescription(String description) {
		  this.description = description;	 
		 }
	 
	 public String getRequirements() {
		  return requirements;
		 }

	 public void setRequirements(String requirements) {
		  this.requirements = requirements;	 
		 }
}
