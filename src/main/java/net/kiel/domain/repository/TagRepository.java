package net.kiel.domain.repository;

import net.kiel.domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hong, Min Hyoung (kielhong@gmail.com)
 * Date : 15. 11. 28.
 */
public interface TagRepository extends JpaRepository<Tag, Integer> {
    Tag findByName(String name);
}
