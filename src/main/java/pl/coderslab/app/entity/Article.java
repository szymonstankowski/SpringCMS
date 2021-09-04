package pl.coderslab.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    @Column(length = 200)
    private String title;

    @OneToOne
    Author author;
    @OneToMany
    List<Category> categories;

    private String content;

    @Column(name = "created_on")
    private LocalDate createdOn;
    @Column(name = "updated_on")
    private LocalDate updatedOn;

    @PrePersist
    public void prePersist(){
        createdOn = LocalDate.now();
    }
    @PreUpdate
    public void preUpdate(){
        updatedOn = LocalDate.now();
    }


}
