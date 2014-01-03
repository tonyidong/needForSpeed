package needForSpeed;

import java.awt.Color;

public class Self extends Car{
	
	private boolean alive;
	private Color color;

	public Self(int row, int col, Arena cm) {
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
	
	public void moveHorizontal(Move move, Arena arena){
		if(move.getMovedRow() == 0){
			Move(move, arena);
		}else{
			return;
		}
	}
	
	public void drawMyself(){
		draw(Color.BLUE);
	}
	
	

}
