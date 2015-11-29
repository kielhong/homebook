package net.kiel.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Hong, Min Hyoung (kielhong@gmail.com)
 * Date : 15. 11. 28.
 */
@Entity
@Getter @Setter
@ToString(exclude = "books")
public class Tag {
    public Tag() {}
    public Tag(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    private Integer id;

    @Column(unique = true)
    private String name;

    @ManyToMany(mappedBy = "tags")
    private Set<Book> books;
}
