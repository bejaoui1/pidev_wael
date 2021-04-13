package pidev.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Claim {
	
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Id 
	private int id ; 
	private String contnu ;
	private Categorie categorie ;
	@JsonIgnore
	@ManyToOne
	private Parent parent ;
	@JsonIgnore
	@ManyToOne
	private Jardin_enfant jardin_enfant;
	
	
	public Claim(int id, String contnu, Categorie categorie, Parent parent, Jardin_enfant jardin_enfant) {
		super();
		this.id = id;
		this.contnu = contnu;
		this.categorie = categorie;
		this.parent = parent;
		this.jardin_enfant = jardin_enfant;
	}

	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public String getContnu() {
		return contnu;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public Parent getParent() {
		return parent;
	}
	public Jardin_enfant getJardin_enfant() {
		return jardin_enfant;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setContnu(String contnu) {
		this.contnu = contnu;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	public void setJardin_enfant(Jardin_enfant jardin_enfant) {
		this.jardin_enfant = jardin_enfant;
	}
	
	
	
	
}
