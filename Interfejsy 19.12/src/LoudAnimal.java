public interface LoudAnimal {
    final static int tysiac = 1000;
    void makeSound();
    default void sayName(){
        System.out.println("Nie wiem jak sie nazywam");
    }
}