package mypackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mypackage.entity.Job;

public interface JobRepository extends JpaRepository<Job , Integer>
{

}
