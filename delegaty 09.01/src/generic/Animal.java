package generic;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void dajGlos(){
        System.out.println("Hau");
    }

    @Override
    public String toString() {
        return name.toString();
    }
}
