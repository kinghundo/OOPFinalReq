package exercise2;
public class TestAuthor {
    public static void main(String[] args){
        Author brian = new Author("Brian Putra", "brian.putra@hotwheels.com", 'm');
        System.out.println(brian);
        brian.setEmail("brian@loco.com");
        System.out.println("name is: " + brian.getName());     
        System.out.println("eamil is: " + brian.getEmail());   
        System.out.println("gender is: " + brian.getGender()); 
    }
}
