import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Person buyer = new Buyer(new MeatProductMenu(), new ProduceProductMenu());
        buyer.showMenu();
        Person seller = new Seller(new MeatProductMenu(), new ProduceProductMenu());
        seller.showMenu();
    }
}