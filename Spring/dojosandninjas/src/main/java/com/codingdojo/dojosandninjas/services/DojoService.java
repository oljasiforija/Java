package com.codingdojo.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	public List<Dojo> allDojos(){
		return dojoRepository.findAll();
	}
	public Dojo createDojo(Dojo d) {
		return dojoRepository.save(d);
	}
	public Dojo singleDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		}
		else {
			return null;
		}
	}

}
