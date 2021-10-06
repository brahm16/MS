package com.example.demo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;




@Entity
public class Candidate  implements Serializable, Cloneable {

	private static final long serialVersionUID = -7049957706738879274L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	String nom, prenom,email;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Candidate(String nom) {
		super();
		this.nom = nom;
	}
	public Candidate() {
		super();
	}
	
	
	
}
