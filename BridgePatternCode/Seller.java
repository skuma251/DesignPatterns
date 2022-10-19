import java.io.IOException;
import java.util.Scanner;

public class Seller extends Person {

	public Seller(ProductMenu theMeatProductMenu, ProductMenu theProduceProductMenu) {
		super(theMeatProductMenu, theProduceProductMenu);
	}
	@Override
	public void showMenu() throws IOException {
		System.out.println("Seller");
		System.out.println("Enter the choice of your product to sell:");
		System.out.println("1. Meat Menu \n2. Produce Menu");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		if (select == 1) {
			theMeatProductMenu.showMenu();
		}
		else {
			theProduceProductMenu.showMenu();
		}

	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
