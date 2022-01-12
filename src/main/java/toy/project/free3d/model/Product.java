package toy.project.free3d.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import toy.project.free3d.type.CategoryType;
import toy.project.free3d.type.FileFormat;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter @Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private User user;

    private int price;

    @Enumerated(EnumType.STRING)
    private FileFormat format;

    @CreationTimestamp
    private Timestamp uploadDate;

    private String name;

    @Lob //CLOB, BOLOB 타입을 매핑할 수 있다. 길이제한 업음.
    private String description;

}
