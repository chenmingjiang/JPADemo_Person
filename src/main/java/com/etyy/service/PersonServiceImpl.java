package com.etyy.service;

import com.etyy.entity.Person;
import com.etyy.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chenmingjiang on 2016/8/21.
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    public Person save(Person cmj) {
        Person person = personRepository.save(cmj);
        return person;
    }

    @Override
    public List<Person> findByAddress(String address) {
        List<Person> persons = personRepository.findByAddress(address);
        return persons;
    }

    @Override
    public Person findByAddressAndName(String name, String address) {
        return personRepository.findByAddressAndName(name, address);
    }

    @Override
    public Person withNameAndAddressQuery(String name, String address) {
        return personRepository.withNameAndAddressQuery(name, address);
    }

    @Override
    public Person withNameAndAddressNamedQuery(String name, String address) {
        return personRepository.withNameAndAddressNamedQuery(name, address);
    }
}
