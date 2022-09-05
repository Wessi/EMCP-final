package net.mofed.reportracking.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.mofed.reportracking.app.model.User;
import net.mofed.reportracking.app.model.myRole;
import net.mofed.reportracking.app.service.MyRoleService;
import net.mofed.reportracking.app.service.MyUserService;

@Controller

public class PrivillegeController {
	
	@Autowired
	
	private MyUserService myuserservice;
	
	@Autowired
	private MyRoleService mroleservice;
	@GetMapping("/userprivilleges")
	
	public String getPrivilleges(Model model) {
		List<User> userlist = myuserservice.ListUser();
		List<myRole>rolelist  =mroleservice.ListAll();
		model.addAttribute("userlists", userlist);
		model.addAttribute("rolelists", rolelist);
		return "emcp/privillege";
	}

}

