package de.unistuttgart.iste.sqa.pse.sheet09.presence.recursionEuclidean;

/**
 * This class is meant to run the two versions for the algorithm for greatest
 * common divisor.
 * 
 * @author Daniel Winter
 * @version 24.12.2021
 *
 */
public class RecursionApp extends Recursion {

	public static void main(String[] args) {
		int a = 450;
		int b = 23;
		System.out.println(greatestCommonDivisor(a, b));
		System.out.println(greatestCommonDivisorLoop(a, b));

	}

}
