package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.length() > 40 || name.equals("")){
            throw new IllegalArgumentException("Wrong name");
        }
        if (age<0 || age>120){
            throw new IllegalArgumentException("Wrong age");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
