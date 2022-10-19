import java.io.FileNotFoundException;
import java.io.IOException;

public interface ProductMenu {

	public abstract void showMenu() throws IOException;

	public abstract void showAddButton();

	public abstract void showViewButton();

	public abstract void showRadioButton();

	public abstract void showComboxes();

	public abstract void showLabels();

}
