package pidev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pidev.entities.Categorie;
import pidev.entities.Claim;
import pidev.entities.Jardin_enfant;
import pidev.entities.Parent;
import pidev.repository.IClaimRepository;
import pidev.repository.IJardinRepository;
import pidev.repository.IParentRepository;
@Service
public class ClaimService  implements IClaimService{
	@Autowired
		IClaimRepository claimResp;
	@Autowired
		IParentRepository parentResp;
	@Autowired
	IJardinRepository jardinResp;
	@Override
	public Claim addClaim(int idparent,int idjardin ,Claim c) {
		Parent p= parentResp.findById(idparent).orElse(null);
		Jardin_enfant j= jardinResp.findById(idjardin).orElse(null);
		c.setJardin_enfant(j);
		c.setParent(p);
		int n= j.getNum_reclamation()+1;
		j.setNum_reclamation(n);
		jardinResp.save(j);
		return claimResp.save(c);
	}

	@Override
	public void deleteClaim(int id) {
		Claim c= claimResp.findById(id).orElse(null);
		Jardin_enfant j= jardinResp.findById(c.getJardin_enfant().getId()).orElse(null);
		int n= j.getNum_reclamation()-1;
		j.setNum_reclamation(n);
		jardinResp.save(j);
		claimResp.deleteById(id);
		
	}

	@Override
	public List<Claim> getAllClaimByParentId(int parentid) {
		List<Claim> claims= parentResp.findById(parentid).orElse(null).getClaims();
		return claims;
	}

	@Override
	public Claim updateClaim(Claim claim) {
		// TODO Auto-generated method stub
		return claimResp.save(claim);
	}
	@Override
	public List<Claim>getAllClaims(){
		return claimResp.findAll();
	} 
	
	@Override
	public void deleteALLclaims() {
		claimResp.deleteAll();
	}

	@Override
	public Claim changerCatregory(int id,Claim claim) {
		Claim c= claimResp.findById(id).orElse(null);
		Categorie categorie1= claim.getCategorie();
		c.setCategorie(categorie1);
		return claimResp.save(c);
	}

	@Override
	public Claim changerContnu(int id,Claim claim) {
		Claim c= claimResp.findById(id).orElse(null);
		String contnu1= claim.getContnu();
		c.setContnu(contnu1);
		return claimResp.save(c);
	}
	
}
