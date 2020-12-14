package invokingConstructions;

public class SuperClass {
    int age;

    SuperClass(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println("the value of age in super class is " + age);
    }

}
