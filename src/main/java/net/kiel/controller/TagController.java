package net.kiel.controller;

import net.kiel.domain.Tag;
import net.kiel.domain.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Hong, Min Hyoung (kielhong@gmail.com)
 * Date : 15. 11. 29.
 */
@Controller
@RequestMapping("/tags")
public class TagController {
    @Autowired
    TagRepository tagRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String findAll(Model model) {
        List<Tag> tags = tagRepository.findAll();

        model.addAttribute("tags", tags);

        return "tag_list";
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String findByName(@PathVariable String name, Model model) {
        Tag tag = tagRepository.findByName(name);

        model.addAttribute("tag", tag);
        model.addAttribute("books", tag.getBooks());

        return "tag_books";
    }
}
