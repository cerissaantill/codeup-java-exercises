package oopPractice;
import java.util.Date;


public class InheritanceLecture {


    public class Animal {
        public String species;
        public Date birthday;


        public Animal() {
            this.birthday = new Date();
        }


        public void eat(String food) {
            System.out.printf("\nThe %s eats the %s\n", this.species, food);
        }



        public class Cat extends Animal {

            public Cat() {
                super();
                this.species = "cat";
            }


            public static void main(String[] args) {
                Cat cat = new Cat();
                cat.eat
            }


        }




    }  // closes Animal class


}  // closes InheritanceLecture class
