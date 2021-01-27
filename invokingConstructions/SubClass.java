package invokingConstructions;

public class SubClass extends SuperClass {
    SubClass(int age) {
        super(age);
    }

    public static void main(String args[]) {
        SubClass obj = new SubClass(24);
        obj.getAge();
    }
}
