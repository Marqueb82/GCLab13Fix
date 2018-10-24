import java.util.Scanner;

public class RoshamboApp {

	Scanner scnr = new Scanner(System.in);
	HumanPlayer player = new HumanPlayer();
	RockPlayer rocky = new RockPlayer();
	CPUPlayer roboto = new CPUPlayer();
	String opponentPrompt = "Enter 1 for RockPlayer or 2 for CPU";
	String gameChoice = "R for rock, P for paper or S for scissors?:";
	String endGame = "Want to play again?(Y/N)";
	String enterName = "Hello player, Enter your name: ";

	/**
	 * @see program runs applicatiion
	 */
	public void playRockPaperScissors() {
		boolean keepPlaying = true;
		Player p = null;

		String name = RPSValidator.getStringMatchingRegex(scnr, enterName);
		player.setName(name);
		System.out.println("Thank you " + player.getName() + "\n");

		System.out.println("Which player do you want to play?");
		int versus = RPSValidator.getInt(scnr, opponentPrompt);
		if (versus == 1) {
			p = rocky;
		} else if (versus == 2) {
			p = roboto;
		}

		do {

			System.out.println("Lets play.....Ready");
			System.out.println(player.getName() + " what is your choice?");
			String choice = RPSValidator.getStringMatchingChoice(scnr, gameChoice);
			player.setRoshamboChoice(choice);
			for (int i = 3; i > 0; i--) {
				System.out.println("...." + i);
			}

			gameLogic(p);

			String continuePlay = RPSValidator.getEndGameChoice(scnr, endGame);
			if (continuePlay.equalsIgnoreCase("N")) {
				keepPlaying = false;
			}
		} while (keepPlaying);

		System.out.println("Thanks for playing");

		scnr.close();
	}

	/**
	 * @param p
	 * @see game logic for win or loss using strings
	 */
	private void gameLogic(Player p) {
		String playerOne = player.generateRoshambo().toString();
		System.out.println(player.getName() + " has " + playerOne);

		String opponent = p.generateRoshambo().toString();
		System.out.println("Opponent has " + opponent);

		if (playerOne.equals("ROCK") && opponent.equals("PAPER")) {
			System.out.println("You lose");
		} else if (playerOne.equals("PAPER") && opponent.equals("ROCK")) {
			System.out.println("You Win");
		} else if (playerOne.equals("ROCK") && opponent.equals("SCISSORS")) {
			System.out.println("You Win");
		} else if (playerOne.equals("SCISSORS") && opponent.equals("ROCK")) {
			System.out.println("You lose");
		} else if (playerOne.equals("PAPER") && opponent.equals("SCISSORS")) {
			System.out.println("You Lose");
		} else if (playerOne.equals("SCISSORS") && opponent.equals("PAPER")) {
			System.out.println("You Win");
		} else {
			System.out.println("Tie");
		}
	}

}
