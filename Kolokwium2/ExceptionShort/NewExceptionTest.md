```java
package ExceptionShort;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NewExceptionTest {
    public static String getValidUserInput() throws InputTooShortException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ciąg co najmniej 4 znaków: ");
        String userInput = sc.nextLine();
        if(userInput.length() < 4){
            throw new InputTooShortException("Napis nie ma conajmnie 4 znaków");
        }
        return "OK";
    }

    public static void main(String[] args) {
        try{
            System.out.println(getValidUserInput());
        }catch (InputTooShortException e){
            System.out.println(e.getMessage());
        }
    }
}
```
