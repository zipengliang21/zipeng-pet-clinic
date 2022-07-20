package guru.springframework.zipengpetclinic.services;

import guru.springframework.zipengpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
