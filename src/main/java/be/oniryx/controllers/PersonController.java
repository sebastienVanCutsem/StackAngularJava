package be.oniryx.controllers;

import be.oniryx.dao.PersonDao;
import be.oniryx.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sebas on 27-01-16.
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonDao personDao;

    @RequestMapping(method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Person>> getAllPerson() {
        List<Person> result = new ArrayList<>();
        for (Person p : personDao.findAll()) {
            result.add(p);
        }
        return new ResponseEntity<List<Person>>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
    public void addPerson(@RequestParam(value="firstName") String firstName, @RequestParam(value="lastName") String lastName) {
        Person person = new Person(firstName, lastName);
        personDao.save(person);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        personDao.delete(id);
    }

}
