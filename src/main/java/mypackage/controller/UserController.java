package mypackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mypackage.dto.RegisterRequest;
import mypackage.entity.User;
import mypackage.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController 
{
	@Autowired
	private UserService service;
	
	@PostMapping("/register")
	public User register(@RequestBody RegisterRequest req)
	{
		return service.register(req);
	}
}
