package net.mofed.reportracking.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.mofed.reportracking.app.model.myRole;
import net.mofed.reportracking.app.repository.MyroleRepository;

@Service
public class MyRoleService {

	   @Autowired
	   private MyroleRepository myrolerepo;
	   
	    public List<myRole>  ListAll() {
	    	return myrolerepo.findAll();
	    }
	    	    
	    public void save(myRole  mrole) {
	    	myrolerepo.save(mrole);
	    }
	    
	   	   public Optional findById(Integer id) {
	    	return myrolerepo.findById(id);
	       }
	   	   
	   	  	   	   public  void delete (Integer id) {
	   		   myrolerepo.deleteById(id);
	   	   }
}
