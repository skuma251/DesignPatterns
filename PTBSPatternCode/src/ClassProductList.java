public class ClassProductList {

	public void accept(NodeVisitor visitor) {
		visitor.visitProduct(new Product());
	}

		public ListIterator createIterator() {
			return new ProductIterator();
		}

}
