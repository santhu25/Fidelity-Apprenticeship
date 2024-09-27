import java.io.*;
class Person implements Serializable{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


public class SerializationDemo {
    public static void main(String[] args) {
        Person person = new Person("Santhosh",22);
        try (FileOutputStream fileOut = new FileOutputStream("Person.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(person);
            System.out.println("Object written to file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
