package com.example.RegistrationCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class RegistrationCourseControl {


    @Autowired
    RegistrationRepository repo;
    
    @RequestMapping("/")
    public String homePage() {
        return "home.jsp";
    }

    @GetMapping("/signin")
    public String signin() {
        return "login.jsp";
    }
    
    @PostMapping("/signin")
    public String login(@RequestParam("email")String username,@RequestParam("password")String password)
    {
    	System.out.println(username);
    	
    	RegistrationUser regUser = repo.findByEmailAndPassword(username, password);
    	
    	if(regUser==null)
    	{
    		return "error.jsp";
    	}
    	
    	else {
    	System.out.println(regUser.getPassword());
    	return "welcome.jsp";
    	}
    }

    @RequestMapping("/signup")
    public String signup() {
    	return "signin.jsp";
    }
    @RequestMapping("/signinuser")
    public String adduser(RegistrationUser reg) {
    	
    	 //System.out.println(reg.getFirstname());
    	System.out.println(reg.getPassword());
    	 repo.save(reg);
    	 System.out.println(reg.getPassword());
    	 return "welcome.jsp";   	
        
        
    }
    
    
	
}
