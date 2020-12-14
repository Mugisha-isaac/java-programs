package invokingConstructions.overriding;

public class Dog extends Aniaml {
    public void move(){
        super.move();
        System.out.println("dog can move and run ");
    }
    public static void main(String args[]){
        Aniaml a = new Dog();
        a.move();
    }
}
