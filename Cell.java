package needForSpeed;

import java.awt.Color;

import sedgewick.StdDraw;

public class Cell {
	private final int row;
	private final int col;
	private Grid grid;
	
	public Cell(int row, int col, Grid grid) {
		super();
		this.row = row;
		this.col = col;
		this.grid = grid;
	}
	
	/**
	 * Is this cell adjacent to the other cell
	 * @param other
	 * @return
	 */
	public boolean adjacentTo(Cell other) {
		if((Math.abs(other.getCol() - this.getCol()) == 1 && Math.abs(other.getRow() - this.getRow()) == 0) ||
				(Math.abs(other.getCol() - this.getCol()) == 0 && Math.abs(other.getRow() - this.getRow()) == 1)){
			return true; 
		}
		else
			return false;  // FIXME
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}
	
	public void draw(){
		StdDraw.setPenColor(StdDraw.BLACK);
		double halfWidth = (grid.getHalfWidth()/grid.getCols()); 
		double halfHeight = (grid.getHalfHeight()/grid.getRows());
		double x = this.getCol()*(2*grid.getHalfWidth()/grid.getCols()) + halfWidth; 
		double y = this.getRow()*(2*grid.getHalfHeight()/grid.getRows()) + halfHeight; 
		StdDraw.rectangle(x, y, halfWidth, halfHeight);
	}
	
	public void draw(Color color){
		StdDraw.setPenColor(color); 
		double halfWidth = (grid.getHalfWidth()/grid.getCols()); 
		double halfHeight = (grid.getHalfHeight()/grid.getRows());
		double x = this.getCol()*(2*grid.getHalfWidth()/grid.getCols()) + halfWidth; 
		double y = this.getRow()*(2*grid.getHalfHeight()/grid.getRows()) + halfHeight; 
		StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
	}
	

}