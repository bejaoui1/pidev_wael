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


import pidev.entities.Demande;
import pidev.entities.Formulaire;
import pidev.service.IAdminService;

@RestController
@RequestMapping("/admin")
public class AdminResource {
	
	@Autowired
	IAdminService adminSer;
	
	//http://localhost:8082/admin/acceptedemande/14
	@PostMapping("acceptedemande/{id_demande}")
	public ResponseEntity<?>acceptedemande(@PathVariable("id_demande") int id){
		adminSer.accepteDemande(id);
		return new ResponseEntity<>( HttpStatus.CREATED);
	}
	//http://localhost:8082/admin/alldemande
	@GetMapping("alldemande")
			public ResponseEntity<List<Demande>>getAllClaims(){
				List<Demande> c= adminSer.getAllDemande();
				return new ResponseEntity<List<Demande>>(c,HttpStatus.OK);	
			}
	//http://localhost:8082/admin/addform
	@PostMapping("addform")
	public ResponseEntity<?>addform(@RequestBody Formulaire f){
		adminSer.AddFrmulaire(f);
		return new ResponseEntity<>( HttpStatus.CREATED);
	}
}
