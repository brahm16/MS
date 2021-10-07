package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/candidats")
public class CandidatRestAPI {
	
	
	@Autowired
	private CandidateService candidateService;
  String candiate="test candiate";
  @RequestMapping("/hello")
  public String sayHello() {
	  System.out.println("aaaaaa");
	  return candiate;
  }
  
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public ResponseEntity<Candidate> createCandidate(@RequestBody Candidate newCandidate){
	  return new ResponseEntity<Candidate>(candidateService.addCandidat(newCandidate),HttpStatus.OK);
  }
  @PutMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
  @ResponseStatus(HttpStatus.CREATED)
  public ResponseEntity<Candidate> updateCandidate(@PathVariable(value= "id") int id,@RequestBody Candidate newCandidate){
	  return new ResponseEntity<Candidate>(candidateService.updateCandidat(id,newCandidate),HttpStatus.OK);
  }
  @DeleteMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
  @ResponseStatus(HttpStatus.CREATED)
  public ResponseEntity<String> deleteCandidate(@PathVariable(value= "id") int id){
	  return new ResponseEntity<>(candidateService.deleteCandidat(id),HttpStatus.OK);
  }
}
