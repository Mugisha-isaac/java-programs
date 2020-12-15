public class GenericMethod {
    public <E> void printArrayElements(E[] elements){
        for(E element:elements){
            System.out.println(element);
        }
        System.out.println();
    }
    public static void main(String args[]){
        GenericMethod  gen = new GenericMethod();
        Integer[] intArray = {1,2,3,4,5,6,7,8};
        String[] stringArray = {"mugisha","isaac","abizera","oreste"};
        System.out.println("array of intergers");
        System.out.println("-------------------");
        gen.printArrayElements(intArray);
        System.out.println("array of strings");
        System.out.println("-----------------");
        gen.printArrayElements(stringArray);
        
    }
}
