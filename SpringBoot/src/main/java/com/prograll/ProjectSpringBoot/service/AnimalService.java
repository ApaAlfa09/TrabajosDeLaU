package com.prograll.ProjectSpringBoot.service;

import java.util.List;
import java.util.NoSuchElementException;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.prograll.ProjectSpringBoot.model.Animal;
import com.prograll.ProjectSpringBoot.repository.AnimalRepository;
 
@Service
public class AnimalService {
 
    @Autowired
    private AnimalRepository animalRepository; // orquesta la información
 
    public List<Animal> findAll() {
        return animalRepository.findAll();
    }
 
    public Animal findById(int id) {
        Animal animal = animalRepository.findById(id);
 
        if (animal == null) {
            throw new NoSuchElementException();
        }
 
        return animal;
    }
 
    public Animal save(Animal animal) {
        return animalRepository.save(animal);
    }
 
    public Animal update(int id, Animal animal) {
        Animal animalEntity = findById(id);
        animalEntity.setName(animal.getName());
        return animalEntity;
    }
 
    public void remove(int id) {
        Animal animalEntity = findById(id);
        animalRepository.remove(animalEntity);
    }
}
