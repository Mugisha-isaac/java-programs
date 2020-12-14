package invokingConstructions.abstraction.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo {
    public static void main(String args[]) {
        Person p1 = new Person(1, 12, "mugisha");
        Person p2 = new Person(1, 12, "mugisha");
        List<Person> Persons=new ArrayList<Person>();
        Persons.add(p1);
        Persons.add(p2);
        HashSet<Person> prsn = new HashSet<Person>();
        prsn.add(p1);
        prsn.add(p2);
        System.out.println(" by using list ");
        System.out.println("-------------");
        for (Person p : Persons) {
            System.out.println("names: " + p.getName());
        }
        // for (int i = 0; i < Persons.size(); i++) {
        //     System.out.println("name at " + i + " is " + Persons.get(i).getName());
        // }

        System.out.println(" by using set ");
        System.out.println("-------------");
        Set<Person> Personss = new HashSet<Person>();
        Personss.add(p1);
        Personss.add(p2);
        // for (int i = 0; i < Personss.size(); i++) {
        //     System.out.println("name at " + i + " is " + Personss.get(i).getName());
        // }
        for (Person p : Personss) {
            System.out.println("names: " + p.getName());
        }
    }
}
