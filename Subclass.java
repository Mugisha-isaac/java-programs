public class Subclass extends Superclass {
    int num = 10;

    public void display() {
        System.out.println("Hello i am from subclass");
    }

    public void myFunction() {
        Subclass obj = new Subclass();
        int finalNum = obj.num;
        System.out.println("the value of num in the subclass is " + finalNum);
        obj.display();

        System.out.println("the value of num in superclass " + super.num);
        super.display();
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.myFunction();
    }
}