package pidev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pidev.entities.Demande;
import pidev.entities.Formulaire;
import pidev.entities.Parent;
import pidev.repository.IDemandeRepository;
import pidev.repository.IFormulaire;
import pidev.repository.IParentRepository;

@Service
public class AdminService  implements IAdminService{
	
	@Autowired
	IDemandeRepository demandeRepository;
	@Autowired
	IFormulaire  formRepos;
	@Autowired 
	IParentRepository parentRepos;
	@Override
	public List<Demande> getAllDemande() {
		
		return demandeRepository.findAll();
	}

	@Override
	public void accepteDemande(int id_demande) {
		Demande d=demandeRepository.findById(id_demande).orElse(null);
		d.setState(true);
		demandeRepository.save(d);
		
	}

	@Override
	public void AddFrmulaire(Formulaire f) {
		formRepos.save(f);
		Formulaire form=formRepos.findById(f.getId()).orElse(null);
		List<Parent>p= parentRepos.findAll();
		for(Parent parent:p) {
			
			parent.setFormulaire(form);
			parentRepos.save(parent);
		}
		
	}


}
