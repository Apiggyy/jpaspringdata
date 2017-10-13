package com.self.learning;

import com.self.learning.entity.Person;
import com.self.learning.repository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDataTest {
    @Autowired
    PersonRepository personRepository;

    @Test
    public void testFindPersonByFindName() {
        Person person = personRepository.getByLastName("aa");
        System.out.println(person);
    }

    @Test
    public void testGetByAddressStartingWith() {
        List<Person> personList = personRepository.getByAddressStartingWith("add");
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    @Test
    public void testGetByLastNameStartingWithAndIdLessThan() {
        List<Person> personList = personRepository.getByLastNameStartingWithAndIdLessThan("bb", 4);
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    @Test
    public void testGetByEmailEndingWithAndIdLessThan() {
        List<Person> personList = personRepository.getByEmailEndingWithAndIdLessThan("qq.com", 4);
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    @Test
    public void testGetByEmailInAndAgeLessThan() {
        List<Person> personList = personRepository.getByEmailInOrAgeLessThan(Arrays.asList
                ("gg@qq.com", "hh@qq.com", "ii@qq.com"), 20);
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    @Test
    public void testGetByDeptIdGreaterThan() {
        List<Person> personList = personRepository.getByDept_IdGreaterThan(10);
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    @Test
    public void testGetMaxIdPerson() {
        Person person = personRepository.getMaxIdPerson();
        System.out.println(person);
    }

    @Test
    public void test() {

    }

}
