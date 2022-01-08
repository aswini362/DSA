package com.ait.test;

import java.util.function.Predicate;

public class DetectCapital {
	public static boolean detectCaptial(String word) {
		if (word.length() <= 1)
			return true;
		Predicate<Character> correctCase = Character::isLowerCase;
		if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
			correctCase = Character::isUpperCase;
		}
		for (int i = 0; i < word.length(); i++) {
			if (!correctCase.test(word.charAt(i)))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(detectCaptial("USA"));
		System.out.println(detectCaptial("Google"));

	}

}
