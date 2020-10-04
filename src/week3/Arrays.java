package week3;

public class Arrays {

	public static void main(String[] args) {
		
		int[] ages = new int[9];
		
		ages[0] = 3;
		ages[1]	= 9;	
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		for (int i= 0; i < ages.length; i++)  {
			
				if(ages[i] == 0) {
					
				}
				else {
					System.out.println("Age for client number: " + i + " is: " + ages[i] + " years old");
				}
		}
			
			// subtract first value from last value
		subtractElement(ages);
			
			// add new age to array and repeat the step above to ensure dynamic
		ages[8] = 100;
		for (int i= 0; i < ages.length; i++)  {
			System.out.println("Age for client number: " + i + " is: " + ages[i] + " years old");			
		}
		subtractElement(ages);
			
			// use loop to iterate through the array and calculate the average age print result
		System.out.println("NEW LOOP ITERATION");
		for (int i=0; i < ages.length; i++) {
			System.out.println("Age for client number: " + i + " is: " + ages[i] + " years old");
		}
		System.out.println("Ages Array average is " + intArrayAvg(ages));
		
		System.out.println("NAMES ARRAY /// NEW QUESTION");
		
		String[] names = new String[6];
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		//use loop to iterate through array and calculate average letter per name (.length)
		avgStringArray(names);
		
		
		// use loop to iterate through the array again spaced together w concatenation
		String concatenatedNames = "";
		for(int i=0; i< names.length; i++) { 
			concatenatedNames += names[i] + " ";
			
		}
		System.out.println(concatenatedNames);
		// access last element of array
		System.out.println("Last element of the array is: " + names[names.length-1]);
		//access first element of array
		System.out.println("First element of the array is: " + names[0]);
		int[] nameLengths = new int[6];
	
	}//main
	
	//prints first and last name fused with a space
	public static void fullName(String firstName, String lastName) {
		System.out.println(firstName + " " + lastName);
		return;
	}

//method that takes an int array, sums up,  and says true if over 100
	public static boolean intArraySumOver100 (int[] array) {
		if(intArraySum(array) > 100) {
			return true;
		}
		else {
			return false;
		}
		
	}
	

//method that takes a double array, returns average of all elements
	public static double dblArrayAvg(double[] array) {
		return (dblArraySum(array) / array.length);
	}

//method takes 2 double array and says true if the average of the first is larger than average of the 2nd
	public static boolean dblDoubleArray(double[] array1, double[] array2) {
		if (dblArrayAvg(array1) > dblArrayAvg(array2)) {
			return true;
		}
		else {
			return false;
		}
	}
	
//method called "willBuyDrink" that takes a boolean "isHotOutside" and a double "moneyInPocket" and returns true if it is hot outside
	//and if moneyInPocket is greater than 10.50
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside = true && moneyInPocket > 10.50) {
			return true;
		}
		else {
			return false;
		}
	}
	
// create a method of your own: this array gets the sum of the double, helps deduce the code amount for me
	public static double dblArraySum(double[] array) {
		double sum = 0;
		for(double value : array) {
			sum += value;
		}
		return sum;
	}
	
// int array sum method	
	public static int intArraySum(int[] array) {
		int sum = 0;
		for(int value : array) {
			sum += value;
		}
		return sum;
	}
//int array avg method
	public static double intArrayAvg(int[] array) {
		return (intArraySum(array) / array.length);
	}
	
//method made in class for element replacement
	public static void replaceElement(String[] array, String value, String valueChange) {
		for(int i=0; i < array.length; i++) {
			if(array[i].equals(value)) {
				array[i] = valueChange;
			}
			System.out.println(array[i]);
		}
	}	
	
	//method made in class for element replacement
	public static void subtractElement(int[] array) {
		int value;
		value = array[(array.length)-1] - array[0];
		System.out.println("The last age subtracted by the first age is: " + value);
	}	
	//method for counting chars and averaging the number in a string array
	public static void avgStringArray(String[] array) {
		int counter = 0;
		for(int i = 0; i < array.length; i++) {
			counter += array[i].length();
			
		}
		System.out.println("Average amount of characters in their names: "  + counter/array.length);
		
	}

}//close class arrays

