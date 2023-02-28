package raghu.springframework.spingpetclinic.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import raghu.springframework.spingpetclinic.model.Specialty;


public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {

}
