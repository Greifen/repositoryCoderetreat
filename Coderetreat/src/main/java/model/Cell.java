package model;

public class Cell {

	private boolean state;
	private int neighbours;

	
	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public Cell(boolean state, int neighbours) {
		super();
		this.state = state;
		this.neighbours = neighbours;
	}

	public boolean iterate()
	{
		if(neighbours<2 || neighbours>3)
		{
			state=false;
			return false;
		}
		else {
			
			state=true;
			return true;
		}

	}
	
}
