import java.io.IOException;
import java.util.Scanner;

public class Facade {

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList nProductList;

	private Person thePerson;

	public void invokeFacade() throws IOException {
		System.out.println("Select the userType: \n 0: Buyer \n 1: Seller");
		System.out.println("Enter userType:");
		Scanner sc = new Scanner(System.in);
		int UserType = Integer.parseInt(sc.next());
		login(UserType);
	}

	public void login(int UserType) throws IOException {
		Login user = new Login();
		boolean loginStatus = user.login(UserType);
		System.out.println(loginStatus);

	}

//	public void addTrading() {
//
//	}
//
//	public void viewTrading() {
//
//	}
//
//	public void decideBidding() {
//
//	}
//
//	public void discussBidding() {
//
//	}
//
//	public void submitBidding() {
//
//	}
//
//	public void remind() {
//
//	}
//
//	public void createUser(UserInfoItem userInfoItem) {
//
//	}
//
//	public void createProductList(int userType) {
//		if(userType == 0) {
//			Seller
//		}
//	}
//
//	public void AttachProductToUser() {
//
//	}
//
//	public void SelectProduct() {
//
//	}
//
//	public void productOperation() {
//
//	}

}
