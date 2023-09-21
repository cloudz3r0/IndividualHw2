package Hw;

public class Car {/*Create a Class Car that would have the following fields: carPrice and
color and method calculateSalePrice() which should be returning a
price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field
as weight and has its own implementation of calculateSalePrice()
method in which returned price is calculated as following: if
weight>2000 then returned price car should include 10% discount,
otherwise 20% discount.
The Sedan class has field as length and also does it is own
implementation of calculateSalePrice(): if length of sedan is >20 feet
then returned car price should include 5% discount, otherwise 10%
discount
*/
   private int carPrice;
    private String carColor;

    public Car(int carPrice, String carColor){
        this.carColor=carColor;
        this.carPrice=carPrice;
    }
   double calculateSetPrice(){
       return carPrice;
    }
}
class Truck extends Car{
double weight;
    public Truck(int carPrice, String carColor, double weight) {
        super(carPrice, carColor);

    }
    double calculateSetPrice(){
        if(weight >2000){
            return super.calculateSetPrice()-super.calculateSetPrice()*10;
        } else {
            return super.calculateSetPrice()-super.calculateSetPrice() * 0.20;
        }
    }
}

class Sedan extends Car {
    private int length;

    public Sedan(int carPrice, String carColor, int length) {
        super(carPrice, carColor);
        this.length = length;
    }


    double calculateSalePrice() {
        if (length > 20) {
            return super.calculateSetPrice()-super.calculateSetPrice() * 0.05;
        } else {
            return super.calculateSetPrice()-super.calculateSetPrice() * 0.10;
        }
    }
}

class Testing{
    public static void main(String[] args) {
        Truck t1= new Truck(60000,"Grey",4000);
        System.out.println("Truck sale price "+t1.calculateSetPrice());

        Sedan s1= new Sedan(50000,"White",18);
        System.out.println("Sedan sale price "+s1.calculateSetPrice());

    }
    }
