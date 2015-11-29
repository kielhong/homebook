package net.kiel.controller;

import net.kiel.domain.Book;
import net.kiel.domain.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Hong, Min Hyoung (kielhong@gmail.com)
 * Date : 15. 11. 28.
 */
@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String findBooks(Model model) {
        List books = bookRepository.findAll();

        model.addAttribute("books", books);

        return "book_list";
    }

    @RequestMapping(value = "/{bookId}", method = RequestMethod.GET)
    public String findBookDetail(@PathVariable Integer bookId, Model model) {
        Book book = bookRepository.findOne(bookId);

        model.addAttribute("book", book);

        return "book_detail";
    }
}
