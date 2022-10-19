import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // Facade design implementation.
        Facade facade = new Facade();
        facade.invokeFacade();
    }
}