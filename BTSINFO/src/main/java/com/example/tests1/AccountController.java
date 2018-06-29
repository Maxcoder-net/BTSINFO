package com.example.tests1;


import  com.example.tests1.Account;
import  com.example.tests1.EditAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@SuppressWarnings("unused")
@Controller
public class AccountController {

	@Autowired
	EditAccount acntedit;
	
	
	
	@RequestMapping("/account")
	public String AddAccount(Model model)
	{
		
		model.addAttribute("Account",acntedit.findAll());
		return "Account";
		
		
	}
	
	
}
