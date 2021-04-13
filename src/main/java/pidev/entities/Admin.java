package pidev.entities;

import java.util.List;

import javax.persistence.*;

@Entity
public class Admin {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
private String name;
@OneToMany(mappedBy = "admin")
private List<Jardin_enfant>jardin_enfants;
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public List<Jardin_enfant> getJardin_enfants() {
	return jardin_enfants;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setJardin_enfants(List<Jardin_enfant> jardin_enfants) {
	this.jardin_enfants = jardin_enfants;
}


}
