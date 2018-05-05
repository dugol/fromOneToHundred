package co.edu.udea.bl;

/**
 * 
 * This class is responsible for printing the numbers from 1 to 100, with a variant. If the number is multiples of 3, print Fizz,
 * if the number is multiples of 5, print Buzz, in both cases print FizzBuzz.
 * @author Daniel Uribe Giraldo
 *
 */
public class PrintFromOneToHundred {
	
	private final String FIZZBUZZ="FizzBuzz";
	private final String FIZZ="Fizz";
	private final String BUZZ="Buzz";

	public void fromOneToHundred() {
		Validation validation=new Validation();
		for (int i = 1; i < 101; i++) {
			if(validation.checkFiveMultiplo(i) && validation.checkThreeMultiplo(i)) {
				System.out.println(FIZZBUZZ);
			}else if (validation.checkThreeMultiplo(i)) {
				System.out.println(FIZZ);
			}else if(validation.checkFiveMultiplo(i)) {
				System.out.println(BUZZ);
			}else {
				System.out.println(i);
			}
		}
	}
}
