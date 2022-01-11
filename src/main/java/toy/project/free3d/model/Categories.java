package toy.project.free3d.model;

import lombok.Getter;
import lombok.Setter;
import toy.project.free3d.type.CategoryType;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private CategoryType type;
}
