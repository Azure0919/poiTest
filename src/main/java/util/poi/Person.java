package util.poi;

import java.util.Date;

public class Person {

        private String name;

        private String sex;

        private int age;

        private Double height;

        private Date birth;

    public Person() {
    }

    public Person(String name, String sex, int age, Double height, Date birth) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.birth = birth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name) &&
                sex.equals(person.sex) &&
                height.equals(person.height) &&
                birth.equals(person.birth);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", birth=" + birth +
                '}';
    }
}
