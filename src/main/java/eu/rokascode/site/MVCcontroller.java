package eu.rokascode.site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCcontroller {

	@GetMapping("/")
	public String returnIndex() {		
		return "index";
	}
	
	@GetMapping("/about")
	public String returnAboutMe() {
		return "about";
	}
	
	@GetMapping("/cv")
	public String returnCV() {
		return "cv";
	}
	
	@GetMapping("/projects")
	public String returnProjects() {
		return "projects";
	}
	
}
