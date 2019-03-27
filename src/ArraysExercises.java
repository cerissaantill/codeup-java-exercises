import java.util.Arrays;


public class ArraysExercises {

    public static void main(String[] args) {


// 1.
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        System.out.println();


        // Create an array that holds 3 Person objects.
        // Assign a new instance of the Person class to each element.
        // Iterate through the array and print out the name of each person in the array.


        Person[] people = new Person[3];

        people[0] = new Person("Cerissa");
        people[1] = new Person("Katie");
        people[2] = new Person("Elizabeth");


        for (Person person : people) {
            System.out.println(person.getName());
        }


    }
    // closes main method



// 1. b

    // Create a static method named addPerson. It should accept an array of
    //  Person objects, as well as a single person object to add to the passed array.
    // It should return an array whose length is 1 greater than the passed array, with
    //  the passed person object at the end of the array.



    // THE CODE BELOW WILL NOT OUTPUT CORRECTLY, CHECK AGAINST ZION REPO /////////////////////

    Person[] addPerson(Person[] people, Person singlePeople) {
        Person[] newListOfPeople = addPerson(people, new Person("Kathryn"));

        // // can also use constructor below:
        // newPeople = new Person[oldPeople.length+1];


        newListOfPeople[people.length - 1] = singlePeople;
        return people;







    }
    // closes static Person[]


}
// closes ArraysExercises class