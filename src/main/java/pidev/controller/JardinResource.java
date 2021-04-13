package pidev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pidev.entities.Jardin_enfant;
import pidev.service.IJardinService;


@RestController
@RequestMapping("/jardin")
public class JardinResource {
@Autowired
public IJardinService JardinSer;

//http://localhost:8082/jardin/delete/104
@DeleteMapping("/delete/{id}")
public ResponseEntity<?> deleteJardin(@PathVariable("id") int id){
	JardinSer.DeleteJardin(id);
	return new ResponseEntity<>( HttpStatus.OK);
}
//http://localhost:8082/jardin/alljardins
	@GetMapping("alljardins")
	public ResponseEntity<List<Jardin_enfant>>getAllJardin(){
		List<Jardin_enfant> c=JardinSer.findAllJardin() ;
		return new ResponseEntity<List<Jardin_enfant>>(c,HttpStatus.OK);	
	}
	
	//http://localhost:8082/jardin/reputation/20/10/4
	@PostMapping("reputation/{x}/{y}/{z}")
	public ResponseEntity<?>reputation(@PathVariable("x")int x,@PathVariable("y")int y,@PathVariable("z")int z){
		JardinSer.reputation(x, y, z);
		return new ResponseEntity<>(HttpStatus.OK);	
	}
	
}
