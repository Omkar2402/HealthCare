public class Article
{
    private int id;
    private String name;

    void newPost(int id, String post){
        if(id > 0 && post.length() > 0){
            System.out.println("New post created");
        }
        else{
            System.out.println("Invalid input!");
        }
    }

    void editPost(int id, String post){
        if(id > 0 && post.length() > 0){
            System.out.println("Edited post");
        }
        else{
            System.out.println("Invalid input!");
        }
    }

    void delete(int id, String post){
        if(id > 0 && post.length() > 0){
            System.out.println("Post deleted!");
        }
        else{
            System.out.println("Invalid input!");
        }
    }

    public static void main(String[] args) {
        Article obj = new Article();
        obj.newPost(100,"Meditate");
        obj.editPost(151,"Recipe121");
        obj.delete(123,"Cakes");
    }
}
