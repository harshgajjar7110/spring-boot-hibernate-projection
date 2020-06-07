package net.guides.springboot2.springboot2jpacrudexample.repository;

import java.util.List;

import org.springframework.data.solr.repository.SolrCrudRepository;

import net.guides.springboot2.springboot2jpacrudexample.model.Employee;

public interface ProductRepository extends SolrCrudRepository<Employee, Long> {
	List<Employee> findByFirstName(String first_name);
List<Employee> findAll();
}
