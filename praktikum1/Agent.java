package praktikum1;

public class Agent {

	private int health, pos_x, pos_y;
	private String name;
	
		public Agent() {}
		
		public Agent(String name, int health) {
			this.name = name;
			this.health = health;
			
		}
		
		public void SetPos(int pos_x, int pos_y) {
			this.pos_x = pos_x;
			this.pos_y = pos_y;
			
		}
		
		public int GetPos() {
			System.out.println(" X : "+this.pos_x+
	                " Y : "+this.pos_y);
			return 0;
			
		}
		
		public void Info() {
			System.out.println(" Name : "+this.name+
	                " Health : "+this.health);
			
		}
		
	}
