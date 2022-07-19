package guru.springframework.zipengpetclinic.services;

import java.util.Set;

import guru.springframework.zipengpetclinic.model.Owner;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
