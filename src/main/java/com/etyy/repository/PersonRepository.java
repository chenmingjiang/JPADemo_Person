package com.etyy.repository;

import com.etyy.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.web.config.SpringDataJacksonConfiguration;

import java.util.List;

/**
 * Created by chenmingjiang on 2016/8/21.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByAddress(String person);

    Person findByAddressAndName(String name, String address);

    @Query("select p from Person p where p.name=:name and p.address=:address")
    Person withNameAndAddressQuery(@Param("name") String name,@Param("address") String address);
}
