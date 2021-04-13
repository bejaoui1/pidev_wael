package pidev.service;

import java.util.List;

import pidev.entities.Jardin_enfant;

public interface IJardinService {
	public List<Jardin_enfant> findAllJardin();
	public void DeleteJardin(int id);
	public  void reputation(int x,int y ,int z);
	//public int demendereputation(int id,int jardin_id);
}
