package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.hamcrest.core.IsInstanceOf;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */

public class EncapsulateTheData {
	// 1. Encapsulate the member variables.
	// Add restrictions to the setters according to the comment.

	// 2. Create a new JUnit Test case and write tests to verify that
	// the member variables' getters and setters are working

	protected int itemsReceived; // must not be negative. All negative arguments get set to 0.
	protected float degreesTurned; // must be locked between 0.0 and 360.0 inclusive.
	protected String nomenclature = " "; // must not be set to a blank string. Blank Strings get set to a space
	protected Object memberObj; // must not be a String. If it is a String, set it equal to a new Object();

	public int getItemsReceived() {
		return itemsReceived;
	}

	public void setItemsReceived(int itemsReceived) {
		if (itemsReceived >= 0) {
			this.itemsReceived = itemsReceived;
		} else {
			this.itemsReceived = 0;
		}
	}

	public String getNomenclature() {
		return nomenclature;
	}

	public void setNomenclature(String nomenclature) {
		if (nomenclature.length() == 0) {
			this.nomenclature = " ";
		} else {
			this.nomenclature = nomenclature;
		}
	}

	public Object getMemberObj() {
		return memberObj;
	}

	public void setMemberObj(Object memberObj) {
		if (memberObj instanceof String) {
			this.memberObj = new Object();
		} else {
			this.memberObj = memberObj;
		}
	}

	public void setDegreesTurned(float degreesTurned) {
		if (degreesTurned >= 0.0 && degreesTurned <= 360.0) {
			this.degreesTurned = degreesTurned;
		} else {
			System.out.println("Value must be between 0.0 and 360.0");
		}
	}

	public static void main(String[] args) {
		EncapsulateTheData c = new EncapsulateTheData();
		c.setDegreesTurned((float) 40.2);
		assertEquals(40.2, c.getDegreesTurned(), 0.01);
		c.setItemsReceived(4);
		assertEquals(4, c.getItemsReceived());
		c.setItemsReceived(-4);
		assertEquals(0, c.getItemsReceived());
		c.setMemberObj(78);
		assertEquals(78, c.getMemberObj());
		c.setMemberObj("bad");
		assertEquals( c.memberObj, c.getMemberObj());
		c.setNomenclature("good");
		assertEquals("good", c.getNomenclature());
		c.setNomenclature("");
		assertEquals(" ", c.getNomenclature());
	}

	public float getDegreesTurned() {
		return degreesTurned;
	}
}
