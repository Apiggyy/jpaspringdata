package com.self.learning.repository;

import com.self.learning.entity.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

//@RepositoryDefinition(domainClass = Person.class,idClass = Integer.class)
public interface PersonRepository extends Repository<Person, Integer> {
    Person getByLastName(String lastName);

    List<Person> getByAddressStartingWith(String addredss);

    //sql like : where last_name like '?%' and id < ?
    List<Person> getByLastNameStartingWithAndIdLessThan(String lastName, int id);

    //sql like : where email like '%?' and id < ?
    List<Person> getByEmailEndingWithAndIdLessThan(String email, int id);

    //sql like : where email in (?,?,?) or age < ?
    List<Person> getByEmailInOrAgeLessThan(List<String> emails, int age);

    //级连查询
    List<Person> getByDept_IdGreaterThan(int id);

    @Query("select p from Person p where p.id in (select max(p.id) from Person p)")
    Person getMaxIdPerson();

}
