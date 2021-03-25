package edu.school.problems;

public class DominoTable {
	private Deck<DominoTile> dominoTable;
	private int tilesIndex=0;
	private final int Tiles=28;
	private TableEventListener listener;
	final static int LEFT=0;
	final static int RIGHT=1;
	
	public DominoTable() {
		dominoTable=new Deck<>();
	}
	public void setTiles(int tilesValue) {
		if(tilesValue>=0 && tilesValue<=28) {
			tilesIndex=tilesValue;
		}
		
	}
	public Deck<DominoTile> getDominoTile()
	{
		return this.dominoTable;
	}
	public boolean addLeft(DominoTile d1) {
		
		if(tilesIndex==Tiles-1) {
			return false;
		} 
		else if(dominoTable.isEmpty()) 
		{
			dominoTable.addLeft(d1);
			return true;
		}
		else if(dominoTable.getLeft().isPossible(d1, LEFT) == true) 
		{
			dominoTable.addLeft(d1);
			ChangeListener();
			return true;
		}
		return false;
	}
	public boolean addRight(DominoTile d1) {
		if(tilesIndex==Tiles-1) {
			return false;
		} 
		else if(dominoTable.isEmpty()) 
		{
			dominoTable.addRight(d1);
			return true;
		}
		else if(dominoTable.getLeft().isPossible(d1, RIGHT) == true) 
		{
			dominoTable.addRight(d1);
			ChangeListener();
			return true;
		}
		return false;
	}
	public void print() {
		Iterator<DominoTile> it = dominoTable.getIterator();
		
		while(it.hasNext())
		{
			DominoTile t = it.next();
			System.out.print(t.toString());
		}
	}
	
	public void addTableEventListener(TableEventListener listener) {
		if(listener!=null) {
			this.listener=listener;
		}
		
	}
	public void ChangeListener() {
		if(listener!=null) {
			listener.onTableChanged(this);
		}
	}
	
	
	
	
}
