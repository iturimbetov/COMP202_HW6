public class Player {
	public int points;
	public int id;
	
	public Player(int id, int points) {
		this.id = id;
		this.points = points;
	}
	
	public String toString() {
		return "Player " + this.id + " with " + this.points + " points"; 
	}
}
