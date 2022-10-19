import java.io.IOException;

public abstract class Person {

	protected ProductMenu theMeatProductMenu;
	protected ProductMenu theProduceProductMenu;

	public Person(ProductMenu theMeatProductMenu, ProductMenu theProduceProductMenu) {
		this.theMeatProductMenu = theMeatProductMenu;
		this.theProduceProductMenu = theProduceProductMenu;
	}

	public void showMenu() throws IOException {

	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
