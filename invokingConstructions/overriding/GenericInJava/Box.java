package invokingConstructions.overriding.GenericInJava;
public class Box<T> {
    private T t;
    public void add(T t){
        this.t =t;
    }
    public T get(){
        return t;
    }
    public static void main(String args[]){
        Box<Integer> box1 = new Box<Integer>();
        Box<String> box2 = new Box<String>();
        box1.add(10);
        box2.add("Mugisha isaac");
        System.out.println("my age is " + box1.get());
        System.out.println("my name is " + box2.get());
    }
}
