import java.util.Scanner;

// 1.

public class Person {
   private String name;         // private name property that is a string

   public Person(String name) {
       this.name = name;
   }

   public String getName() {    // required method from exercise
       return name;
   }

   public void setName(String name) {   // required method from exercise
       this.name = name;
   }

   public void sayHello() {     // required method from exercise
       System.out.printf("Hello, %s", name);
   }






    public static void main(String[] args) {       // creates main method

// 2.
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);


//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);


        Person person1 = new Person("John");
        Person person2 = person1;

        System.out.println(person1.getName());
        System.out.println(person2.getName());

        person2.setName("Jane");

        System.out.println(person1.getName());
        System.out.println(person2.getName());




    }
    // main method











}
// Person class
