package raghu.springframework.spingpetclinic.services.springDataJPA;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import raghu.springframework.spingpetclinic.Repository.VetRepository;
import raghu.springframework.spingpetclinic.model.Vet;
import raghu.springframework.spingpetclinic.services.VetService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springDataJPA")
public class VetJPAService implements VetService {

    private final VetRepository vetRepository ;

    public VetJPAService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }
    @Override
    public Vet findByID(Long id) {
        return vetRepository.findById(id).orElse(null);
    }
    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }
    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets ;
    }
    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);

    }
    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);
    }
}
