package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person>{
    private String name;
    private Integer id;
    private Integer age;

    public Person(String name, Integer id, Integer age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        System.out.println("age"+age);
        System.out.println("p.age"+p.age);
        return id.compareTo(p.id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
class PersonImpl{
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person("Sonal",3,23);
        Person p2 = new Person("Hema",1,21);
        Person p3 = new Person("Rupali",2,25);
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        System.out.println(personList);
        Collections.sort(personList);
        for (Person person:personList){
            System.out.println(person);
        }
    }
}