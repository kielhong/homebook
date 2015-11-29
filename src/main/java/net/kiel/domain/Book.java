package net.kiel.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import java.util.List;
import java.util.Set;

/**
 * Created by Hong, Min Hyoung (kielhong@gmail.com)
 * Date : 15. 11. 28.
 */
@Entity
@Getter @Setter
@ToString
public class Book {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String name;

    private String author;

    private String publisher;

    @Column(length = 13, nullable = false)
    private String isbn;

    private String genre;

    @Max(5)
    private Integer rate;

    @ManyToMany(cascade = CascadeType.ALL)
    @OrderBy("name")
    @JoinTable(name = "BOOK_TAG",
            joinColumns = {@JoinColumn(name = "book_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "tag_id", referencedColumnName = "id")})
    private List<Tag> tags;
}
