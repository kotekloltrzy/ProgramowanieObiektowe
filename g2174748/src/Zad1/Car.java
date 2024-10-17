package Zad1;

public class Car {
    public String model;
    public String brand;
    public int speed;

    public Car(String brand,String model){
        this.brand=brand;
        this.model = model;
        this.speed = 0;
    }
    public void accelerete(int value){
        speed+=value;
        System.out.println("Przyrzpieszone na :"+value+ "Nowa predkosc: "+speed);
    }
    public void decelaryte(int value){
        speed-=value;
        if(speed<0)
            speed=0;
        System.out.println("obniżyli na:"+value+"aktualna prędkosc:"+speed);

    }
}
