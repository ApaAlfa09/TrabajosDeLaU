package com.prograll.ProjectSpringBoot.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.prograll.ProjectSpringBoot.model.Animal;

@Repository
public class AnimalRepository {
    private List<Animal> animals = new ArrayList<>();
    private int count = 1;

    public AnimalRepository() {
        animals.add(new Animal(count++, "Oso perezoso", "Es un oso muy lindo",
                "https://res.cloudinary.com/worldpackers/image/upload/c_fill,f_auto,q_auto,w_1024/v1/guides/article_cover/a17ybpewvfjpvggihpcg?_a=BACADKGT"));
        animals.add(new Animal(count++, "Lapas", "Es una lapa muy linda",
                "https://res.cloudinary.com/worldpackers/image/upload/c_limit,f_auto,q_auto,w_1140/vj8yeptoiplybpemwdok"));
        animals.add(new Animal(count++, "Tucán", "Es un tucán muy lindo",
                "https://res.cloudinary.com/worldpackers/image/upload/c_limit,f_auto,q_auto,w_1140/jzj1zuypswadjnlmtqrs"));
    }

    public List<Animal> findAll() {
        return animals;
    }

    public Animal findById(int id) {
        return animals.stream()
                .filter(animal -> animal.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Animal save(Animal animal) {
        animal.setId(count++);
        animals.add(animal);
        return animal;
    }

    public void remove(Animal animal) {
        animals.remove(animal);
    }

}