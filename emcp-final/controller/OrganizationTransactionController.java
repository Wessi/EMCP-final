package net.mofed.reportracking.app.controller;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



import net.mofed.reportracking.app.model.Document;
import net.mofed.reportracking.app.model.MasterTransaction;
import net.mofed.reportracking.app.model.User;
import net.mofed.reportracking.app.repository.MasterTransactionRepository;
import net.mofed.reportracking.app.repository.MyUserRepository;
import net.mofed.reportracking.app.service.DocumentService;
import net.mofed.reportracking.app.service.MasterTransactionService;
import net.mofed.reportracking.app.service.MyUserDetails;
import net.mofed.reportracking.app.service.MyUserService;

@Controller

public class OrganizationTransactionController {
	 
	@Autowired
	private MasterTransactionService masterTransactionService;
	@Autowired
	private DocumentService documentService;
	
	@Autowired
	private MyUserRepository userRepo;
	
	@Autowired
	private MasterTransactionRepository mrepo;
	
		    @GetMapping("/orgtransactionlists")
			public String  showTransactionbyUsername(Model  model,Principal principal)
		{
		 			String name= principal.getName();
			User user= this.userRepo.getUserByUsername(name);
			
			List<MasterTransaction> orgtransactionlist = this.masterTransactionService.getOrgTrans(user.getId());
				model.addAttribute("mastertransactionlists", orgtransactionlist);
		
		    List<Document> doclist = documentService.getDocuments();
		    model.addAttribute("documents",doclist);
			return  "emcp/organizationtransaction";		
			
	         }
					
					
		} 
		
		


		
	
	

