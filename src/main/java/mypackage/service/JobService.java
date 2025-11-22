package mypackage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mypackage.dto.JobRequest;
import mypackage.entity.Job;
import mypackage.repository.JobRepository;

@Service
public class JobService 
{
	@Autowired
	private JobRepository repo;
	
	public Job createJob(JobRequest req)
	{
		Job job = new Job();
		
		job.setTitle(req.getTitle());
		job.setDescription(req.getDescription());
		job.setCompany(req.getCompany());
		job.setLocation(req.getLocation());
		
		return repo.save(job);
	}
	
	public List<Job> getAllJobs()
	{
		return repo.findAll();
	}
}
