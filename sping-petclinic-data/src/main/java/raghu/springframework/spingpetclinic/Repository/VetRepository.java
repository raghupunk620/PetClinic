package raghu.springframework.spingpetclinic.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import raghu.springframework.spingpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {

}
