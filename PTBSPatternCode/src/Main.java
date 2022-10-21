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


    }
}
