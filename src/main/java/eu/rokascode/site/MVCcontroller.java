package eu.rokascode.site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCcontroller {

	@GetMapping("/")
	public String returnIndex() {		
		return "index";
	}
	
	@GetMapping("/index")
	public String redirectIndex() {
		return "index";
	}
	
	@GetMapping("/about")
	public String returnAboutMe() {
		return "about";
	}
	
	@GetMapping("/projects")
	public String returnProjects() {
		return "projects";
	}
	
}
