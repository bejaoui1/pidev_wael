package pidev.entities;


import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Jardin_enfant {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
 private String name;
  private int num_reclamation;
  private int num_like;
  private int num_dislike;
  private int moyenne_satisfaction_actuelle;
  private int historique_moyenne;
  private int reputation;
  private boolean state=false;
  private int somme;
  private int numForm;
 	@OneToMany(mappedBy="jardin_enfant")
	@JsonIgnore
	private List<Parent> parents;
	@ManyToOne
	@JsonIgnore
	private Admin admin;
	@JsonIgnore
	@OneToMany(mappedBy = "jardin_enfant")
private	List<Claim> claims;
	
	public int getSomme() {
		return somme;
	}
	public void setSomme(int somme) {
		this.somme = somme;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getNum_reclamation() {
		return num_reclamation;
	}
	public int getNum_like() {
		return num_like;
	}
	public int getNum_dislike() {
		return num_dislike;
	}
	public int getMoyenne_satisfaction_actuelle() {
		return moyenne_satisfaction_actuelle;
	}
	public int getHistorique_moyenne() {
		return historique_moyenne;
	}
	public List<Parent> getParents() {
		return parents;
	}
	public Admin getAdmin() {
		return admin;
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
	public void setNum_reclamation(int num_reclamation) {
		this.num_reclamation = num_reclamation;
	}
	public void setNum_like(int num_like) {
		this.num_like = num_like;
	}
	public void setNum_dislike(int num_dislike) {
		this.num_dislike = num_dislike;
	}
	public void setMoyenne_satisfaction_actuelle(int moyenne_satisfaction_actuelle) {
		this.moyenne_satisfaction_actuelle = moyenne_satisfaction_actuelle;
	}
	public void setHistorique_moyenne(int historique_moyenne) {
		this.historique_moyenne = historique_moyenne;
	}
	public void setParents(List<Parent> parents) {
		this.parents = parents;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public void setClaims(List<Claim> claims) {
		this.claims = claims;
	}
	public int getReputation() {
		return reputation;
	}
	public void setReputation(int reputation) {
		this.reputation = reputation;
	}
	public boolean getState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public int getNumForm() {
		return numForm;
	}
	public void setNumForm(int numForm) {
		this.numForm = numForm;
	}
	
	
	
	

}
