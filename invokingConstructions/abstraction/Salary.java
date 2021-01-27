package invokingConstructions.abstraction;

public class Salary extends Employee {
    private double salary;

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck(){
        System.out.println("within mailCheck() of Salary class");
        System.out.println("mailing to " + getName() + " " + getAddress() + " with salary " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (salary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computePay() {
        System.out.println("computing salary for " + getName());
        return salary / 52;
    }
}
