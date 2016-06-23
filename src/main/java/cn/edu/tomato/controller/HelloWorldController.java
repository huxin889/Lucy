package cn.edu.tomato.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/mvc")
public class HelloWorldController {
	
	private final static Logger log = Logger.getLogger(HelloWorldController.class);
	
	@RequestMapping(value = "/hello")
	public String helloWorld (@RequestParam(value="name")String name , Model model){
		model.addAttribute("Name", name);
		log.info("\n >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.transform name is " + name +"\n");
		return "hello";
	}
}
