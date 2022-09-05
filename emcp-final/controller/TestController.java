package net.mofed.reportracking.app.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import net.mofed.reportracking.app.model.User;
import net.mofed.reportracking.app.repository.MasterTransactionRepository;
import net.mofed.reportracking.app.repository.MyUserRepository;



@Controller

public class TestController {
	
	@Autowired
	private MyUserRepository userRepo; 
	
	@Autowired
	private MasterTransactionRepository   mrepo;
	
	@ModelAttribute
	public void addCommonData(Model model, Principal principal)
	
	{
		String username= principal.getName();
		User usera= userRepo.getUserByUsername(username);
		
		System.out.println("USERNAME........" +username);
		
		model.addAttribute("testuser", usera);
	}
	
	
	@RequestMapping("/index")
	public String dashboard(Model model, Principal principal)
	{
		return "emcp/user_dash";
	} 
	
}

