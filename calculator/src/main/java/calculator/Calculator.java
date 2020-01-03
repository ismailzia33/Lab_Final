package calculator;

public class Calculator {
	
	/***
	 * This method finds the maximum in three integers
	 * @param num1 is first integer
	 * @param num2 is second integer
	 * @param num3 is third integer
	 * @return will return maximum integer
	 */
	public int findMax(int num1, int num2, int num3) {
		int[] arr = { num1, num2, num3 };
		int max = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	
	/****
	 * This method calculates the square of a positive integer, which is 
     * less than 10
	 * @param the input integer
	 * @return will return the square of the input integer
	 * @throws IllegalArgumentException when the input integer is not 
     * between 0 and 10
	 */
	public int square(int num) throws IllegalArgumentException {
		int result = 0;
		
		if (num > 0 && num < 10) {
			result = num * num;
		} 
		else
			throw new IllegalArgumentException();
		return result;
	}
	
	/**
	 * This method calculates the cube of an entered integer
	 * @param num is an input integer
	 * @return will return the cube of the inputed integer
	 */

	public int cube(int num){
		return num*num*num;
	}
}
