package com.awanish;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class LongestPalindromicSubString {

	@Test

	public void findSubStringLength() {

		String input = "aa";
		java.util.List evenNumberList = new ArrayList<Integer>();
		if (input == null || input.length() == 0) {
			return ;
		}
		int len = input.length();
		boolean dp[][] = new boolean[len][len];
		int maxLn = -1;
		int start = 0;
		int end = 0;
		for (int i = 0; i < len; i++) {

			for (int j = 0; j <= i; j++) {
				boolean isCharAtIandJEqual = input.charAt(j) == input.charAt(i);
				if (i == j || (i - j <= 2 && isCharAtIandJEqual)) {
					dp[j][i] = true;
				} else {
					dp[j][i] = dp[j + 1][i - 1] && isCharAtIandJEqual;
				}

				if (dp[j][i] && i - j + 1 > maxLn) {
					// longestString=input.substring(j, i+1);
					start = j;
					end = i + 1;
					maxLn = i - j + 1;
				}

				//
			}

		}
		
		System.out.println("longest substring" + input.substring(start, end));
	}

}
