import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

public class HW5 {
    
	public static void printPlayersById(PriorityQueue<Player> queue) {
		Player[] copy = queue.toArray(new Player[queue.size()]);
		Arrays.sort(copy, new Comparator<Player>() {
			@Override
			public int compare(Player p1, Player p2) {
				return p1.id - p2.id;
			}
		});
		for (Player player : copy) {
			System.out.println(player);
		}
	}
	
	/* num_players = number of players
	 * portion = portion of points passed from the player with the most points to the one with the least
	 * min_points = minimum of the initital points range
	 * max_points = max of the initial points range
	 * rounds = number of rounds to play 
	 */
	public static void playGame(int num_players, double portion, int min_points, int max_points, int rounds, int seed) {
		Random rand = new Random(seed);

		// your code goes here

		printPlayersById(maxHeap);
    	}

	public static void main(String[] args) {
        	playGame(5, 0.3, 0, 100, 4, 15);
	}

}
