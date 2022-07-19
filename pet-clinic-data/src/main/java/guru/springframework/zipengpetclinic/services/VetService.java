package guru.springframework.zipengpetclinic.services;

import java.util.Set;

import guru.springframework.zipengpetclinic.model.Vet;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
