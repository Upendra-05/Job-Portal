package mypackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mypackage.entity.JobApplication;
import mypackage.service.ApplicationService;

@RestController
@RequestMapping("/applications")
public class ApplicationContrller 
{
	@Autowired
	private ApplicationService service;
	
	@PostMapping("/apply")
	public JobApplication apply(@RequestBody JobApplication app)
	{
		return service.applyJob(app);
	}
}
