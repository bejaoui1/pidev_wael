package pidev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pidev.entities.Claim;
import pidev.entities.Demande;
import pidev.entities.Formulaire;
import pidev.service.IParentService;

@RestController
@RequestMapping("/parent")
public class DemandeResource {

	@Autowired 
	IParentService parentService;
	//http://localhost:8082//parent/adddemande/2/1
	@PostMapping("adddemande/{parent_id}/{jardin_id}")
	public ResponseEntity<Demande> adddemande(@PathVariable("parent_id") int id,@PathVariable("jardin_id")int idjardin ){
		Demande d= parentService.addDemande(id, idjardin);
		return new ResponseEntity<Demande>(d, HttpStatus.CREATED);
	}
	//http://localhost:8082/parent/reputation/2
	@GetMapping("reputation/{parent_id}")
	public ResponseEntity<List<Demande>>afficherReputation(@PathVariable("parent_id") int id){
		List<Demande> i= parentService.afficherReputation(id);
		return new ResponseEntity<>(i, HttpStatus.OK);
	}
	//http://localhost:8082/parent/reponseFormulaire/
	@PostMapping("reponseFormulaire/{parent_id}/{jardin_id}")
	public ResponseEntity<?>reponseFormulaire(@PathVariable("parent_id") int id,@RequestBody Formulaire f,@PathVariable("jardin_id")int idjardin){
		parentService.reponseFormulaire(id,f,idjardin);
		return new ResponseEntity<>( HttpStatus.CREATED);
	}
	
}
