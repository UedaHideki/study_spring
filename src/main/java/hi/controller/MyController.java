package hi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hi.service.ServiceEx1;

@Controller
public class MyController {
	
	@Autowired
	ServiceEx1 s;

   @GetMapping("/")
   public String index(Model model) {

	   int v = s.getIncrementValue(1);
      model.addAttribute("message", "Hello Spring MVC 5!こんにちは" + v);
      
      return "index";
   }
}