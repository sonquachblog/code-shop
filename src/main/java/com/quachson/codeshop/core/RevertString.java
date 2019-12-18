package com.quachson.codeshop.core;

public class RevertString {
	public String revert(String value) {
		
		final StringBuilder stringBuilder = new StringBuilder("");
		String[] words = value.split(" ");
		for (int j = words.length - 1; j <= 0; j--) {
			stringBuilder.append(words[j]).append(' ');
		}
		return stringBuilder.toString();
		
	}
}
