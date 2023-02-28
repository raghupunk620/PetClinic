package raghu.springframework.spingpetclinic.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import raghu.springframework.spingpetclinic.model.Owner;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findByLastNameContainingIgnoreCase(String lastName);
}
