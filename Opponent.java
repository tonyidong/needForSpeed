package needForSpeed;

import java.awt.Color;

public class Opponent extends Car{
	
	private Color color;

	public Opponent(int row, int col, CellManaging cm) {
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
	
	public void moveDownAuto(Arena arena){
		if(getcRow() <= 3){
			getSegments().clear();
			return;
		}
		Move(new Move(-1, 0), arena);
	}
	
	public void drawItself(){
		draw(Color.RED);
	}
	
}
