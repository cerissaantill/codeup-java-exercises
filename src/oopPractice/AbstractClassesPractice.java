package oopPractice;

public class AbstractClassesPractice {

// Create an instrument abstract class:


        abstract class Instrument {


            protected String name;

            protected  String type;

            protected String size;

            public Instrument(String name, String type, String size) {
                this.name = name;
                this.type = type;
                this.size = size;
            }

            public String getName() {
                return name;
            }

            public String getType() {
                return type;
            }

            public String getSize() {
                return size;
            }

        }  // closes Instrument class

//
//        abstract class Violin extends Instrument {
//            super();
//            this.name ="Violin";
//            this.type ="String";
//            this.size ="Small";
//        }
//
//        abstract class Trombone extends Instrument {
//            super
//        }


}  // closes AbstractClassesPractice class
