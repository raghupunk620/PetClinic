package raghu.springframework.spingpetclinic.bootStrap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import raghu.springframework.spingpetclinic.model.*;
import raghu.springframework.spingpetclinic.services.*;
import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
                      SpecialtyService specialtyService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if (count == 0 ){
            loadData();
        }
    }

    private void loadData() {

        PetType dog = new PetType() ;
        dog.setName("Dog");
        dog = petTypeService.save(dog);
        PetType cat = new PetType() ;
        cat.setName("Cat");
        cat = petTypeService.save(cat);
        Specialty radiology = new Specialty();
        radiology.setDescription("radiology");
        radiology = specialtyService.save(radiology);
        Specialty surgery = new Specialty() ;
        surgery.setDescription("Surgery");
        surgery = specialtyService.save(surgery);
        Owner owner1 = new Owner() ;
        owner1.setFirstName("Raghuraj");
        owner1.setLastName("Singh");
        owner1.setAddress("Clean Street California");
        owner1.setCity("california");
        owner1.setContactNumber("12234578");
        Owner owner2 = new Owner() ;
        owner2.setFirstName("Naresh");
        owner2.setLastName("Meghani");
        owner2.setAddress("2nd Street Orlando Chruch");
        owner2.setCity("Texas");
        owner2.setContactNumber("13456789");
        Owner owner3 = new Owner();
        owner3.setFirstName("Ashish");
        owner3.setLastName("Verma");
        owner3.setAddress("Pratap nagar");
        owner3.setCity("Jaipur");
        owner3.setContactNumber("1389789");
        Owner owner4 = new Owner();
        owner4.setFirstName("Guddu");
        owner4.setLastName("Sansi");
        owner4.setAddress("Sanganer");
        owner4.setCity("Jaipur");
        owner4.setContactNumber("100389789");
        Pet raghurajsPet = new Pet();
        raghurajsPet.setPetType(dog);
        raghurajsPet.setName("bunny");
        raghurajsPet.setOwner(owner1);
        raghurajsPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(raghurajsPet);
        ownerService.save(owner1);
        Pet nareshPet = new Pet();
        nareshPet.setPetType(cat);
        nareshPet.setName("Little Tom");
        nareshPet.setOwner(owner2);
        nareshPet.setBirthDate(LocalDate.now());
        owner2.getPets().add(nareshPet);
        ownerService.save(owner2);
        Pet ashishsPet = new Pet();
        ashishsPet.setPetType(cat);
        ashishsPet.setName("Billa");
        ashishsPet.setOwner(owner3);
        ashishsPet.setBirthDate(LocalDate.now());
        owner3.getPets().add(ashishsPet);
        ownerService.save(owner3);
        Pet guddusPet = new Pet();
        guddusPet.setPetType(dog);
        guddusPet.setName("Wisky");
        guddusPet.setOwner(owner4);
        guddusPet.setBirthDate(LocalDate.now());
        owner4.getPets().add(guddusPet);
        ownerService.save(owner4);
        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Vance");
        vet1.setLastName("Vascaz");
        vet1.getSpecialities().add(radiology);
        vetService.save(vet1);
        Vet vet2 = new Vet() ;
        vet2.setId(2L);
        vet2.setFirstName("Jared");
        vet2.setLastName("Vascas");
        vet2.getSpecialities().add(surgery);
        vetService.save(vet2);
        System.out.println("Loading Vets");
        System.out.println("My name is Stuart Binny");
        System.out.println("And your name is Roger ");
        System.out.println("The same is here");
        
    }
}