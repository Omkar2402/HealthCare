public class Admin
{
    private String email;
    private String pass;

    void login(String email, String pass){
        if (email.length() > 0 && pass.length()>0) {
            System.out.println("Login successful");
        }
        else if (pass.length()<=0) {
            System.out.println("Invalid password");
        }
        else if (email.length()<=0) {
            System.out.println("Invalid email");
        }
    }



    public static void main(String[] args) {
        Admin obj = new Admin();
        obj.login("abcmail","pass123");

    }
}