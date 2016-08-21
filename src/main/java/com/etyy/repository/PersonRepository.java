package com.etyy.repository;

import com.etyy.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by chenmingjiang on 2016/8/21.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByAddress(String person);

    Person findByAddressAndName(String name, String address);
}
