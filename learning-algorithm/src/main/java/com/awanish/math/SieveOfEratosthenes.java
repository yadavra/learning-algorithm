package com.awanish.math;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

//Algorithm to calculate the prime numbers 
public class SieveOfEratosthenes {

	@Test
	public void testPrime() {
		calculatePrimeNumbers(10);

	}
//// time complexity is of  Nlog(logn)  O(n/2+n/3+n/4---)
	public void calculatePrimeNumbers(int n) {

		boolean[] bitVector = new boolean[n + 1];
		List<Integer> primeNumbers = new ArrayList<Integer>();
		for (int i = 0; i < n + 1; i++) {
			bitVector[i] = true;
		}

		for (int j = 2; j < n + 1; j++) {
			if (bitVector[j]) {
				primeNumbers.add(j);
				isPrime(j);
				for (int k = j*j ; k < n + 1; k = k + j) {
					bitVector[k] = false;
				}

			}

		}
		System.out.println(primeNumbers.toString());
	}

	public boolean isPrime(int n) {

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i * i < n; i++) { // time complexity is of √ N
			if (n % i == 0) {
				return false;
			}
		}
		System.out.println(n + ": isPrime");
		return true;
	}

}
