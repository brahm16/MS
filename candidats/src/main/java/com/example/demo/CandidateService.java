package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateService {

	@Autowired
	private CandidatRepository candidatRepository;
	
	public Candidate addCandidat(Candidate candidat) {
		return candidatRepository.save(candidat);
	}
	public Candidate updateCandidat(int id,Candidate  newCandidat) {
		Candidate existingCandidate=candidatRepository.findById(id).get();
		existingCandidate.setEmail(newCandidat.getEmail());
		existingCandidate.setNom(newCandidat.getNom());
		existingCandidate.setPrenom(newCandidat.getPrenom());
		return candidatRepository.save(existingCandidate);
	}
	public String deleteCandidat(int id) {
		if(candidatRepository.findById(id).isPresent()) {
			candidatRepository.deleteById(id);
			return "supprimer";
		}
		else {
			return "non supprimer";
		}
	}

}
