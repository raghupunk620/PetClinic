package raghu.springframework.spingpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "owners")
public class Owner extends Person {
    @Column(name = "address")
    private String address ;
    @Column(name = "city")
    private String city ;
    @Column(name = "contactNumber")
    private String contactNumber ;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>() ;

    @Builder
    public Owner(Long id, String firstName, String lastName, String address, String city,
                 String contactNumber, Set<Pet> pets) {
        super(id, firstName, lastName);
        this.address = address;
        this.city = city;
        this.contactNumber = contactNumber;
        if(pets != null) {
            this.pets = pets;
        }
    }

    public Pet getPet(String name) {
        return getPet(name, false);
    }

    public Pet getPet(String name, boolean ignoreNew) {
        name = name.toLowerCase();
        for (Pet pet : pets) {
            if (!ignoreNew || !pet.isNew()) {
                String compName = pet.getName();
                compName = compName.toLowerCase();
                if (compName.equals(name)) {
                    return pet;
                }
            }
        }
        return null;
    }

}
