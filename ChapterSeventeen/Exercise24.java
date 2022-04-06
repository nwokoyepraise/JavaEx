import static util.Print.print;
import java.util.*;

/**
 * This class solves Exercise 24 Chapter 17 ["Arrays"] of the
 * book "Thinking in Java"
 * 
 * This exercise shows that classes can also be searched
 * 
 * @author @nwokoyepraise
 */

class IntClass implements Comparable<IntClass> {
	protected int x;
	IntClass(int x) { this.x = x; }
	public int compareTo(IntClass intClass) {
		return (this.x < intClass.x ? -1 : (this.x == intClass.x ? 0 : 1));
	}
	public boolean equals(Object object) {
		return (object.getClass().getSimpleName() == "IntClass" 
			&& this.x == ((IntClass)object).x) ? true : false;
	}
}

class Exercise24 {
	public static void main(String[] args) {
		IntClass[] intClasses = { new IntClass(45), new IntClass(23), new IntClass(34), new IntClass(3)};
		System.out.println(Arrays.toString(intClasses));
		Arrays.sort(intClasses);
		int index = Arrays.binarySearch(intClasses, new IntClass(3));
		print("Index: " + index + ", " + intClasses[index]);
	}
}