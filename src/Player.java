
public abstract class Player {
	public String roshamboChoice;
	private String name;

	public Player() {
	}

	public Player(String name) {
		this.name = name;
	}

	public abstract Roshambo generateRoshambo();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoshamboChoice() {
		return roshamboChoice;
	}

	public void setRoshamboChoice(String roshambo) {
		this.roshamboChoice = roshambo;
	}

}
