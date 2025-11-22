package mypackage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mypackage.dto.JobRequest;
import mypackage.entity.Job;
import mypackage.service.JobService;

@RestController
@RequestMapping("/jobs")
public class JobController
{
	@Autowired
	private JobService service;
	
	@PostMapping("/add")
	public Job addJob(@RequestBody JobRequest req)
	{
		return service.createJob(req);
	}
	
	@GetMapping("/all")
	public List<Job> getAll()
	{
		return service.getAllJobs();
	}
}
