package Cau1;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private String gender;
    private String dateOfBirth;
    private boolean isMarried;
    private List<Person> children;

    public Person(String name, String gender, String dateOfBirth, boolean isMarried) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.children = new ArrayList<>();
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public boolean isMarried() {
        return isMarried;
    }

    public List<Person> getChildren() {
        return children;
    }

    private Person spouse;

    public void setMarriedWith(Person spouse) {
        this.spouse = spouse;
        this.spouse.spouse = this;
    }
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }
}
