package toy.project.free3d.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
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

    private Categories categories;

    private int price;

    @Enumerated(EnumType.STRING)
    private FileFormat format;

    @CreationTimestamp
    private Timestamp uploadDate;

    private String name;

    private String description;

}
