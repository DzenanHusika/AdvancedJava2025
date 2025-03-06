package five;

import one.exception.OurReader;
import one.generic.PersonReader;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Person implements Serializable, Comparable<Person> {
    public static List<Person> socialNetwork;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private Gender gender;

    public Person(){

    }

    public Person(String name, String surname, LocalDate birthDate, Gender gender){
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public int compareTo(Person anotherPerson) {
        String anotherPersonName = anotherPerson.getSurname();
        int surnameResult = this.surname.compareTo(anotherPersonName);
        return surnameResult;
    }
}
