package net.kiel.domain.repository;

import net.kiel.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hong, Min Hyoung (kielhong@gmail.com)
 * Date : 15. 11. 28.
 */
public interface BookRepository extends JpaRepository<Book, Integer> {
}
