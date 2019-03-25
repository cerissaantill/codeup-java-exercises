public class MethodsLecture {
    public static void main(String[] args) {



// UNFINISHED, CHECK AGAINST ZION GITHUB



//        String message = "Hello World";
//        message.toUpperCase();
//        System.out.println(MethodsLecture.reverse(message) + " is the reverse of " + message);
//
//        sum(sum(9, 11), 14);


        Student cory = new Student("Cory");
        Student bethany = new Student("Bethany");
        System.out.println(Student.studentCount);
//        System.out.println(sayHello(bethany, name));
        System.out.printf("Area of circle wih radius 3 is %f");

    }




        public static String sayHello (String name){
            return String.format("Hello, %s!", name);

        }


        static int sum ( int first, int second){
            return first + second;
        }


//        String substring ( int startsAt){
//
//        }


//       String toUpperCase() {
//        for ()
//            this[i].to
//
//        // converts to upper case and return
//    }


        static String reverse (String original){
            return "";
        }
    }




// =====================================


        class Student {

            static int studentCount = 0;
            String name;

            Student(String name) {
                studentCount++;
                this.name = name;

            }

        }












