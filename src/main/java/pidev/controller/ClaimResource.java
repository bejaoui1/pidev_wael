package pidev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pidev.entities.Categorie;
import pidev.entities.Claim;
import pidev.service.IClaimService;

@RestController
@RequestMapping("/claim")
public class ClaimResource {
	@Autowired 
	IClaimService claimSer;
	
	//http://localhost:8082/claim/addclaim/2/1
	@PostMapping("addclaim/{parent_id}/{jardin_id}")
	public ResponseEntity<Claim> addclaim(@PathVariable("parent_id") int id,@PathVariable("jardin_id")int idjardin ,@RequestBody Claim claim){
		Claim c = claimSer.addClaim(id,idjardin,claim);
		return new ResponseEntity<Claim>(c, HttpStatus.CREATED);
	}
	//http://localhost:8082/claim/deleteClaim/6
	@DeleteMapping("deleteClaim/{claim_id}")
	public ResponseEntity<?>deleleallclaim(@PathVariable("claim_id") int id){
		claimSer.deleteClaim(id);;
		return new ResponseEntity<>(HttpStatus.OK);
	}
	//http://localhost:8082/claim/changeclaim/6
	@PostMapping("changeclaim/{claim_id}")
	public ResponseEntity<Claim> changeCategorieclaim(@PathVariable("claim_id") int id, @RequestBody Claim c){
		Claim claim = claimSer.changerCatregory(id, c);
		return new ResponseEntity<Claim>(claim, HttpStatus.CREATED);
	}
	//http://localhost:8082/claim/allclaims
		@GetMapping("allclaims")
		public ResponseEntity<List<Claim>>getAllClaims(){
			List<Claim> c= claimSer.getAllClaims();
			return new ResponseEntity<List<Claim>>(c,HttpStatus.OK);
			
		}
		//http://localhost:8082/claim/deleteAllClaim
		@DeleteMapping("deleteAllClaim")
		public ResponseEntity<?>deleleallclaim(){
			claimSer.deleteALLclaims();
			return new ResponseEntity<>(HttpStatus.OK);
		}
	
		
		//http://localhost:8082/claim/changecontnuclaim/6
		@PostMapping("changecontnuclaim/{claim_id}")
		public ResponseEntity<Claim> changerContnuclaim(@PathVariable("claim_id") int id, @RequestBody Claim c){
			Claim claim = claimSer.changerContnu(id, c);
			return new ResponseEntity<Claim>(claim, HttpStatus.CREATED);
		}
		
		//http://localhost:8082/claim/allclaimsbyparentid/id
				@GetMapping("allclaimsbyparentid/{parent_id}")
				public ResponseEntity<List<Claim>>getAllClaimByParentId(@PathVariable("parent_id") int id){
					List<Claim> c= claimSer.getAllClaimByParentId(id);
					return new ResponseEntity<List<Claim>>(c,HttpStatus.OK);
				}
}
