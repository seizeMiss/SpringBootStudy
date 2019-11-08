package com.dragon.spring.sample;

import org.junit.Test;

public class NumTest {
	
	@Test
	public void test(){
		float i = .95f;
		
		System.out.println(i);
	}

	@Test
	public void testLeetCode(){

		String[] strs = {"flower","flow","flight"};

		System.out.println(longestCommonPrefix(strs));
	}

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		if (strs.length == 1){
			return strs[0];
		}
		StringBuffer sb = new StringBuffer();
		int minLength  = strs[0].length();
		for (String str : strs) {
			if (minLength > str.length()){
				minLength = str.length();
			}
		}
		int count = 0;
		int size = strs.length;
		for (int i = 0; i < minLength; i++) {
			char c = strs[0].charAt(i);
			for (int j = 1; j < size; j++) {
				if (c == strs[j].charAt(i)){
					count++;
				}
			}
			if (count == size -1) {
				sb.append(c);
				count = 0;
			} else {
				break;
			}
		}
		return sb.toString();
	}
	

}
