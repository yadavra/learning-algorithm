package com.awanish;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
 
public class CanByTicket {

	/*
	 * The new "Avengers" movie has just been released! There are a lot of
	 * people at the cinema box office standing in a huge line. Each of them has
	 * a single 100, 50 or 25 dollars bill. An "Avengers" ticket costs 25
	 * dollars. Vasya is currently working as a clerk. He wants to sell a ticket
	 * to every single person in this line. Can Vasya sell a ticket to each
	 * person and give the change if he initially has no money and sells the
	 * tickets strictly in the order people follow in the line? Return YES, if
	 * Vasya can sell a ticket to each person and give the change with the bills
	 * he has at hand at that moment. Otherwise return NO.
	 * 
	 * Examples: Line.Tickets(new int[] {25, 25, 50}) // => YES Line.Tickets(new
	 * int[]{25, 100}) // => NO. Vasya will not have enough money to give change
	 * to 100 dollars Line.Tickets(new int[] {25, 25, 50, 50, 100}) // => NO.
	 * Vasya will not have the right bills to give 75 dollars of change (you
	 * can't make two bills of 25 from one of 50)
	 * 
	 * 
	 * 
	 */
	static int numberofAvailabe25DollarBill = 0;
	static int numberofAvailabe50DollarBill = 0;
	static int numberofAvailabe100DollarBill = 0;

	public static String Tickets(int[] peopleInLine) {
		boolean ret = true;
		for (int ticketPrice : peopleInLine) {
			if (!canClarkSaleTheTicket(ticketPrice)) {
				ret = false;
				break;
			}

		}
		return ret == true ? "YES" : "NO";
	}

	private static boolean canClarkSaleTheTicket(int billUsedforBuyTicket) {
		boolean ret = false;

		switch (billUsedforBuyTicket) {
		case 25:
			return handleDenomination25();

		case 50:
			return handleDenominatation50();

		case 100:
			return handleDenomination100();
		default:
			return ret;
		}

	}

	private static boolean handleDenomination25() {
		boolean ret;
		numberofAvailabe25DollarBill++;
		ret = true;
		return ret;
	}

	private static boolean handleDenomination100() {

		boolean ret = false;
		if (canReturnChangeUsing50And25DollarBill(75)) {
			numberofAvailabe100DollarBill++;
			numberofAvailabe50DollarBill -= 1;
			numberofAvailabe25DollarBill -= 1;
			ret = true;
		} else if (canReturnChangeUsingOnly25DollarBill(75)) {
			numberofAvailabe100DollarBill++;
			numberofAvailabe25DollarBill = numberofAvailabe25DollarBill - 3;
			ret = true;
		}
		return ret;
	}

	private static boolean handleDenominatation50() {
		boolean ret = false;
		if (canReturnChangeUsingOnly25DollarBill(25)) {
			numberofAvailabe50DollarBill++;
			numberofAvailabe25DollarBill -= 1;
			ret = true;
		}
		return ret;
	}

	public static boolean canReturnChangeUsingOnly25DollarBill(int change) {

		switch (change) {
		case 25:
			return numberofAvailabe25DollarBill >= 1;
		case 75:
			return numberofAvailabe25DollarBill >= 3;

		}
		return false;
	}

	public static boolean canReturnChangeUsing50And25DollarBill(int change) {

		switch (change) {
		case 75:
			return numberofAvailabe50DollarBill >= 1 && numberofAvailabe25DollarBill >= 1;
		}
		return false;
	}

	@Test
	public void test1() {
		String result = Tickets(new int[] { 25, 25, 25, 50, 50, 100 });
		System.out.println(result);
		assertEquals("YES", result);
	}

	@Test
	public void test2() {
		assertEquals("NO", Tickets(new int[] { 25, 25, 50, 100, 25, 25, 50, 100, 25, 25, 25, 100, 100, 25 }));
	}

}
