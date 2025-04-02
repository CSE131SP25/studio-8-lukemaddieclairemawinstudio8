package studio8;

import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class Quiz {
	private Question[] q;
	/**
	 * Constructor
	 * @param questions
	 */
	public Quiz(Question[] questions) {
		this.q = questions;
	}
	
	/**
	 * Prompts the user to answer, then returns a String containing their answer.
	 * @param in
	 * @return String answer
	 */
	private String getUserAnswer(Scanner in) {
		System.out.print("Please enter your answer: ");
		String out = in.next();
		return out;
	}
	
	/**
	 * Gets the number of points possible in the quiz.
	 * @return int number of total points
	 */
	public int getTotalPoints() {
		int total = 0;
		for(int i = 0; i < q.length; i++) {
			total += q[i].getPoints();
		}
		return total;
	}
	
	/**
	 * Asks the user all question in the quiz, then prints out 
	 * the amount of points the user earned. This print statement
	 * should include "You earned ____ points"
	 * 
	 * @param in Scanner object to feed into getUserAnswer
	 */
	public void takeQuiz(Scanner in) {
		int userPoints = 0;
		for(int i = 0; i < q.length; i++) {
			q[i].displayPrompt();
			userPoints += q[i].checkAnswer(getUserAnswer(in));
		}
		System.out.println("You earned " + userPoints + " points");
	}
	
	
	public static void main(String[] args) {
		// TODO: Make your own Quiz!
	}
}
