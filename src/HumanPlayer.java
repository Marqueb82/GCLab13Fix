
public class HumanPlayer extends Player {
	private String name;
	private String roshamboChoice;

	public HumanPlayer() {
	}

	public HumanPlayer(String name) {
		this.name = name;
	}

	@Override
	public Roshambo generateRoshambo() {

		if (roshamboChoice.equalsIgnoreCase("R")) {
			return Roshambo.ROCK;
		} else if (roshamboChoice.equalsIgnoreCase("P")) {
			return Roshambo.PAPER;
		} else
			return Roshambo.SCISSORS;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getRoshamboChoice() {
		return roshamboChoice;
	}

	@Override
	public void setRoshamboChoice(String roshamboChoice) {
		this.roshamboChoice = roshamboChoice;
	}

}
