package com.awanish;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TwoSum {

	@Test
	public void testTwoSum() {

		int[] in = { -1,-2,-3,-4,-5};
		int target = -8;

		System.out.println(Arrays.toString(twoSum(in, target)));

	}

	public int[] twoSum1(int[] a, int target) {
		// using two pointer seems work only for sorted array .
		int len = a.length;
		int j = len - 1;
		int i = 0;
		int[] result = new int[2];
		while (i < len && j >= 0) {
			if (a[i] + a[j] > target) {
				j--;

			} else if (a[i] + a[j] == target) {
				if (i > j) {
					result[0] = j;
					result[1] = i;
				} else {
					result[0] = i;
					result[1] = j;
				}
				break;
			} else {
				i++;
			}

		}

		return result;
	}

	public int[] twoSum(int[] a, int target) {
		// using two pointer .
		int len = a.length;
		int j = 0;

		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < len; i++) {
			if (map.containsKey(a[i])) {
				j = map.get(a[i]);
				result[0] = j;
				result[1] = i;
			} else {
				map.put(target - a[i], i);
			}

		}

		return result;
	}

}