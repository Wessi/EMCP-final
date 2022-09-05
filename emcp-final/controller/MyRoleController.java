package net.mofed.reportracking.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import net.mofed.reportracking.app.model.myRole;
import net.mofed.reportracking.app.service.MyRoleService;

@Controller

public class MyRoleController {

	   @Autowired
	   private MyRoleService  mroleservice;
	   
	   @GetMapping("/rolelists")
	   
	   public String rolelist(Model model) {
		  
		   List<myRole> rolelist = mroleservice.ListAll();
		   model.addAttribute("rolelists",rolelist);
		   return "emcp/role";
	  	   }
	  	   
	  @PostMapping("rolelists/addNew") 
	  public String addNew(myRole mrole) {
		  mroleservice.save(mrole);
		  return "redirect:/rolelists";
	  }
	   
	   
}
