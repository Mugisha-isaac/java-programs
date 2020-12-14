package invokingConstructions.abstraction;

public abstract class Employee {
    private String name;
    private String address;
    private int number;
    public Employee(String name, String address,int number){
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public double computePay(){
      System.out.println("inside Employee computePay");
      return 0.0;
    }
    public void mailCheck(){
        System.out.println("send mail to " + this.name + ' ' + this.address);
    }
    public String toString(){
        return name + " " + address + " " + number;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String newAddress){
        this.address = newAddress;
    }
    public int getNumber(){
        return number;
    }
}
