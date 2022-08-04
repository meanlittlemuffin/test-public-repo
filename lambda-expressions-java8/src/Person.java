import java.util.ArrayList;
import java.util.List;

public class Person {

    public enum Gender {
        MALE, FEMALE, OTHER;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", emailAddress='" + emailAddress + '\'' +
                ", gender=" + gender +
                '}';
    }

    public Person(String name, int age, String emailAddress, Gender gender) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
        this.gender = gender;
    }

    String name;
    int age;
    String emailAddress;
    Gender gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void printPerson() {
        System.out.println(this.toString());
    }

    public static List<Person> generateData() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("DeathSlayer", 7, "sdeath2k@gmail.com", Gender.OTHER));
        people.add(new Person("Gintoki", 30, "gintoki.sakata@outlook.com", Gender.MALE));
        people.add(new Person("Mabel", 13, "mabel.pines@yahoo.com", Gender.FEMALE));
        people.add(new Person("Soos", 18, "soos@gmail.com", Gender.MALE));
        people.add(new Person("Stan", 70, "stan.pines@hotmail.com", Gender.MALE));
        people.add(new Person("Waddles", 5, "waddles.the.cutie@gmail.com", Gender.OTHER));
        return people;
    }



}
