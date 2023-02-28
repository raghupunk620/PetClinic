package raghu.springframework.spingpetclinic.services.map;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import raghu.springframework.spingpetclinic.model.PetType;
import raghu.springframework.spingpetclinic.services.PetTypeService;

import java.util.Set;

@Service
@Profile("map")
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }
    @Override
    public PetType findByID(Long id) {
        return super.findByID(id);
    }
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    @Override
    public void delete(PetType object) {
        super.delete(object);
    }
}
