package raghu.springframework.spingpetclinic.services;

import raghu.springframework.spingpetclinic.model.Owner;

import java.util.List;


public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);

    List<Owner> findByLastNameContainingIgnoreCase(String lastName);
}
