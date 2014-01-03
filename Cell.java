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
		double halfWidth = (grid.getHalfWidth()*0.6/grid.getCols()); 
		double halfHeight = (grid.getHalfHeight()/grid.getRows());
		double x = this.getCol()*(2*grid.getHalfWidth()*0.6/grid.getCols()) + halfWidth; 
		double y = this.getRow()*(2*grid.getHalfHeight()/grid.getRows()) + halfHeight; 
		StdDraw.rectangle(x, y, halfWidth, halfHeight);
	}
	
	public void drawFilled(Color color){
		StdDraw.setPenColor(color); 
		double halfWidth = (grid.getHalfWidth()*0.6/grid.getCols()); 
		double halfHeight = (grid.getHalfHeight()/grid.getRows());
		double x = this.getCol()*(2*grid.getHalfWidth()*0.6/grid.getCols()) + halfWidth; 
		double y = this.getRow()*(2*grid.getHalfHeight()/grid.getRows()) + halfHeight; 
		StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
	}
	
	public void drawFilledCircle(Color color){
		StdDraw.setPenColor(color); 
		double halfWidth = (grid.getHalfWidth()*0.6/grid.getCols()); 
		double halfHeight = (grid.getHalfHeight()/grid.getRows());
		double x = this.getCol()*(2*grid.getHalfWidth()*0.6/grid.getCols()) + halfWidth; 
		double y = this.getRow()*(2*grid.getHalfHeight()/grid.getRows()) + halfHeight; 
//		StdDraw.filledCircle(x, y, halfHeight*0.8);
		StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
	}
	
	public void drawFilledEllipse(Color color){
		StdDraw.setPenColor(color); 
		double halfWidth = (grid.getHalfWidth()*0.6/grid.getCols()); 
		double halfHeight = (grid.getHalfHeight()/grid.getRows());
		double x = this.getCol()*(2*grid.getHalfWidth()*0.6/grid.getCols()) + halfWidth; 
		double y = this.getRow()*(2*grid.getHalfHeight()/grid.getRows()) + halfHeight; 
		StdDraw.filledCircle(x, y-0.01, halfWidth*1.1);
//		StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
	}
	
	public void drawFilledTriangle(Color color){
		StdDraw.setPenColor(color); 
		double halfWidth = (grid.getHalfWidth()*0.6/grid.getCols()); 
		double halfHeight = (grid.getHalfHeight()/grid.getRows());
		double x = this.getCol()*(2*grid.getHalfWidth()*0.6/grid.getCols()) + halfWidth; 
		double y = this.getRow()*(2*grid.getHalfHeight()/grid.getRows()) + halfHeight; 
		StdDraw.filledCircle(x, y-0.01, halfWidth*1.1);
//		StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (col != other.col)
			return false;
		if (row != other.row)
			return false;
		return true;
	}

}
