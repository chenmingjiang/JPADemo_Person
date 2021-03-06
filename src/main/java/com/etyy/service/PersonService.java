package com.etyy.service;

import com.etyy.entity.Person;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by chenmingjiang on 2016/8/21.
 */
public interface PersonService {
    Person save(Person cmj);

    List<Person> findByAddress(String address);

    Person findByAddressAndName(String name, String address);

    Person withNameAndAddressQuery(String name, String address);

    Person withNameAndAddressNamedQuery(String name, String address);

    Iterable<Person> findAll();

    public Page<Person> page(int page);

}
