package praktikum1;

public class Player {
	
	private int direction, id, strength;
	
		public Player() {}
		
		public Player(int id, int direction) {
			this.id = id;
			this.direction = direction;
			
		}
		
		public void AddStrength(int strength) {
			this.strength = strength;
			
		}
		
		public void InfoPlayer() {
			System.out.println(" ID	: "+this.id+
	                " Direction : "+this.direction);
			
		}
		
	}
	

