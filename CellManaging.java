package needForSpeed;

public interface CellManaging {
	
	
	/**
	 * Determine if a specific cell is occupied.
	 * @param cell
	 * @return true if the cell is occupied, false if it is not.
	 */
	public boolean isOccupied(Cell cell);
	
	
	/**
	 * Allocate a random cell on the top that can be used to omit an opponent car
	 * @return The allocated Cell
	 */
	public Cell allocateRandomOmitCell();
	
	
	/**
	 * De Alocate the cell that is passed in
	 * @param cell
	 */
	public void dellocateCell(Cell cell);
	
	/**
	 * Allocate a specific cell.
	 * @param cell: The cell the user want to allocate
	 * @return if it is occupied, return false, else return true
	 */
	public boolean allocateCell(Cell cell);
	
	
	/**
	 * Allocate a cell using specific row and col
	 * @param row
	 * @param col
	 * @return The cell that wants to allocate.
	 */
	public Cell allocateCell(int row, int col);
	

}
