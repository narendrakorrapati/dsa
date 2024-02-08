package com.narendra.strings;

public class GoalParser {

	public static void main(String[] args) {
		String command = "G()(al)";
		
		command = command.replace("()", "o").replace("(al)", "al");
		
	}
}
