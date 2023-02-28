package raghu.springframework.spingpetclinic.services.springDataJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import raghu.springframework.spingpetclinic.Repository.OwnerRepository;
import raghu.springframework.spingpetclinic.model.Owner;
import raghu.springframework.spingpetclinic.services.OwnerService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Profile("springDataJPA")
public class OwnerJPAService implements OwnerService {
    @Autowired
    private OwnerRepository ownerRepository ;

    public OwnerJPAService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Owner findByID(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public Set<Owner> findAll() {
       Set<Owner> owners = new HashSet<>();
       ownerRepository.findAll().forEach(owners::add);
       return owners;
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);

    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public List<Owner> findByLastNameContainingIgnoreCase(String lastName) {
        return ownerRepository.findByLastNameContainingIgnoreCase(lastName);
    }
}
