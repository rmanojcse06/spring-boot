package edu.man.controller.login;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.man.bean.login.LoginBean;
import edu.man.service.login.LoginServiceImpl;

@RestController
public class LoginController {
	
	@Autowired
	LoginServiceImpl loginService;
	
	private static final SimpleDateFormat SDF_MM_DDD_YYYY_HH_MI_SS = new SimpleDateFormat("dd/MMM/YYYY hh:mm:ss");
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello at "+SDF_MM_DDD_YYYY_HH_MI_SS.format(new Date()); 
	}
	
	@PostMapping(path="/create/users",consumes = "application/json")
	public String createUsers(@RequestBody LoginBean bean) {
		loginService.addUser(bean);
		return ""+bean;
	}
}
