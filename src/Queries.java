
public class Queries {
    void Query(String query) {
        System.out.println("Your query has been raised - ");
        System.out.println(query);
    }

    public static void main(String[] args) {
        Queries obj = new Queries();
        obj.Query("Not able to find recipe");
    }
}
