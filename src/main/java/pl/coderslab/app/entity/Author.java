package pl.coderslab.app.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "author")

public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String firstName;
    private String lastName;
    

}
