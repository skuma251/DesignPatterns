import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MeatProductMenu implements ProductMenu {

	public void showMenu() throws IOException {
		String file = "C:\\Users\\skuma251\\Desktop\\SE\\Fall2022\\SER501\\assignmentDS\\DecoratorPattern\\src\\ProductInfo.txt";
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line, productType, product;
		ArrayList<String> products= new ArrayList<String>();
		while ((line = br.readLine()) != null) {
			productType = line.split(":")[0].toLowerCase();
			product =  line.split(":")[1].toLowerCase();
			if(productType.equals("meat")) {
				products.add(product);
			}
		}
		System.out.println("Options in Meat menu are:" + products);
	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}


	public void showComboxes() {

	}

	@Override
	public void showLabels() {

	}

	public void createMenu(int user) throws IOException {
//		OfferingIterator offerings = new OfferingIterator(user);

		if(user == 0) {
			System.out.println("Enter the item you want to buy");
			Scanner sc = new Scanner(System.in);
			String item = sc.next();

		}
		else {
			System.out.println("Enter the item you want to sell");
			Scanner sc = new Scanner(System.in);
			String item = sc.next();
		}

	}

}
