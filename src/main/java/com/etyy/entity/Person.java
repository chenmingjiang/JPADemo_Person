package com.etyy.entity;

import javax.persistence.*;

/**
 * Created by chenmingjiang on 2016/8/21.
 */
@Entity(name = "Person")
@Table(name = "Person")
//@NamedQuery(name = "Person.withNameAndAddressNamedQuery", query = "select p from Person p where p.name=?1 and address=?2")
public class Person {
    @Id //2
    @GeneratedValue //3
    private Long id;
    private String name;
    private Integer age;
    private String address;

    public Person() {
        super();
    }

    public Person(Long id, String name, Integer age, String address) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
