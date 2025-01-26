```java
package Person;

public class TestPerson {
    public static <T extends Person> boolean compareObjects(T obj1, T obj2){
        return obj1.getClass().equals(obj2.getClass());
    }

    public static void main(String[] args) {
        Person p1 = new Person("Michał", 22);
        Person p2 = new Person("Adam", 23);
        Person s1 = new Student("Tomasz", 22, 4.8);
        Person s2 = new Student("Marcel", 22, 5.0);

        System.out.println(compareObjects(p1, p2));
        System.out.println(compareObjects(s1, s2));
        System.out.println(compareObjects(p1, s2));
    }
}
```
