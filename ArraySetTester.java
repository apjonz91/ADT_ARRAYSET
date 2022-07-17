/**+
 * A test for the constructors and methods of the ArraySet class.
 * @author Aaron Jones
 * @version 06/13/2022
 *
 */
public class ArraySetTester 
{
	public static void main (String[] args)
	{
		String[] array;
		//construct ArraySet for testing
		ArraySet<String> dox= new ArraySet<String>();
		System.out.println("Constructing an ArraySet without parameters with a default capicity of 5!");
		
		//testing current amount of elements stored.
		System.out.println("Testing the current size of the ArraySet.Should be 0!");
		System.out.println("Result---");
		System.out.println(dox.getCurrentSize());
		
		//adding and removing elements from the ArraySet.
		System.out.println("Calling the remove method to remove the following string (luigi) on an empty array set!");
		dox.remove("Luigi");		
		System.out.println("calling the add method a total of 8 times, \nand the remove method an additional time. \nWill be adding the following names in this order\nSarah, Kirby, Sarah, Yoshi, Mario, Jason from StateFarm, Kupa, and Eren.\nThe String Sarah is removed after the fourth add call");
		System.out.println("Result---");
		dox.add("Sarah");
		dox.add("Kirby");
		dox.add("Sarah");
		dox.add("Yoshi");
		dox.remove("Sarah");
		dox.add("Mario");
		dox.add("Jason from StateFarm");
		dox.add("Kupa");
		dox.add("Eren");
		
		//printing each element
		array = dox.toArray();
		for(int i = 0; i< dox.getCurrentSize(); i++)
		{
			System.out.print(array[i] + ", ");
		}
		
		//Printing how many elements are currently in the ArraySet.
		System.out.println("\nTesting the current size of the ArraySet. Should be 5.");
		System.out.println(dox.getCurrentSize());
	}

}
