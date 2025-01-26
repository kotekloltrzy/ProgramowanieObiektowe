package WindowDisplay;

public class ErrorMessage implements Message {
    @Override
    public void display() {
        System.out.println("Error");
    }
}
