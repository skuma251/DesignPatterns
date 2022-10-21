public class ReminderVisitor implements NodeVisitor {

	private Reminder m_Reminder;

	public ReminderVisitor() {

	}

	public void visitProduct(ClassProductList product) {
		System.out.println("Visited product item");
	}

	public void visitTrading(Trading trading) {
		System.out.println("Visited trading item");
	}

	public void visitFacade(Facade facade) {
		System.out.println("Visited facade item");
	}

}
