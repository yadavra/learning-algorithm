package com.awanish;

import java.util.Arrays;

import org.junit.Test;

public class PlusOne {
	@Test
	public void testPlusOne() {
		//int[] a = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		int[] a = { 9, 8,8,9 };


		System.out.println(Arrays.toString(plusOne(a)));

	}

	public int[] plusOne(int[] a) {
		int len = a.length;

		int carry = 0;
		if (a[len - 1] == 9) {
			a[len - 1] = 0;
			carry = 1;
		} else {
			a[len - 1] += 1;
		}
		for (int i = len - 2; i >= 0 && carry == 1; i--) {
			if (a[i] == 9) {
				carry = 1;
				a[i] = 0;
			} else {
				a[i] += carry;
				carry = 0;
				break;
			}
		}
		if (carry == 1) {
			int[] result = new int[len + 1];
			result[0] = 1;
			return result;
		} else {
			return a;

		}

	}

}
