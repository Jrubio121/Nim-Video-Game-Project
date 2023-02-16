// Worked on this class with Guillermo, Keeton, and John

import java.util.*;

public class RandomPlayer extends Player{

	private Random generator;

	public RandomPlayer(String name) {
	super(name);
	generator = new Random();
	}

	public int[] getMove(int[] pileSizes) {
		int[] move = {0,0};
		move[0] = generator.nextInt(pileSizes.length);
		while(pileSizes[move[0]] == 0) {
			move[0] = generator.nextInt(pileSizes.length);
			
		}
		while(move[1] == 0) {
			move[1] = generator.nextInt(pileSizes[move[0]]+ 1);
		}
		return move;
	}

	public void notifyWin() {
	
	}

	public void notifyLose() {
	
	}


}
