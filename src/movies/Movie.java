package movies;

public class Movie {

    private String name;
    private String category;



    // command N , Getter and Setters  -- will auto populate the below structure:

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    // Constructor:
    // command N, Constructor will auto populate a constructor if string name; string category; is listed.
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;





    }
}
