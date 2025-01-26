package WindowDisplay;

public class TestWindow {
    public static void main(String[] args) {
        WindowDisplay wd = new WindowDisplay(new InfoMessage());
        wd.showMessage();
        wd.setMessage(new ErrorMessage());
        wd.showMessage();
    }
}
