package raghu.springframework.spingpetclinic.services.springDataJPA;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import raghu.springframework.spingpetclinic.Repository.PetRepository;
import raghu.springframework.spingpetclinic.model.Pet;
import raghu.springframework.spingpetclinic.services.PetService;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springDataJPA")
public class PetJpaService implements PetService {

    private final PetRepository petRepository ;

    public PetJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Pet findByID(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets ;
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }
}
