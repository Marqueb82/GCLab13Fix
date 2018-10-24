
public class RockPlayer extends Player {

	public RockPlayer() {
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

	@Override
	public String toString() {
		return "RockPlayer chooses " + generateRoshambo();
	}

}
