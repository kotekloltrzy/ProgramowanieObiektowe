package WindowDisplay;

interface Message{
    void display();
}

public class WindowDisplay {
    Message message;

    public WindowDisplay(Message message){
        this.message = message;
    }

    public void showMessage(){
        message.display();
    }

    public Message getMessage(){
        return message;
    }

    public void setMessage(Message message){
        this.message = message;
    }
}
