package raghu.springframework.spingpetclinic.services.springDataJPA;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import raghu.springframework.spingpetclinic.Repository.SpecialtyRepository;
import raghu.springframework.spingpetclinic.model.Specialty;
import raghu.springframework.spingpetclinic.services.SpecialtyService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springDataJPA")
public class SpecialtyJpaService implements SpecialtyService {

    private final SpecialtyRepository specialtyRepository;

    public SpecialtyJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Specialty findByID(Long id) {
        return specialtyRepository.findById(id).orElse(null);
    }

    @Override
    public Specialty save(Specialty object) {
        return specialtyRepository.save(object);
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialities = new HashSet<>();
        specialtyRepository.findAll().forEach(specialities::add);
        return specialities ;
    }

    @Override
    public void delete(Specialty object) {
        specialtyRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        specialtyRepository.deleteById(id);
    }
}
