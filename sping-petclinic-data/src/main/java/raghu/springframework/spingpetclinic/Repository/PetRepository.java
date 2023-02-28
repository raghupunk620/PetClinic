package raghu.springframework.spingpetclinic.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import raghu.springframework.spingpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
