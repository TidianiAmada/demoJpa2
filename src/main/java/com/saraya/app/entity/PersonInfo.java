package com.saraya.app.entity;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person_list")
public class PersonInfo {
	@Column
	private Date naissance;
	@Column
	private Sexe sexe;
	@Id @Column
	private String name;
	
	
	public PersonInfo() {
		super();
	}


	public PersonInfo(String naissance, String sexe, String name) throws ParseException {
		super();
		this.naissance = preprocesserOfDateInput(naissance);
		this.sexe = preprocessorOfSexeInput(sexe);
		this.name = name;
	}

	public Date preprocesserOfDateInput(String date) throws ParseException {
		SimpleDateFormat formater= new SimpleDateFormat("yyyyMMdd"); 
		java.util.Date parsed = formater.parse(date);
		java.sql.Date dt = new java.sql.Date(parsed.getTime());
		return dt;
	}
	
	public Sexe preprocessorOfSexeInput(String sexe) {
		
		Sexe sx= Sexe.valueOf(sexe);
		return sx;
		}
	
	
	public PersonInfo(Date naissance, Sexe sexe, String name) {
		super();
		this.naissance = naissance;
		this.sexe = sexe;
		this.name = name;
	}


	@Override
	public String toString() {
		return "PersonInfo [naissance=" + naissance + ", sexe=" + sexe + ", name=" + name + "]";
	}


	/**
	 * @return the naissance
	 */
	public Date getNaissance() {
		return naissance;
	}


	/**
	 * @param naissance the naissance to set
	 */
	public void setNaissance(Date naissance) {
		this.naissance = naissance;
	}


	/**
	 * @return the sexe
	 */
	public Sexe getSexe() {
		return sexe;
	}


	/**
	 * @param sexe the sexe to set
	 */
	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	enum Sexe {
		M, F
	}
}
