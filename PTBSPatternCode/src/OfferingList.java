public class OfferingList {
    String offeringList;

    public ListIterator createIterator() {
        return new OfferingIterator();
    }
}
