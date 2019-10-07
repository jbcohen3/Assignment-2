/**
 * @author Jacob Cohen
 * CSE 360
 * Assignment #2
 * contains class AddingMachine, to be used to add and subtract numbers
 */

package cse360assign2;

/**
 * class AddingMachine to add to or subtract from a total initially set to 0
 */
public class AddingMachine
{
	private int total;
	private String format;
	
	/**
	 * constructor to initialize a new AddingMachine
	 */
	public AddingMachine ()
	{
		total = 0;  // not needed - included for clarity
		format = "0";
	}
	
	/**
	 * total will be the sum of all values either added or subtracted from
	 * this adding machine through the use of the add and subtract methods
	 * 
	 * @return total
	 */
	public int getTotal ()
	{
		return total;
	}
	
	/**
	 * adds value to the total of this AddingMachine, and appends it to format
	 * 
	 * @param value to add to this AddingMachine
	 */
	public void add (int value)
	{
		total += value;
		format += " + " + value;
	}
	
	/**
	 * subtracts value from the total of this AddingMachine, and appends it to format
	 * 
	 * @param value to subtract from this AddingMachine
	 */
	public void subtract (int value)
	{
		total -= value;
		format += " - " + value;
	}
		
	/**
	 * format stores all of the values added to or subtracted from this AddingMachine in
	 * the style of how they would be inputed into a calculator
	 * 
	 * @return format
	 */
	public String toString ()
	{
		return format;
	}
	
	/**
	 * resets this AddingMachine by setting the total to 0 and setting the format to "0"
	 */
	public void clear()
	{
		total = 0;
		format = "0";
	}
}
