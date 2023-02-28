package raghu.springframework.spingpetclinic.Repository;

import org.springframework.data.repository.CrudRepository;
import raghu.springframework.spingpetclinic.model.Visit;
public interface VisitRepository extends CrudRepository<Visit,Long> {

}
