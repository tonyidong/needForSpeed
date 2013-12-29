package needForSpeed;

import java.awt.Color;
import java.util.LinkedList;

public class Arena implements Grid, CellManaging {
	private final LinkedList<Cell> available;
	private final int numRows;
	private final int numCols;
	private final LinkedList<Cell> forWall;
	
	
	
	/**
	 * Construct a game board with the specified rows and columns.
	 * Initialize a list of available Cells to include all Cells for this game board.
	 * @param numRows
	 * @param numCols
	 */
	public Arena(int numRows, int numCols) {
		super();
		this.available = new LinkedList<Cell>();
		this.forWall = new LinkedList<Cell>();
		this.numRows = numRows;
		this.numCols = numCols;
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				if((i == 0 || i == (numRows - 1) || (j == 0 || j == (numCols - 1)))){
					forWall.add(new Cell(i, j, this));
				}else{
					available.add(new Cell(i, j, this));
				}
//				available.add(new Cell(i, j, this));
			}
		}
		
	}
	
	public void draw(){
		for(Cell x: available){
			x.draw();
		}
		for(Cell x: forWall){
			x.drawFilled(Color.BLACK);
		}
	}
	
	@Override
	public boolean isOccupied(Cell cell) {
		// FIXME Auto-generated method stub
		if(this.available.contains(cell)){
			return false;
		}
		return true;
	}
	@Override
	public Cell allocateRandomOmitCell() {
		// FIXME Auto-generated method stub
		return available.remove((int)(Math.random()*(available.size())));
	}
	@Override
	public void dellocateCell(Cell cell) {
		// FIXME Auto-generated method stub
		available.add(cell);
		
	}
	@Override
	public boolean allocateCell(Cell cell) {
		// FIXME Auto-generated method stub
		if(this.available.contains(cell)){
			available.remove(cell);
			return true;
		}
		return false;
	}
	@Override
	public Cell allocateCell(int row, int col) {
		// FIXME Auto-generated method stub
		Cell newCell = new Cell(row, col, this);
		for(int i = 0; i < available.size(); i++){
			if(available.get(i).equals(newCell)){
				return available.remove(i);
			}
		}
		return null;
	}
	@Override
	public Point getCenter() {
		// FIXME Auto-generated method stub
		return new Point(0.5, 0.5);
	}
	@Override
	public double getHalfWidth() {
		// FIXME Auto-generated method stub
		return 0.5;
	}
	@Override
	public double getHalfHeight() {
		// FIXME Auto-generated method stub
		return 0.5;
	}
	@Override
	public int getRows() {
		// FIXME Auto-generated method stub
		return this.numRows;
	}
	@Override
	public int getCols() {
		// FIXME Auto-generated method stub
		return this.numCols;
	}
	
	

}
