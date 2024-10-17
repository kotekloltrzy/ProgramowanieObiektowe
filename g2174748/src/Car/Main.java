package Car;

public class Main {
    public static void main(String[] args){
        Car car1 = new Car("Toyota", " Corrola", 2022);
        Car car2 = new Car("Toyota", " Corrola");
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.productionYear);
        System.out.println();
        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.productionYear);
    }
}
