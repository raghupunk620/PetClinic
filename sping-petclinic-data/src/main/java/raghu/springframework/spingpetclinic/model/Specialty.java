package raghu.springframework.spingpetclinic.model;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "specialities")
public class Specialty extends BaseEntity {

    @Column(name = "description")
    private String description;

}
