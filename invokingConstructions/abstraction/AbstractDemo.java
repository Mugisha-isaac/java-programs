package invokingConstructions.abstraction;

class AbstractDemo {
    public static void main(String args[]) {
        Salary s = new Salary("mugisha", "mugisha@gmail.com", 50, 10000);
        Employee e = new Salary("Oreste", "oreste@gmail.com", 50, 50000);
        System.out.println("calling mailcheck using Salary reference ----");
        s.mailCheck();
        System.out.println("calling mailcheck using employee reference---");
        e.mailCheck();

    }
}
