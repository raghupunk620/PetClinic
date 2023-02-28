package raghu.springframework.spingpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import raghu.springframework.spingpetclinic.model.Vet;

import raghu.springframework.spingpetclinic.services.VetService;

import java.util.Set;

@Service
@Profile("map")
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Vet findByID(Long id) {
        return super.findByID(id);
    }
    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}
