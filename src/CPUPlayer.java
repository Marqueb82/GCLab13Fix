import java.util.Random;

public class CPUPlayer extends Player {

	public CPUPlayer() {
	}

	@Override
	public Roshambo generateRoshambo() {
		Random rand = new Random();
		int n = rand.nextInt(3);

		if (n == 0) {
			return Roshambo.ROCK;
		} else if (n == 1) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCISSORS;
		}
	}

}
