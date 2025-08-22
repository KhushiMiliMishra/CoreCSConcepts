package OOP;

//Classes and Objects
//class named car is created
public class Car {
    //attributes brand, year are created
    String brand;
    int year;

    //method start    
    public void start()
    {
        System.out.println("The car is starting");
    }
}

class Main{
    public static void main(String[] args) {
        Car car1=new Car();
        car1.brand="Hyundai";
        car1.year=2015;
        car1.start();

        Car car2=new Car();
        car2.brand="Ford";
        car2.year=2018;
        car2.start();
        
    }
}