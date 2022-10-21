import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // Facade design implementation.
        Facade facade = new Facade();
        facade.setUserType();
        boolean loginstatus = facade.login();

        // Visitor design implementation
        if(loginstatus) {
            facade.createProductList();
        }

//        String productInfo = "./src/ProductInfo.txt";
//        FileReader fr;
//        String[] productList = new String[15];
//        int i = 0;
//        fr = new FileReader(productInfo);
//        BufferedReader br = new BufferedReader(fr);
//        String products = br.readLine();
//        while (products != null) {
//            productList[i] = products;
//            i++;
//            products = br.readLine();
//        }
//        ProductIterator p = new ProductIterator(productList);
//        System.out.println("Choose the product");
//        p.createIterator();

    }
}
