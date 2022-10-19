import java.io.IOException;
import java.util.Scanner;

public class Seller extends Person {
	int select;

	public Seller(ProductMenu theMeatMenu, ProductMenu theProduceMenu) {
		super(theMeatMenu, theProduceMenu);
	}

	public Seller() {

	}


	@Override
	public void showMenu() throws IOException {
		System.out.println("Enter which menu you want to sell");
		System.out.println("1. Meat Menu \n2. Produce Menu");
		Scanner sc = new Scanner(System.in);
		select = sc.nextInt();
		if (select == 1) {
			theMeatMenu.showMenu();
		}
		else {
			theProduceMenu.showMenu();
		}
	}

	public ProductMenu CreateProductMenu() {
		switch (select) {
			case 1:
				System.out.println("Please enter Meat Item you want to sell");
				return new MeatProductMenu();
			case 2:
				System.out.println("Please enter Meat Item you want to sell");
				return new ProduceProductMenu();
		}
		return null;
	}

}
