package raghu.springframework.spingpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import raghu.springframework.spingpetclinic.model.Pet;
import raghu.springframework.spingpetclinic.services.PetService;

import java.util.Set;

@Service
@Profile("map")
public class PetMapService extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Pet findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll() ;
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }
}
