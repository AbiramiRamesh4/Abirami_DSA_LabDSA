package com.greatlearning.labsession3Q1;

import java.util.Scanner;
import java.util.Stack;

public class BalancingBrackets {

	public static void main(String args[]) {

		System.out.println("Question 1");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the string:");
		String input = scan.next();
		System.out.println(isBalancedBracket(input));

	}

	public static boolean isBalancedBracket(String input) {
		if (input == null || input.isBlank()) {
			System.out.println("Empty input string");
			return false;
		}
		
		Stack<Character> stack = new Stack<Character>();

		for (char ch : input.toCharArray()) {
			if (ch == '{' || ch == '(' || ch == '[') {
				stack.push(ch);
				continue;
			}

			switch (ch) {
			case '}':
				if (stack.pop() != '{') {
					return false;
				}
				break;
			case ']':
				if (stack.pop() != '[') {
					return false;
				}
				break;
			case ')':
				if (stack.pop() != '(') {
					return false;
				}
				break;
			default:
				System.out.println("Invalid Character");
				return false;
			}
		}

		return stack.isEmpty();

	}

}
