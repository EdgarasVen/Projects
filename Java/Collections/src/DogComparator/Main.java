package DogComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Dog> animals = new ArrayList<>();
        animals.add(new Dog("Shepard", "Fanky", 10));
        animals.add(new Dog("Russian", "Woof", 12));
        animals.add(new Dog("Lithuanian", "Luci", 9));
        animals.sort((o1, o2) -> o1.getAge() - o2.getAge());
        animals.sort(new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        /*Set<Dog> treelist = new TreeSet<>();
        treelist.add(new Dog("Shepard", "Fanky", 10));
        treelist.add(new Dog("Russian", "Woof", 12));
        treelist.add(new Dog("Lithuanian", "Luci", 9));
        for (Dog dog:treelist) {
            System.out.println(dog.toString());
        }*/
        /*animals.sort((o1, o2) -> o1.getAge() - o2.getAge());
        for (Dog dog:animals) {
            System.out.println(dog.toString());
        }
        System.out.println();
        animals.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        for (Dog dog:animals) {
            System.out.println(dog.toString());
        }*/
    }
}
