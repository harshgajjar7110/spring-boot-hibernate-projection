package springboot.jpacrudexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.jpacrudexample.model.Person;
import springboot.jpacrudexample.model.PersonView;
import springboot.jpacrudexample.repository.PersonRepository;

import java.util.Arrays;

@RestController

@RequestMapping("/api/v1")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("")
    public ResponseEntity<?> index() {
        Person person = new Person();

        person.setFirstName("harsh");
        person.setLastName("gajjar");
        person.setId(Long.valueOf(1));
        personRepository.save(person);

        //dynamic projection
        PersonView ads = personRepository.findByFirstName("harsh", PersonView.class);
        Person ads1 = personRepository.findByFirstName("harsh", Person.class);

        // interface based projection --close
        PersonView closeProjection = personRepository.findByLastName("gajjar");


        return ResponseEntity.ok().body(Arrays.asList(ads, ads1, closeProjection));
    }
}