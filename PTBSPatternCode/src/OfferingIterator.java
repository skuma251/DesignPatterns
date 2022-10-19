import java.io.*;
import java.util.Iterator;
import java.util.Scanner;

public class OfferingIterator implements ListIterator{
	OfferingList[] offeringLists;
	int pos = 0;
	public OfferingIterator(OfferingList[] offeringsList) {
	}

	public boolean hasNext() {
		return false;
	}


	public Offering Next() {
		return null;
	}

	public void MoveToHead() {

	}

	public void Remove() {

	}

	public Iterator createIterator() {
		return null;
	}
}
