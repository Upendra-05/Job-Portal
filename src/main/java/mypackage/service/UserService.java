package mypackage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mypackage.dto.RegisterRequest;
import mypackage.entity.User;
import mypackage.repository.UserRepository;

@Service
public class UserService 
{
	@Autowired
	private UserRepository repo;
	
	public User register(RegisterRequest req)
	{
		User user = new User();
		
		user.setName(req.getName());
		user.setEmail(req.getEmail());
		user.setPassword(req.getPassword());
		
		return repo.save(user);
	}
}
