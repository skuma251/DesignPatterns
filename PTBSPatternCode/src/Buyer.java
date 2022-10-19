import java.io.IOException;
import java.util.Scanner;

public class Buyer extends Person {
	int select;
	public Buyer(ProductMenu theMeatMenu, ProductMenu theProduceMenu) {
		super(theMeatMenu, theProduceMenu);
	}

	public Buyer() {
		super();
	}

	@Override
	public void showMenu() throws IOException {
		System.out.println("Enter which menu you want to buy:");
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
		switch (select){
			case 1:
				return new MeatProductMenu();
			case 2:
				return new ProduceProductMenu();
		}
		return null;
	}

}
