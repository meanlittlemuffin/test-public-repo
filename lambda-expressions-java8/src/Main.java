import java.util.List;
import java.util.function.Predicate;

public class Main {

    public interface checkPerson {
        boolean test(Person person);
    }

    public static class checkPersonImpl implements checkPerson {

        @Override
        public boolean test(Person person) {
            return person.getGender() == Person.Gender.MALE && person.getAge()>=18 && person.getAge()<=40;
        }
    }

    public static void main(String args[]) {
        List<Person> people = Person.generateData();
//        printPeopleOlderThan(people, 10);
//        printPeopleWithinAgeRange(people,20,60);
//        printCheckedPeople(people, new checkPersonImpl());
//        printCheckedPeople(people, new checkPerson() {
//            @Override
//            public boolean test(Person person) {
//                return person.getGender() == Person.Gender.OTHER;
//            }
//        });

//        printCheckedPeople(people, person -> person.getGender()== Person.Gender.FEMALE);

        printCheckedPeopleWithPredicate(people, person -> person.getName().equals("Soos"));
    }

    public static void printPeopleOlderThan(List<Person> people, int age) {
        for(Person person : people) {
            if(person.getAge()>=age) {
                person.printPerson();
            }
        }
    }

    public static void printPeopleWithinAgeRange(List<Person> people, int low, int high) {
        for(Person person : people) {
            if(person.getAge()>low && person.getAge()<high) {
                person.printPerson();
            }
        }
    }

    public static void printCheckedPeople(List<Person> people, checkPerson cp) {
        for (Person person : people)
            if(cp.test(person)) {
                person.printPerson();
            }
    }

    public static void printCheckedPeopleWithPredicate(List<Person> people, Predicate<Person> p) {
        for (Person person : people)
            if(p.test(person)) {
                person.printPerson();
            }
    }
}
