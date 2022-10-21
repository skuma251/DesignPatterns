public class Main {
    public static void main(String[] args) {

        NodeVisitor visitor = new ReminderVisitor();
        ClassProductList cp = new ClassProductList();
        cp.accept(visitor);

    }
}