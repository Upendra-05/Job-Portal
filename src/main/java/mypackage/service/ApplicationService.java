package mypackage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mypackage.entity.JobApplication;
import mypackage.repository.JobApplicationRepository;

@Service
public class ApplicationService 
{
	@Autowired
	private JobApplicationRepository repo;
	
	public JobApplication applyJob(JobApplication app)
	{
		app.setStatus("Applied!!");
		return repo.save(app);
	}
}
