package pidev.entities;

import java.util.List;

import javax.persistence.*;

@Entity
public class Parent {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private	String name;
	private	String email;
	private boolean demande=false;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Jardin_enfant jardin_enfant;
	@OneToMany(mappedBy = "parent")
	private List<Claim> claims;
	@OneToMany(mappedBy = "parent")
	private List<Demande> demandes;
	@ManyToOne 
	private Formulaire formulaire;
	public List<Demande> getDemandes() {
		return demandes;
	}
	public void setDemandes(List<Demande> demandes) {
		this.demandes = demandes;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public Jardin_enfant getJardin_enfant() {
		return jardin_enfant;
	}
	public List<Claim> getClaims() {
		return claims;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setJardin_enfant(Jardin_enfant jardin_enfant) {
		this.jardin_enfant = jardin_enfant;
	}
	public void setClaims(List<Claim> claims) {
		this.claims = claims;
	}
	public boolean getDemande() {
		return demande;
	}
	public void setDemande(boolean demande) {
		this.demande = demande;
	}
	public Formulaire getFormulaire() {
		return formulaire;
	}
	public void setFormulaire(Formulaire formulaire) {
		this.formulaire = formulaire;
	}
	

}
