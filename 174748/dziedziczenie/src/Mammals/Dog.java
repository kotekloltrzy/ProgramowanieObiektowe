package Mammals;

import Animals.Animal;

public class Dog extends Animal {
    public Dog(String species, int age) {
        super(species, age);
    }

    public void przedstawPsa(){
        // System.out.println("To jest " + species + " ma on już" + age + " lat");
        System.out.println("To jest " + species + " ma on już " + getAge() + " lat");
    }
}
