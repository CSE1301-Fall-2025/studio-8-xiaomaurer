package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {

	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	private String[] choices;
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] c) {
		super(prompt, answer,points);
		this.choices=c;
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	@Override
	public void displayPrompt() {
		super.displayPrompt();
		for(int i = 0 ; i<choices.length; i++){
			System.out.println(choices[i]);		
		}
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		return choices;
	}
	
	public static void main(String[] args) {
		// TODO: create your own MultipleChoiceQuestion
		String[] expectedChoices = new String[] {"131", "231", "425"};
	    MultipleChoiceQuestion q = new MultipleChoiceQuestion("What is the course code for this class", "131", 1, expectedChoices);
		q.displayPrompt();
		System.out.println(q.checkAnswer("231"));
	}

}
