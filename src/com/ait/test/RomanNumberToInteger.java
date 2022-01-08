package com.ait.test;

import java.util.HashMap;
import java.util.Map;

/*Iterate through given roman number from right to left(reverse).
 * Initialize result=0. 
 * Take one character at a time and check its corresponding numeral from the table and add it to 
 * the result.The only special case that needs to be considered is when the character at 
 * left has smaller value than the character at right.for example‘IX’for 9 or‘IV’for 4,in 
 * such cases subtract left character value from the result.Except for this special case,
 * In all other cases,all the pairs have left character value>=right character value.
*/
public class RomanNumberToInteger {
	public static int RomanToInt(String s) {
		if (s == null || s.length() == 0)
			return -1;

		System.out.println("Roman Number: " + s);
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int len = s.length(), result = map.get(s.charAt(len - 1));
		for (int i = len - 2; i >= 0; i--) {
			if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))
				result += map.get(s.charAt(i));
			else
				result -= map.get(s.charAt(i));
		}
		System.out.println("Integer: " + result);
		System.out.println("------------------------------------");
		return result;
	}

	public static void main(String[] args) {
		RomanToInt("MIXX");
		RomanToInt("III");
	}
}
