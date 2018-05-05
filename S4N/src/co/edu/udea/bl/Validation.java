package co.edu.udea.bl;

/**
 * 
 * this class is responsible for checking if a number is multiples of 3, multiples of 5 or both
 * @author Daniel Uribe Girldo
 *
 */
public class Validation {

	/**
	 * this method is responsible for checking if a number is multiples of 3
	 * @param number number to validate.
	 * @return true if the number is multiples of 3, false in another case
	 */
	public boolean checkThreeMultiplo(int number) {
		if(number%3==0)return true;
		return false;
	}
	
	/**
	 * this method is responsible for checking if a number is multiples of 5
	 * @param number is the number to validate.
	 * @return true if the number is multiples of 3, false in another case
	 */
	public boolean checkFiveMultiplo(int number) {
		if(number%5==0)return true;
		return false;
	}
	
	
}
