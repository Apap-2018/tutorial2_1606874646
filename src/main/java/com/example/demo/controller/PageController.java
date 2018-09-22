package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController{
	@RequestMapping("/viral")
	public String index() {
		return "viral";
	}
	

	@RequestMapping("/challenge")
	public String challenge(@RequestParam(value = "name") String name, Model model) {
	model.addAttribute("name", name);
		return "challenge";
	}
	
	@RequestMapping("/challenge/{name}")
	public String challengePath(@RequestParam(value = "name") String name, Model model) {
	model.addAttribute("name", name);
		return "challenge";
	}

	@RequestMapping("/generator")
	public String generator(@RequestParam(value = "a", required = false, defaultValue = "0") String a,
			@RequestParam(value="b", required = false, defaultValue= "0") String b, Model model) {
		Integer alpha = Integer.parseInt(a);
		Integer alpha_store = Integer.parseInt(a);
		Integer beta = Integer.parseInt(b);
		Integer beta_store = Integer.parseInt(b);
		String temp= "h";
		String temp2="";
		
			if(alpha==0&&beta==0) {
				model.addAttribute("a", alpha);
				model.addAttribute("b", beta);
				model.addAttribute("hasil", "hm");
				
			}
			
			else {
				if(alpha==0) {
					
					alpha++;
				}
				if(beta==0) {
					beta++;
				}
				for(int i=0;i<alpha;i++) {
					temp+="m";
				}
				for(int j=0;j<beta;j++) {
					temp2+=" ";
					temp2+=temp;
					
				}
				model.addAttribute("a", alpha_store);
				model.addAttribute("b", beta_store);
				model.addAttribute("hasil", temp2);
			}
			
			
		
		
			return "generator";

	}
	}




