import java.io.IOException;
import java.util.Scanner;

public class Buyer extends Person {

	public Buyer(ProductMenu theMeatProductMenu, ProductMenu theProduceProductMenu) {
		super(theMeatProductMenu, theProduceProductMenu);
	}
	@Override
	public void showMenu() throws IOException {
		System.out.println("Buyer");
		System.out.println("Enter the choice of your product to buy:");
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
