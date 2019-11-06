package com.shangke.springbootstujpa.pojo;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
// @NameQuery
@NamedQuery(name = "Person.withNameAndAddressNamedQuery", query = "select p from Person p where p.name=?1 and address=?2")
public class Person {
    @Id// @Id注解指明这个属性映射为数据库的主键。
    @GeneratedValue// @GeneratedValue注解默认使用主键生成方式为自增，hibernate会为我们自动生成一个名为HIBERNATE_SEQUENCE的序列。
    private Long id;

    private String name;

    private Integer age;

    private String address;

    public Person(Long id, String name, Integer age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
