package org.kemal.controller;

import org.kemal.daoimpl.UserDao;
import org.kemal.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IslemlerController {

	@Autowired
	private UserDao userdao;
		
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String anasayfa(Model model)
	{
		return "welcome";
	}
	
	@RequestMapping(value="/loginpage",method=RequestMethod.GET)
	public String loginPage()
	{
		return "loginpage";
	}
	
	@RequestMapping(value="/search",method=RequestMethod.GET)
	public String showSearchPage()
	{
		return "search";
	}
	
	@RequestMapping(value="/newaccount",method=RequestMethod.GET)
	public String showRegisterPage() 
	{
		return "register";
	}
	
	@RequestMapping(value="/createaccount" , method=RequestMethod.POST)
	public String createAccount(User user)
	{
		
		user.setEnabled(true);
		user.setAuthority("ROLE_USER");
		
		userdao.create(user);
		
		
		return "accountcreated";
	}
	
	@RequestMapping(value="/controlpage",method=RequestMethod.GET)
	public String showControlPage()
	{
		return "controlpage";
	}
	
	
	
	
}
