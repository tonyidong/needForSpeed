package needForSpeed;

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
	@Override
	public boolean isOccupied(Cell cell) {
		// FIXME Auto-generated method stub
		return false;
	}
	@Override
	public Cell allocateRandomOmitCell() {
		// FIXME Auto-generated method stub
		return null;
	}
	@Override
	public void dellocateCell(Cell cell) {
		// FIXME Auto-generated method stub
		
	}
	@Override
	public boolean allocateCell(Cell cell) {
		// FIXME Auto-generated method stub
		return false;
	}
	@Override
	public Cell allocateCell(int row, int col) {
		// FIXME Auto-generated method stub
		return null;
	}
	@Override
	public Point getCenter() {
		// FIXME Auto-generated method stub
		return null;
	}
	@Override
	public double getHalfWidth() {
		// FIXME Auto-generated method stub
		return 0;
	}
	@Override
	public double getHalfHeight() {
		// FIXME Auto-generated method stub
		return 0;
	}
	@Override
	public int getRows() {
		// FIXME Auto-generated method stub
		return 0;
	}
	@Override
	public int getCols() {
		// FIXME Auto-generated method stub
		return 0;
	}
	
	

}
