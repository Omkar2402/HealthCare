import java.util.*;

public class Search extends HealthCare {
    Set<String> recipes = new HashSet<>();

    public Search setRecipes(Set<String> recipes) {
        this.recipes = recipes;
        return this;
    }

    public Set<String> getRecipes() {
        return recipes;
    }

    void search(String recipename) {
        if (recipes.contains(recipename)) {
            System.out.println("Found");
        }
        else {
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        Search obj = new Search();
        Set<String> set = new HashSet<>();
        set.add("Paneer Tikka");
        obj.setRecipes(set);

        obj.search("Paneer Tikka");
        obj.search("Paneer");

    }
}
