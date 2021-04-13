package pidev.service;

import java.util.List;

import pidev.entities.Demande;
import pidev.entities.Formulaire;

public interface IParentService {

	public Demande addDemande(int idparnet,int idjardin);
	public List<Demande>afficherReputation(int idparent);
	public void reponseFormulaire(int idparent,Formulaire f,int idjardin);
	
}
