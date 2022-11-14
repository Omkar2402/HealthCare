import java.util.*;

public class HealthCare {

    void addUser(String name, String email) {
        if (name.length()>0 && email.length()>0) {
            System.out.println(name+" your registration was successful");
        }
        else if (name.length()<=0) {
            System.out.println("Invalid name");
        }
        else if (email.length()<=0) {
            System.out.println("Invalid email");
        }
    }

    void ratereviewrecipe(String username, String recipe, double rate, String review) {
        System.out.println(username+" your rating and review was successfully saved");
        System.out.println("Recipe name: "+recipe);
        System.out.println("Your rating: "+rate);
        System.out.println("Your review: "+review);
    }


    


    public static void main(String[] args) {
        HealthCare obj = new HealthCare();
        obj.addUser("Abc", "as");
        obj.ratereviewrecipe("Abc","Salad",4.3,"Very good recipe.");


    }

}
