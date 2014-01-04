package needForSpeed;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

public class Car {

	private int cRow, cCol;
	private final List<Cell> segments;
	private final CellManaging cm;

	public Car(int row, int col, Arena arena){
		this.cm = arena;
		this.cRow = row;
		this.cCol = col;
		this.segments = new LinkedList<Cell>();
		getSegments().add(new Cell(cRow+2, cCol, arena));
		getSegments().add(new Cell(cRow+1, cCol-1, arena));
		getSegments().add(new Cell(cRow+1, cCol, arena));
		getSegments().add(new Cell(cRow+1, cCol+1, arena));
		getSegments().add(new Cell(cRow, cCol, arena));
		getSegments().add(new Cell(cRow-1, cCol-1, arena));
		getSegments().add(new Cell(cRow-1, cCol, arena));
		getSegments().add(new Cell(cRow-1, cCol+1, arena));
		/*for(int r = row-1; r <= row+2; r++){
			for(int c = col-1; c <= col+1; c++){
				if(c == col || (r == row+1 && c == col-1) || (r == row+1 && c == col+1) || (r == row-1 && c == col-1) || (r == row-1 && c == col+1)){
					getSegments().add(cm.allocateCell(r, c));
				}
			}
		}*/
	}

	//For the Streak


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (cCol != other.cCol)
			return false;
		if (cRow != other.cRow)
			return false;
		if (cm == null) {
			if (other.cm != null)
				return false;
		} else if (!cm.equals(other.cm))
			return false;
		if (segments == null) {
			if (other.segments != null)
				return false;
		} else if (!segments.equals(other.segments))
			return false;
		return true;
	}

	public void Move(Move move, Arena arena){
		getSegments().clear();
		//		System.out.println("Successfully cleared");
		//		System.out.println("Before using Move: " + cRow + ", " + cCol);
		this.cRow += move.getMovedRow();
		this.cCol += move.getMovedCol();
		//		System.out.println("After using Move: " + cRow + ", " + cCol);
		getSegments().add(new Cell(cRow+2, cCol, arena));
		getSegments().add(new Cell(cRow+1, cCol-1, arena));
		getSegments().add(new Cell(cRow+1, cCol, arena));
		getSegments().add(new Cell(cRow+1, cCol+1, arena));
		getSegments().add(new Cell(cRow, cCol, arena));
		getSegments().add(new Cell(cRow-1, cCol-1, arena));
		getSegments().add(new Cell(cRow-1, cCol, arena));
		getSegments().add(new Cell(cRow-1, cCol+1, arena));


		/*for(int r = cRow-1; r <= cRow+2; r++){
			for(int c = cCol-1; c <= cCol+1; c++){
				if(c == cCol || (r == cRow+1 && c == cCol-1) || (r == cRow+1 && c == cCol+1) || (r == cRow-1 && c == cCol-1) || (r == cRow-1 && c == cCol+1)){
					getSegments().add(cm.allocateCell(r, c));
				}
			}
		}*/
		//		System.out.println("Successfully out of loop");
	}


	public int getcRow() {
		return cRow;
	}

	public void setcRow(int cRow) {
		this.cRow = cRow;
	}

	public int getcCol() {
		return cCol;
	}

	public void setcCol(int cCol) {
		this.cCol = cCol;
	}

	public boolean Collide(Car that){
		for(Cell x: this.getSegments()){
			for(Cell y: that.getSegments()){
				if (x.equals(y)){
					return true;
				}
			}
		}
		return false;
	}

	public void draw(Color color, Color head){
		for(Cell x: getSegments()){
			//			System.out.println("?");
			if(x.getCol() == cCol && x.getRow() == cRow+2){
				x.drawFilledCircle(head);
			}else if(x.getCol() == cCol){
				x.drawFilledCircle(color);
			}
			
			else{
				x.drawFilledCircle(Color.DARK_GRAY);
			}
			//			System.out.println("!");
		}
		//		System.out.println("x");
	}

	public List<Cell> getSegments() {
		return segments;
	}


}
