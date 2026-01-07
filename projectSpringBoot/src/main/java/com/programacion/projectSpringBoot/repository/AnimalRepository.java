package com.programacion.projectSpringBoot.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.programacion.projectSpringBoot.model.Animal;

@Repository
public class AnimalRepository { // acceso a data

    private List<Animal> animales = new ArrayList<>();

    private int counter = 1;

    public AnimalRepository() {
        // Lista quemada
        animales.add(new Animal(counter++, "Oso perezoso", "Es un oso muy lindo",
                "https://res.cloudinary.com/worldpackers/image/upload/c_fill,f_auto,q_auto,w_1024/v1/guides/article_cover/a17ybpewvfjpvggihpcg?_a=BACADKGT"));
        animales.add(new Animal(counter++, "Lapas", "Es una lapa muy linda",
                "https://res.cloudinary.com/worldpackers/image/upload/c_limit,f_auto,q_auto,w_1140/vj8yeptoiplybpemwdok"));
        animales.add(new Animal(counter++, "Tucán", "Es un tucán muy lindo",
                "https://res.cloudinary.com/worldpackers/image/upload/c_limit,f_auto,q_auto,w_1140/jzj1zuypswadjnlmtqrs"));
    }

    public List<Animal> findAll() {
        return animales;
    }

    public Animal findById(int id) {
        return animales.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Animal save(Animal animal) {
        animal.setId(counter++);
        animales.add(animal);
        return animal;
    }

    public void remove(Animal animal) {
        animales.remove(animal);
    }
}
