package lambda2;

public class Employee {
    private int salary;

    @Override
    public String toString() {
        return salary+"";
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
