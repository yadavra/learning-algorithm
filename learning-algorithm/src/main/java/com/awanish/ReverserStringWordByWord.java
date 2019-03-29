package com.awanish;

import java.util.Arrays;

import org.junit.Test;

public class ReverserStringWordByWord {

	@Test
	public void reverseStringWordByWord() {

		char[] inputString = { 't', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e' };

		reverseWords(inputString);
		System.out.println(Arrays.toString(inputString));
		

	}

	

	public void reverseWords(char[] inputString) {
		int i = 0;
		int j = 0;
		while (i <=inputString.length) {
			if (i == inputString.length || inputString[i] == ' ') {
				reversword(inputString, j, i-1);
				i++;
				j=i;
			}
			i++;
			

		}
		reversword(inputString,0,inputString.length-1);
	}

	private void reversword(char[] inputString, int j, int i) {
		while (j < i) {
			char temp = inputString[i];
			inputString[i] = inputString[j];
			inputString[j] = temp;
			j++;
			i--;
		}

	}
}
