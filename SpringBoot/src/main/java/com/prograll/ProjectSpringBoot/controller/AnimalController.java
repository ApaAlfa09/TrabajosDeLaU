package com.prograll.ProjectSpringBoot.controller;

import java.util.List;
 
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prograll.ProjectSpringBoot.model.Animal;
import com.prograll.ProjectSpringBoot.service.AnimalService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping(path = "/api/animals")
public class AnimalController {

    private AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<Animal> findAll() {
        return animalService.findAll();
    }
 
    @GetMapping(path = "/{id}")
    public Animal findById(@PathVariable("id") int id) {
        return animalService.findById(id);
    }
 
    @PostMapping
    public Animal save(@RequestBody Animal animal) {
        return animalService.save(animal);
    }
 
    @PutMapping(path = "/{id}")
    public Animal update(@PathVariable("id") int id, @RequestBody Animal animal) {
 
        return animalService.update(id, animal);
    }
 
    @DeleteMapping(path = "/{id}")
    public void remove(@PathVariable("id") int id) {
        animalService.remove(id);
    }
}