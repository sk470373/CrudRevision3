package com.example.CrudRevision3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CrudRevision3.model.Animal;
import com.example.CrudRevision3.service.AnimalService;
@RestController
public class AnimalController {
    @Autowired
	AnimalService animalService;
    
    @PostMapping("/addanimal")
    public Animal addanimal(@RequestBody Animal an) {
    	animalService.addAnimal(an);
    	return an;
    }
    @DeleteMapping("deleteid/{id}")
 public int deleteid(@PathVariable("id") int id ) {
	 animalService.deleteId(id);
	 return id;
 }
    @PutMapping("updateid/{id}")
    public int updateid(@RequestBody Animal an,@PathVariable("id") int id) {
    	animalService.addAnimal(an);
    	return id;
    }

}
