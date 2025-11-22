package mypackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mypackage.entity.JobApplication;

public interface JobApplicationRepository extends JpaRepository<JobApplication , Integer> 
{

}
