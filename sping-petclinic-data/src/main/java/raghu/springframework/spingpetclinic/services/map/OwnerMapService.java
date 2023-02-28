package raghu.springframework.spingpetclinic.services.map;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import raghu.springframework.spingpetclinic.model.Owner;
import raghu.springframework.spingpetclinic.services.OwnerService;

import java.util.List;
import java.util.Set;


@Service
@Profile("map")
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll() ;
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

    @Override
    public List<Owner> findByLastNameContainingIgnoreCase(String lastName) {
        return null;
    }
}
