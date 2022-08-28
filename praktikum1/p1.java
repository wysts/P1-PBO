package praktikum1;

public class p1 {

	public static void main(String[] args) {
		
		Agent agent001 = new Agent();
		Agent agent002 = new Agent("Bond", 2);
		Player p1 = new Player(1, 45);
		Player p2 = new Player(2, 90);
		
		agent001.Info();
		agent002.Info();
		p1.InfoPlayer();
		p2.InfoPlayer();

	}

}
