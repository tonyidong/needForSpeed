package needForSpeed;

import java.awt.Color;

public class Self extends Car{
	
	private boolean alive;
	private Color color;

	public Self(int row, int col, CellManaging cm) {
		super(row, col, cm);
		alive = true;
		color = color.BLUE;
		// FIXME Auto-generated constructor stub
	}
	
	public boolean isAlive(){
		return alive;
	}
	
	public void die(){
		this.alive = false;
	}
	
	public void moveHorizontal(Move move){
		if(move.getMovedRow() == 0){
			Move(move);
		}else{
			return;
		}
	}
	
	public void drawMyself(){
		draw(color);
	}
	
	

}
