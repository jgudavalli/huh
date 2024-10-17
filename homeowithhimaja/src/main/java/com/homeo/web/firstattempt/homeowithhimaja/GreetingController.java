package com.homeo.web.firstattempt.homeowithhimaja;


	
	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.homeo.web.firstattempt.homeowithhimaja.beans.CDetails;
import com.homeo.web.firstattempt.homeowithhimaja.services.EmailServiceImpl;


   @Controller
	public class GreetingController {
 
	   @Autowired
	   private EmailServiceImpl emailService;
		@GetMapping("/greeting")
		public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
			model.addAttribute("name", name);
			return "greeting";
		}
		
		@GetMapping("/learncss")
		public String learncss(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
			model.addAttribute("name", name);
			return "learncss";
		}
		
		@GetMapping("/image")
		public String imagedisp(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
			model.addAttribute("name", name);
			return "image";
		}
		
		@GetMapping("/test")
		public String testdisp() {
			//model.addAttribute("name", name);
			return "test";
		}
		
		@GetMapping("/cases")
		public String casedisp() {
			//model.addAttribute("name", name);
			return "casestudies";
		}
		
		@GetMapping("/ab")
		public String aboutdisp() {
			//model.addAttribute("name", name);
			return "about";
		}
		
		@GetMapping("/ct")
		public String contgdisp() {
			//model.addAttribute("name", name);
			return "contact";
		}

		@PostMapping("/ct")
		        /*consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
		        produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}*/
	    public ModelAndView contdisp(@ModelAttribute("details") CDetails details)
	    {
	            String fullname = details.getFullName();
	            String email = details.getEmail();
	            String mobile = details.getMobile();
	            String msg = details.getMsg();
			
		        
		        
		        
		        emailService.sendSimpleMessage(email,fullname,mobile, msg);
		        ModelAndView modelAndView = new ModelAndView("ctsuccess");
		        modelAndView.addObject("message", "Data received successfully");

		        // Return the ModelAndView object
		        return modelAndView;
		   
	       
	       
	    }
		
		@GetMapping("/test1")
		public String test1disp(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
			model.addAttribute("name", name);
			return "test1";
		}
		
		
		
		
		

	}


