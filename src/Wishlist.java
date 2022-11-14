public class Wishlist extends HealthCare {
    void Wish(String recipe) {
        System.out.println(recipe+" added to wishlist");
    }

    public static void main(String[] args) {
        Wishlist obj = new Wishlist();
        obj.Wish("Panner Tikka Masala");
    }
}
