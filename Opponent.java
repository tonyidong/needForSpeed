package needForSpeed;

public class Opponent extends Car{

	public Opponent(int row, int col, CellManaging cm) {
		super(row, col, cm);
		// FIXME Auto-generated constructor stub
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
}
