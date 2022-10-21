import java.util.ArrayList;

public class ClassProductList {


	public void accept(NodeVisitor visitor) {
		visitor.visitProduct(this);
	}

	public ListIterator createIterator() {
		return new ProductIterator();
	}

}
