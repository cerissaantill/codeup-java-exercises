public class StringsLecture {
    public static void main(String[] args) {
        String cheese = "cheese";
        System.out.println(cheese);
        char letter = cheese.charAt(1);
        System.out.println(letter);
        int index = cheese.indexOf('s');
        System.out.println(index);



        if (cheese.equalsIgnoreCase("CHEESE"))
            System.out.println("snap");
        else
            System.out.println("doh");

// not finished, check zion repo

    }
}
