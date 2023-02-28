package raghu.springframework.spingpetclinic.services.springDataJPA;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import raghu.springframework.spingpetclinic.Repository.PetTypeRepository;
import raghu.springframework.spingpetclinic.model.PetType;
import raghu.springframework.spingpetclinic.services.PetTypeService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springDataJPA")
public class PetTypeJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository ;

    public PetTypeJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public PetType findByID(Long id) {
        return petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>() ;
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes ;
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        petTypeRepository.deleteById(id);
    }
}
