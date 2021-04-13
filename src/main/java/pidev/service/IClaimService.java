package pidev.service;

import java.util.List;

import pidev.entities.Categorie;
import pidev.entities.Claim;

public interface IClaimService {
	public Claim addClaim(int idparent,int idjardin,Claim c);
	public void deleteClaim(int id);
	public Claim updateClaim(Claim claim);
	List<Claim> getAllClaims();
	public List<Claim> getAllClaimByParentId(int parentid);
	void deleteALLclaims();
	public Claim changerCatregory(int id,Claim claim);
	public Claim changerContnu(int id,Claim claim);

}
