package com.etyy.controller;

import com.etyy.entity.Person;
import com.etyy.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by chenmingjiang on 2016/8/21.
 */
@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    /***
     * url: http://127.0.0.1/save?address=xi'an&name=cmj%age=20
     * @param name
     * @param address
     * @param age
     * @return
     */
    @RequestMapping(value = "/save")
    public Person savePerson(String name, String address, Integer age) {
        Person person = personService.save(new Person(null, name, age, address));
        return person;
    }

    /***
     * url: http://127.0.0.1/findByAddress?address=xi'an
     * @param address
     * @return
     */
    @RequestMapping(value = "/findByAddress")
    public List<Person> findByAddress(String address) {
        List<Person> persons = personService.findByAddress(address);
        return persons;
    }

    /***
     * url: http://127.0.0.1/findByAddressAndName?name=cmj&address=xi'an
     * @param name
     * @param address
     * @return
     */
    @RequestMapping(value = "/findByAddressAndName")
    public Person findByAddressAndName(String name, String address) {
        return personService.findByAddressAndName(address, name);
    }
}
