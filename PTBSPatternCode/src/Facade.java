import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Facade {

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ArrayList<String> nProductList;

	private Person thePerson;

	public void setUserType() throws IOException {
		System.out.println("<----Setting the user type and validating user with Facade Design Pattern.---->");
		System.out.println("Select the userType: \n 0: Buyer \n 1: Seller");
		System.out.println("Enter userType:");
		Scanner sc = new Scanner(System.in);
		UserType = sc.nextInt();

	}

	public boolean login() throws IOException {
		Login user = new Login();
		boolean loginStatus = user.login(UserType);
		if(!loginStatus) {
			System.out.println("Invalid Credential");
		}
		else {
			createUser();
		}
		return loginStatus;
	}

	// Implementing bridge pattern to show th menu items as per productInfo.txt
	public void createUser() throws IOException {
		if (UserType == 0) {
			Person buyer = new Buyer(new MeatProductMenu(), new ProduceProductMenu());
			System.out.println("<----Showing the menu option using bridge design pattern---->");
			buyer.showMenu();
			SelectProduct(buyer);
		}
		else {
			Person seller = new Seller(new MeatProductMenu(), new ProduceProductMenu());
			System.out.println("<----Showing the menu option using bridge design pattern---->");
			seller.showMenu();
			SelectProduct(seller);
		}

	}

	// Factory Design Implementation.
	public void SelectProduct(Person currentUser) throws IOException {
		if (UserType == 0) {
			System.out.println("\n<---- Accessing products offered by the seller using Factory Design---->");
			System.out.println("Menu based on products offering!");
			ProductMenu menu = currentUser.CreateProductMenu();
			menu.createMenu(UserType);
		}
		else {
			System.out.println("\n<---- Announcing products offered using Factory Design---->");
			System.out.println("Create menu to sell your products!!!!");
			ProductMenu menu = currentUser.CreateProductMenu();
			menu.createMenu(UserType);
		}
	}

	// Visitor Design Pattern
	public void createProductList() throws IOException {
		System.out.println("\n<----Invoking the accept method using Visitor Design Pattern---->");
		ClassProductList visitor = new ClassProductList();
		visitor.accept(new NodeVisitor());

		String productInfo = "./src/ProductInfo.txt";
        FileReader fr = new FileReader(productInfo);
		BufferedReader br = new BufferedReader(fr);
		String line, product;
        while ((line= br.readLine()) != null) {
		product = line.split(":")[1].toLowerCase();
		nProductList.add(product);
        }

		ProductIterator p = new ProductIterator();
//        String products = br.readLine();
//        while (products != null) {
//            productList[i] = products;
//            i++;
//            products = br.readLine();
//        }
//        ProductIterator p = new ProductIterator(productList);
//        System.out.println("Choose the product");
	}

	public void productOperation() {

	}
	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}
	public void AttachProductToUser() {

	}
}
