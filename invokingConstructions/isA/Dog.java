package invokingConstructions.isA;

public class Dog extends Mammal {
    public static void main(String args[]) {
        // Animal a = new Animal();
        Mammal b = new Mammal();
        Reptile c = new Reptile();
        Dog d = new Dog();
        System.out.println(b instanceof Animal);
        System.out.println(c instanceof Animal);
        System.out.println(d instanceof Animal);
        System.out.print(d instanceof Mammal);
    }
}
