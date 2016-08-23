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

    @RequestMapping(value = "/install")
    public String insertPerson(){
        Person person1=new Person(null,"chenmingjiang",33,"xi'an");
        Person person2=new Person(null,"hechen",18,"xi'an");
        Person person3=new Person(null,"dongshuyue",30,"xi'an");
        Person person4=new Person(null,"lumeng",33,"beijing");
        Person person5=new Person(null,"liuwu",28,"xi'an");
        Person person6=new Person(null,"zhaona",18,"xi'an");
        personService.save(person1);
        personService.save(person2);
        personService.save(person3);
        personService.save(person4);
        personService.save(person5);
        personService.save(person6);
        return "install ok";
    }

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

    /***
     * url: http://127.0.0.1/findByAddressAndName?name=cmj&address=xi'an
     * @param name
     * @param address
     * @return
     */
    @RequestMapping(value = "/withNameAndAddressQuery")
    public Person withNameAndAddressQuery(String name, String address) {
        return personService.withNameAndAddressQuery(name, address);
    }

    /***
     * url: http://127.0.0.1/findByAddressAndName?name=cmj&address=xi'an
     * 通过Enitty对象上的Quersy名称，查询dao层的方法
     * @param name
     * @param address
     * @return
     */
    @RequestMapping(value = "/withNameAndAddressNamedQuery")
    public Person withNameAndAddressNamedQuery(String name, String address) {
        return personService.withNameAndAddressNamedQuery(name, address);
    }
}
