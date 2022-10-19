import java.io.*;
import java.util.Scanner;

public class Login {
    public boolean login(int UserType) throws IOException {
        String file;
        if (UserType == 0) {
            file =  "C:\\Users\\skuma251\\Desktop\\SE\\Fall2022\\SER515\\Assignment7\\FacadePattern\\Facade\\src\\BuyerInfo.txt";
        }
        else {
            file = "C:\\Users\\skuma251\\Desktop\\SE\\Fall2022\\SER515\\Assignment7\\FacadePattern\\Facade\\src\\SellerInfo.txt";
        }

        System.out.println("Enter your credentials");
        System.out.println("Username: ");
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        System.out.println("Password: ");
        String password = sc.next();

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);


        String line, user, pass;
        boolean isLoginSuccess = false;
        while ((line = br.readLine()) != null) {
            user = line.split(":")[0].toLowerCase();
            pass =  line.split(":")[1].toLowerCase();
            if(user.equals(userName) && pass.equals(password)) {
                isLoginSuccess = true;
                break;
            }
        }

        return isLoginSuccess;
    }
}