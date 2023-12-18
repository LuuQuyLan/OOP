package Cau1;

import java.util.List;

public class FamilyTreeDemo {
    public static void main(String[] args) {
        // Tạo các cá nhân
        Person james = new Person("James", "Male", "01/01/1970", true);
        Person hana = new Person("Hana", "Female", "02/02/1975", true);
        Person ryan = new Person("Ryan", "Male", "03/03/1995", false);
        Person kai = new Person("Kai", "Male", "04/04/2000", true);
        Person jennifer = new Person("Jennifer", "Female", "05/05/1998", false);

        // Thiết lập quan hệ
        james.addChild(ryan);
        james.addChild(kai);
        james.setMarriedWith(hana);

        kai.addChild(jennifer);
        kai.addChild(new Person("AnotherChild", "Male", "01/01/2022", false));
        kai.addChild(new Person("AnotherChild", "Female", "01/01/2023", false));
        kai.addChild(new Person("AnotherChild", "Male", "01/01/2024", false));

        // Tạo cây phả hệ
        FamilyTree familyTree = new FamilyTree(james);

        // Gọi các phương thức trong FamilyTree để thực hiện các yêu cầu từ đề bài
        List<Person> unmarriedPeople = familyTree.findUnmarriedPeople();
        System.out.println("Các cá nhân không kết hôn:");
        for (Person person : unmarriedPeople) {
            System.out.println(person.getName());
        }

        List<Person> couplesWithTwoChildren = familyTree.findCouplesWithTwoChildren();
        System.out.println("\nCác cặp vợ chồng có hai con:");
        for (Person couple : couplesWithTwoChildren) {
            System.out.println(couple.getName());
        }

        List<Person> latestGeneration = familyTree.findLatestGeneration();
        System.out.println("\nCác thế hệ mới nhất:");
        for (Person person : latestGeneration) {
            System.out.println(person.getName());
        }
    }
}