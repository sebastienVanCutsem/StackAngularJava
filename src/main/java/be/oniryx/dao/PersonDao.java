package be.oniryx.dao;

import be.oniryx.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by sebas on 27-01-16.
 */
public interface PersonDao extends CrudRepository<Person, Long>{

    public List<Person> findByLastName(String lastName);

    public List<Person> findByFirstName(String firstName);
}
