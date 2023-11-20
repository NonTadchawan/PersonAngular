package com.example.person.controller;

import com.example.person.Repo.PersonRepo;
import com.example.person.domain.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    private final PersonRepo repo;

    public PersonController(PersonRepo repo) {
        this.repo = repo;
    }

    @PostMapping()
    Person save(Person person){
        return repo.save(person);
    }

    @GetMapping()
    Page<Person> findAll(Pageable pageable){
        return repo.findAll(pageable);
    }
}
