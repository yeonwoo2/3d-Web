package toy.project.free3d.model;

import lombok.Getter;
import lombok.Setter;
import toy.project.free3d.type.CategoryType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Getter @Setter
public class ProductDetail {

    @Enumerated(EnumType.STRING)
    private CategoryType categoryType;
}
