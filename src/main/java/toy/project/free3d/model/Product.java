package toy.project.free3d.model;

import lombok.Getter;
import lombok.Setter;
import toy.project.free3d.type.FileFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob //CLOB, BOLOB 타입을 매핑할 수 있다. 길이제한 업음.
    private String description;

    private int price;

    @Temporal(TemporalType.TIMESTAMP)
    private Date uploadDate;

    private String name;

    @Enumerated(EnumType.STRING)
    private FileFormat format;

    @ManyToOne
    @JoinColumn
    private User user;

}
