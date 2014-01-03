package needForSpeed;

import java.awt.Color;

public class Opponent extends Car{
	
	private Color color;

	public Opponent(int row, int col, Arena cm) {
		super(row, col, cm);
		// FIXME Auto-generated constructor stub
		color = color.RED;
	}
	
	public void moveVertical(Move move, Arena arena){
		if(move.getMovedCol() == 0){
			Move(move, arena);
		}else{
			return;
		}
	}
	
	/**
	 * if out of arena, return false, else return true
	 * @param arena
	 * @return
	 */
	
	public boolean moveDownAuto(Arena arena){
		if(getcRow() < 3){
			getSegments().clear();
			return false;
		}
		Move(new Move(-1, 0), arena);
		return true;
	}
	
	public void drawItself(){
		draw(Color.RED);
	}
	
}
