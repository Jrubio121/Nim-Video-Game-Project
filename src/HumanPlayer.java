// Worked on this class with Guillermo, Keeton, and John

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer extends Player {

	private Scanner keyboard;
	
	public HumanPlayer(String name, Scanner keyboard) {
		super(name);
		this.keyboard = keyboard;
	}
	
	@Override
	public int[] getMove(int[] pileSizes) {
		System.out.println("Piles: " + Arrays.toString(pileSizes));
		int pileIdx = getUserInput("Enter pile index: ");
		int numObjects = getUserInput("Enter object number: ");
		return new int[] {pileIdx, numObjects};
	}

	public int getUserInput(String prompt)throws InputMismatchException {
		// TODO: Implement this method
		int input = -1;
		
		while(input == -1) {
		try {
		input = keyboard.nextInt();
		
		}catch(InputMismatchException e) {
			keyboard.nextLine();
			}
		System.out.print(prompt);
	}
		return input;
	}
	
	@Override
	public void notifyIllegalMove(String moveInfo) {
		System.out.println(moveInfo);
		System.out.println();
	}
	
	@Override
	public void notifyOpponentMove(String name, int[] move) {
		String notification = name + " removed " + move[1] + " from pile " 
				+ move[0] + ".";
		System.out.println(notification);
		System.out.println();
	}
	
	@Override
	public void notifyWin() {
		//TODO
		System.out.println("Nice job," + super.getName() + "." + "You win!");
	}
	
	@Override
	public void notifyLose() {
		//TODO
		System.out.println("Sorry," + super.getName() + "." + "You lose :(");
	}
}
