import java.io.IOException;

public abstract class Person {

	protected ProductMenu theMeatMenu;
	protected ProductMenu theProduceMenu;
	protected Person (ProductMenu theMeatMenu, ProductMenu theProduceMenu)
	{
		this.theMeatMenu = theMeatMenu;
		this.theProduceMenu = theProduceMenu;
	}

	public void showMenu() throws IOException {

	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

	public void showLabels() {

	}

	public void showViewButton() {

	}

	public void showAddButton() {

	}

	public void showRadioButton() {

	}

}
