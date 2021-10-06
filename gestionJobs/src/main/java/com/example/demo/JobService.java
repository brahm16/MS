package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

	@Autowired
	private JobRepository jobRepository;

	public Jobs updateEtatJob(int id, boolean newEtat) {
		if (jobRepository.findById(id).isPresent()) {
			Jobs existingJob = jobRepository.findById(id).get();
			existingJob.setEtat(newEtat);
			return jobRepository.save(existingJob);
		} else
			return null;
	}
	
	
}