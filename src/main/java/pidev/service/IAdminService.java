package pidev.service;

import java.util.List;

import pidev.entities.Demande;
import pidev.entities.Formulaire;

public interface IAdminService {
 
	public List<Demande>getAllDemande();
	public void accepteDemande(int id_demande);
	public void AddFrmulaire(Formulaire f);
	
}
