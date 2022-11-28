package com.example.CrudRevision3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CrudRevision3.model.Animal;
import com.example.CrudRevision3.repository.AnimalRepository;
@Service
public class AnimalService {
	
	@Autowired
	AnimalRepository animalRepository;
	
	public Animal addAnimal(Animal anm) {
		animalRepository.save(anm);
		return anm;
	}
	
	public int deleteId(int id) {
		animalRepository.deleteById(id);
		return id;
	}
	
	public String updateId(Animal an, int id) {
		
		an.setId(id);
		animalRepository.save(an);
		return "id updated"+id+"";
	}

}
