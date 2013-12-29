package needForSpeed;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

public class Car {
	
	private int cRow, cCol;
	private final List<Cell> segments;
	private final CellManaging cm;
	
	public Car(int row, int col, CellManaging cm){
		this.cm = cm;
		this.cRow = row;
		this.cCol = col;
		this.segments = new LinkedList<Cell>();
		for(int r = row-1; r <= row+2; r++){
			for(int c = col-1; c <= col+1; c++){
				if(c == col || (r == row+1 && c == col-1) || (r == row+1 && c == col+1) || (r == row-1 && c == col-1) || (r == row-1 && c == col+1)){
					segments.add(cm.allocateCell(r, c));
				}
			}
		}
	}
	
	public void Move(Move move){
		segments.clear();
		System.out.println("Successfully cleared");
		System.out.println("Before using Move: " + cRow + ", " + cCol);
		this.cRow += move.getMovedRow();
		this.cCol += move.getMovedCol();
		System.out.println("After using Move: " + cRow + ", " + cCol);
		for(int r = cRow-1; r <= cRow+2; r++){
			for(int c = cCol-1; c <= cCol+1; c++){
				if(c == cCol || (r == cRow+1 && c == cCol-1) || (r == cRow+1 && c == cCol+1) || (r == cRow-1 && c == cCol-1) || (r == cRow-1 && c == cCol+1)){
					segments.add(cm.allocateCell(r, c));
				}
			}
		}
		System.out.println("Successfully out of loop");
	}
	
	
	public boolean Collide(Car that){
		for(Cell x: this.segments){
			for(Cell y: that.segments){
				if (x.equals(y)){
					return true;
				}
			}
		}
		return false;
	}
	
	public void draw(Color color){
		for(Cell x: segments){
			System.out.println("?");
			x.drawFilled(color);
		}
	}
	

}
