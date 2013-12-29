package needForSpeed;

import java.awt.Color;

public class Opponent extends Car{
	
	private Color color;

	public Opponent(int row, int col, CellManaging cm) {
		super(row, col, cm);
		// FIXME Auto-generated constructor stub
		color = color.RED;
	}
	
	public void moveVertical(Move move){
		if(move.getMovedCol() == 0){
			Move(move);
		}else{
			return;
		}
	}
	
	public void moveDownAuto(){
		Move(new Move(-1, 0));
	}
	
	public void drawItself(){
		draw(color);
	}
	
}
