package net.kiel.domain

import net.kiel.HomebookApplication
import net.kiel.domain.repository.BookRepository
import net.kiel.domain.repository.TagRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import org.springframework.transaction.annotation.Transactional
import spock.lang.Specification

/**
 * Created by Hong, Min Hyoung (kielhong@gmail.com)
 * Date : 15. 11. 28.
 */
@ContextConfiguration(loader = SpringApplicationContextLoader.class, classes = HomebookApplication)
@Transactional
class BookTest extends Specification {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    TagRepository tagRepository;

    def "book에 tag추가"() {
        given:
        def book = new Book();
        def tag = new Tag("SF")
        def tags = new ArrayList();
        tags << tag
        def bookCount = bookRepository.count();
        def tagCount = tagRepository.count();
        
        when:
        book.tags = tags;
        bookRepository.saveAndFlush(book);

        then:
        bookRepository.count() == bookCount + 1;
        tagRepository.count() == tagCount + 1;
    }

}