package com.etyy.repository;

import com.etyy.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by chenmingjiang on 2016/8/21.
 */
public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findByAddress(String person);

    Person findByAddressAndName(String name, String address);

    @Query("select p from Person p where p.name=:name and p.address=:address")
    Person withNameAndAddressQuery(@Param("name") String name, @Param("address") String address);

    Person withNameAndAddressNamedQuery(String name, String address);


    Iterable<Person> findAll(Sort age);

    Page<Person> findAll(Pageable pageable);

}
