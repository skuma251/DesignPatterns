import java.util.ArrayList;

public class ProductIterator implements ListIterator {

	private ClassProductList classProductList;
	int index = 0;
	public static ArrayList<String> productList = new ArrayList<>();
	String[] pr = new String[10];
	public ProductIterator(ArrayList<String> nProductList) {
		productList = nProductList;
	}

	public ProductIterator(){

	}

	@Override
    public boolean hasNext() {
		if(index < productList.size())
			return true;
		return false;
	}

	@Override
	public Object Next() {
		if(this.hasNext())
			return productList.get(index++);
		return null;
	}

	@Override
	public void MovetoHead() {

	}
	@Override
	public void Remove() {

	}

}
