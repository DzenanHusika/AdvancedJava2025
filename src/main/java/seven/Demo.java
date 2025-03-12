package seven;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person("Faruk");
        person.setName("Fare");

        Person.Passport personPassport = person.new Passport();
        personPassport.setPassportId("023023");

        Person.PersonRegistry registry = new Person.PersonRegistry();
        registry.addPersonToRegistry(person);
    }
}
