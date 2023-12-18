package Cau1;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private Person root;

    public FamilyTree(Person root) {
        this.root = root;
    }

    public List<Person> findUnmarriedPeople() {
        List<Person> unmarriedPeople = new ArrayList<>();
        findUnmarried(root, unmarriedPeople);
        return unmarriedPeople;
    }

    private void findUnmarried(Person person, List<Person> unmarriedPeople) {
        if (!person.isMarried()) {
            unmarriedPeople.add(person);
        }
        for (Person child : person.getChildren()) {
            findUnmarried(child, unmarriedPeople);
        }
    }

    public List<Person> findCouplesWithTwoChildren() {
        List<Person> couplesWithTwoChildren = new ArrayList<>();
        findCouplesWithChildren(root, couplesWithTwoChildren);
        return couplesWithTwoChildren;
    }

    private void findCouplesWithChildren(Person person, List<Person> couplesWithTwoChildren) {
        if (person.getChildren().size() == 2 && person.isMarried()) {
            couplesWithTwoChildren.add(person);
        }
        for (Person child : person.getChildren()) {
            findCouplesWithChildren(child, couplesWithTwoChildren);
        }
    }

    public List<Person> findLatestGeneration() {
        List<Person> latestGeneration = new ArrayList<>();
        findLatestGeneration(root, latestGeneration);
        return latestGeneration;
    }

    private void findLatestGeneration(Person person, List<Person> latestGeneration) {
        List<Person> children = person.getChildren();
        if (children.isEmpty()) {
            latestGeneration.add(person);
        } else {
            for (Person child : children) {
                findLatestGeneration(child, latestGeneration);
            }
        }
    }
}

