package cse360assign3;

/**
  * Calculator object for arithmetic operations
  * @author Benjamin Smith (PIN 810) CSE 360 Spring 2016
  * @version February 22, 2016
  */
public class Calculator {

	/**int for use in calculations. */
	private int total;
	
	/**string to track calculator input/output history */
	private String history;
	
	/**
      * Constructor for initializing the calculator object.
	  * @author Benjamin Smith (PIN 810) CSE 360 Spring 2016
      * @version February 22, 2016
      */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Gets the calculator's total.
	 * @return Calculator total result
	 * @author Benjamin Smith (PIN 810) CSE 360 Spring 2016
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds the value to total.
	 * @param value Value to add to total
	 * @author Benjamin Smith (PIN 810) CSE 360 Spring 2016
	 */
	public void add (int value) {
		total = value + total;
		history = history + " + " + value;
	}
	
	/**
	 * Subtracts the value from total
	 * @param value Value to subtract from total
	 * @author Benjamin Smith (PIN 810) CSE 360 Spring 2016
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/**
	 * Multiply total by value
	 * @param value Value to multiply by
	 * @author Benjamin Smith (PIN 810) CSE 360 Spring 2016
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	
	/**
	 * Divides total by value
	 * @param value Value to divide by
	 * @author Benjamin Smith (PIN 810) CSE 360 Spring 2016
	 */
	public void divide (int value) {
		if (value == 0)
			total = 0;
		else {
		total = total / value;
		}
		history = history + " / " + value;
	}
	
	/**
	 * Returns string containing the calculator's history
	 * @return String containing the calculator's history
	 * @author Benjamin Smith (PIN 810) CSE 360 Spring 2016
	 */
	public String getHistory () {
		return history;
	}
}
