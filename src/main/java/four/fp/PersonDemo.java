package four.fp;

import java.time.LocalDate;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Faruk");
        person.setSurname("Hodzic");
        person.setBirthDate(LocalDate.now());
        person.setAge(23);

        Person person1 = new Person()
                .setName("Tarik")
                .setSurname("Bulic")
                .setBirthDate(LocalDate.now());
    }
}
