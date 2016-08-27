package com.etyy.service;

import com.etyy.entity.Person;
import com.etyy.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chenmingjiang on 2016/8/21.
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;
//    @Value(value = "pageSize")
    private int PAGESIZE=3;

    @Override
    public Person save(Person cmj) {
        Person person = personRepository.save(cmj);
        return person;
    }

    @Override
    public List<Person> findByAddress(String address) {
        List<Person> personEntities = personRepository.findByAddress(address);
        return personEntities;
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

    /***
     * 根据age列，正序查询，相当于order by age
     * @return
     */
    @Override
    public Iterable<Person> findAll() {
        Iterable<Person> personIterator = personRepository.findAll(new Sort(Sort.Direction.ASC,"age"));
        return personIterator;
    }

    @Override
    public Page<Person> page(int page) {
        Pageable pageable = new PageRequest(page,PAGESIZE);
        Page<Person>  personPage = personRepository.findAll(pageable);
        return personPage;
    }


}
