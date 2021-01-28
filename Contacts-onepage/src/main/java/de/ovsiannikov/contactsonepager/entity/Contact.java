package de.ovsiannikov.contactsonepager.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Setter
    private String firstName;

    @Setter
    private String lastName;

    @Setter
    private Integer age;

    public Contact(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
