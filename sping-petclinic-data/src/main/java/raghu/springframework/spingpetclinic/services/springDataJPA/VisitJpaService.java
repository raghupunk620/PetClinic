package raghu.springframework.spingpetclinic.services.springDataJPA;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import raghu.springframework.spingpetclinic.Repository.VisitRepository;
import raghu.springframework.spingpetclinic.model.Visit;
import raghu.springframework.spingpetclinic.services.VisitService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springDataJPA")
public class VisitJpaService implements VisitService {

    private final VisitRepository visitRepository ;

    public VisitJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Visit findByID(Long id) {
        return visitRepository.findById(id).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>() ;
        visitRepository.findAll().forEach(visits::add);
        return visits ;
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);

    }
}
