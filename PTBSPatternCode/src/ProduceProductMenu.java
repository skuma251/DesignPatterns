import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProduceProductMenu implements ProductMenu {

	public void showMenu() throws IOException {
		String file = "C:\\Users\\skuma251\\Desktop\\SE\\Fall2022\\SER501\\assignmentDS\\DecoratorPattern\\src\\ProductInfo.txt";
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line, productType, product;
		ArrayList<String> products= new ArrayList<String>();
		while ((line = br.readLine()) != null) {
			productType = line.split(":")[0].toLowerCase();
			product =  line.split(":")[1].toLowerCase();
			if(productType.equals("produce")) {
				products.add(product);
			}
		}
		System.out.println("Options in Produce menu are:" + products);

	}

	public void showAddButton() {

	}

	public void showRadioButton() {

	}

	@Override
	public void showComboxes() {
		System.out.println("Produce products menu");
	}

	@Override
	public void showLabels() {

	}

	@Override
	public void createMenu(int userType) throws IOException {

	}


	public void showViewButton() {

	}

}
