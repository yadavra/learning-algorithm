package com.awanish;

import org.junit.Test;

public class Atoi {

	@Test
	public void testAtoi() {

		System.out.println(myAtoi("-9223372036854775809"));

	}

	public int myAtoi(String str) {
		if (str == null || str == " " || str.trim().isEmpty()) {
			return 0;
		}
		str = str.trim();
		char[] ch = str.toCharArray();
		long returnNumber = 0;
		int sign = 1;
		int i = 0;
		if (ch[0] == '-') {
			sign = -1;
			i++;
		} else if (ch[0] == '+') {
			i++;
		}
		while (i < ch.length) {
			if (!isNumber(ch[i])) {
				break;
			}
			if (checkForOverFlow(returnNumber, ch[i])) {
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			returnNumber = returnNumber * 10 + (ch[i] - '0');
			i++;
		}

		return (int) returnNumber * sign;
	}

	private boolean checkForOverFlow(long returnNumber, char ch) {
		return returnNumber > (Integer.MAX_VALUE - (ch - '0')) / 10;
	}

	private boolean isNumber(char ch) {
		if (ch < '0' || ch > '9') {
			return false;
		}
		return true;
	}
}
