package seven;

import java.util.ArrayList;
import java.util.List;

public class Person {
    static int counter = 0;

    private String name;

    public Person(String name){
        counter++;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public static void incrementCounter(){
        counter++;
    }
    class Passport{
        private String passportId;

        public void setPassportId(String passportId) {
            this.passportId = passportId;
        }

        public String getPassportId() {
            return passportId;
        }
    }
    static class PersonRegistry{
        private List<Person> personList = new ArrayList<>();

        public PersonRegistry(){}

        public void addPersonToRegistry(Person person){
            personList.add(person);
        }
    }
}
