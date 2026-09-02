public class Car{
    String brand;
    String model;
    int price;

    public Car(){
      
    }
    public Car(String brand){
        this.brand = brand;
    }
    public Car(String brand, String model ,int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public static void main(String []args){
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.price = 30000;

        Car car2 = new Car("Honda");

        Car car3 = new Car("Ford", "Mustang", 50000);
    }
}