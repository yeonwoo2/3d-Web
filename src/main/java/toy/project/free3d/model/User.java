package toy.project.free3d.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에 연결된 db 넘버링 전략을 따라간다.
    private int id;// auto_increment
    
    @Column(nullable = false) //null 불가능
    private String username;

    @Column(nullable = false, length = 100) //해쉬 (비밀번호 암호화)
    private String password;

    @Column(nullable = false)
    private String email;

    @CreationTimestamp //시간 자동 입력
    private Timestamp createDate;

    
    
}
