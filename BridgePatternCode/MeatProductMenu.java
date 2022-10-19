import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MeatProductMenu implements ProductMenu {

	public void showMenu() throws IOException {
		System.out.println("Meat");
		String file = "C:\\Users\\skuma251\\Desktop\\SE\\Fall2022\\SER501\\assignmentDS\\DecoratorPattern\\src\\ProductInfo.txt";
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line, productType, product;
		while ((line = br.readLine()) != null) {
			productType = line.split(":")[0].toLowerCase();
			product =  line.split(":")[1].toLowerCase();
			if(productType.equals("meat")) {
				System.out.println(product);
			}
		}
	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	@Override
	public void showLabels() {

	}

	public void showLabel() {

	}

	public void showComboxes() {

	}

}
