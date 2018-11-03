import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {

	
	
	public static void main(String[] args) {
		
		World w = new World();
		w.show();
		
		Bug b = new Bug();
		
		Flower f = new Flower();
		
		Location l = new Location(5,5);
		Location l2 = new Location(3,5);
		
		w.add(l, b);
		w.add(l2, f);
	}
	
}
