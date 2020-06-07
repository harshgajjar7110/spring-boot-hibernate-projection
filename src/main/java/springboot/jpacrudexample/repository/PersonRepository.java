package springboot.jpacrudexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.jpacrudexample.model.Person;
import springboot.jpacrudexample.model.PersonView;

@org.springframework.stereotype.Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	<T> T findByFirstName(String name, Class<T> type);

	PersonView findByLastName(String name);

}