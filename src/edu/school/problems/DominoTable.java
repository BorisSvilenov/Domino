package edu.school.problems;

public class DominoTable {
	private DominoTile[] dominoTable;
	private int left;
	private int right;
	private int tilesIndex=0;
	private final int Tiles=28;
	private TableEventListener listener;
	
	public DominoTable() {
		dominoTable=new DominoTile[Tiles];
	}
	public void setTiles(int tilesValue) {
		if(tilesValue>=0 && tilesValue<=28) {
			tilesIndex=tilesValue;
		}
		
	}
	public boolean addLeft(DominoTile d1) {
		boolean result=false;
		
		if(tilesIndex==Tiles-1) {
			return result;
		} else {
			for(int i=1;i<tilesIndex-1;i++) {
				DominoTile temp=dominoTable[i+1];
				dominoTable[i+1]=dominoTable[i];
				dominoTable[i]=temp;
			}
			dominoTable[0]=d1;
			tilesIndex++;
			if(d1.equals(dominoTable[1])==true) {
				result=true;
			}else {
				result=false;
			}
		}
		
		return result;
	}
	public boolean addRight(DominoTile d1) {
		boolean result=false;
		
		if(tilesIndex==Tiles-1) {
			return result;
		} else {
			for(int i=tilesIndex;i>1;i--) {
				DominoTile temp=dominoTable[i-1];
				dominoTable[i-1]=dominoTable[i];
				dominoTable[i]=temp;
			}
			dominoTable[0]=d1;
			tilesIndex++;
			if(d1.equals(dominoTable[1])==true) {
				result=true;
			}else {
				result=false;
			}
		}
		
		return result;
	}
	public void print() {
		for(int i=0;i<Tiles;i++) {
			if(dominoTable[i]!=null) {
			System.out.println(dominoTable[i].toString());
			}else {
				break;
			}
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
