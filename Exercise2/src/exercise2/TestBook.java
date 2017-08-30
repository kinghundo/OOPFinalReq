package exercise2;
public class TestBook {
    public static void main(String[] args){
        Author putra = new Author("Brian Putra", "brian@hotwheels.com", 'm');
        System.out.println(putra);
        Book animalia = new Book("Animalia", putra, 50, 20);
        System.out.println(animalia);
        
        animalia.setPrice(21.20);
        animalia.setQty(25);
        System.out.println("name is: "+animalia.getName());
        System.out.println("price is: "+animalia.getPrice());
        System.out.println("qty is: "+animalia.getQty());
        System.out.println("Author is: "+animalia.getAuthor());
        System.out.println("Author's name: "+animalia.getAuthor().getName());
        System.out.println("Author's email: "+animalia.getAuthor().getEmail());
        
        Book newBook = new Book("Plants", 
                new Author("Fariz", "fariz@hotwheels.com", 'm'), 15.29);
        System.out.println(newBook);
    }
    
    
}
