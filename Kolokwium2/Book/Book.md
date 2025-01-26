```java
package Book;

public record Book(String title, String author, int pages) {
    public Book{
        if(pages<0){
            throw new IllegalArgumentException("pages cannot be less than zero");
        }
    }
    public boolean isLarge(){
        return pages >= 400;
    }
}
```
