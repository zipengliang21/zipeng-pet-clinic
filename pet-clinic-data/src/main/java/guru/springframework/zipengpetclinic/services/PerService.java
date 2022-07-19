package guru.springframework.zipengpetclinic.services;

import java.util.Set;

import guru.springframework.zipengpetclinic.model.Pet;

public interface PerService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
