package toy.project.free3d.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter @Getter
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Product product;

}
