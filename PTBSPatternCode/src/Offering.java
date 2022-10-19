import java.util.Iterator;

public class Offering implements ListIterator {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    OfferingList[] offeringsList;

    public Offering() {
        offeringsList = new OfferingList[MAX_ITEMS];
        addItem("beef");
        addItem("pork");
    }

    private void addItem(String s) {
        OfferingList o = new OfferingList(s);
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Full");
        else
        {
            offeringsList[numberOfItems] = o;
            numberOfItems = numberOfItems + 1;
        }
    }
    public Iterator createIterator() {
        return (Iterator) new OfferingIterator(offeringsList);
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
