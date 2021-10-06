package com.example.demo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Jobs, Integer> {
	@Query("select j from Job j where j.service like :service")
	public Page<Jobs> jobByNom(@Param("service") String service, Pageable pageable);
	   
}