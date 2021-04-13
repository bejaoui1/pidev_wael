package pidev.entities;


import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Demande {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private  int id;
private  int reputation;
@JsonIgnore
@ManyToOne
private Parent parent;
private String testjardin;

private boolean state=false ;
public Demande( int reputation, Parent parent, String testjardin, boolean state) {
	super();

	this.reputation = reputation;
	this.parent = parent;
	this.testjardin = testjardin;
	
	this.state = state;
}
public Demande() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public int getReputation() {
	return reputation;
}
public Parent getParent() {
	return parent;
}
public String getTestjardin() {
	return testjardin;
}


public void setId(int id) {
	this.id = id;
}
public void setReputation(int reputation) {
	this.reputation = reputation;
}
public void setParents(Parent parent) {
	this.parent = parent;
}
public void setTestjardin(String testjardin) {
	this.testjardin = testjardin;
}

public boolean getState() {
	return state;
}
public void setState(boolean state) {
	this.state = state;
}



}
