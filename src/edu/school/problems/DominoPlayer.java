package edu.school.problems;

public class DominoPlayer {
	private String nickname;
	private DominoTile[] tiles;
	private int tilesInHands;
	private DominoTable table;
	
	public void setNickname(String nickname) {
		if(nickname!=null && !nickname.isEmpty()) {
			this.nickname=nickname;
		}
	}
	public String getNickname() {
		return this.nickname;
	}
	public void setTiles(DominoTile[] tiles) {
		this.tiles=tiles;
	}
	public DominoTile[] getDominoTiles() {
		return this.tiles;
	}
	public void setTilesInHands(int tilesInHands) {
       this.tilesInHands=tilesInHands;		
	}
	public int getTilesInHands() {
		return this.tilesInHands;
	}
	public void setTable(DominoTable table) {
		this.table=table;
	}
	public DominoTable getTable() {
		return this.table;
	}
	
	public DominoPlayer(String nickname,DominoTile[] tiles, int tilesInHands,DominoTable table) {
		setNickname(nickname);
		setTiles(tiles);
		setTilesInHands(tilesInHands);
	    setTable(table);
	}
	
	private int getTileIndex(DominoTile t) {
		for(int i=0;i<tiles.length && tiles[i]!=null;i++) {
			if(tiles[i]==t) {
				return i;
			}
		}
		return -1;
		
	}
	public void addTileAtLeft(DominoTile t) {
		if(getTileIndex(t)>0 && table.addLeft(t)) {
			tiles[getTileIndex(t)]=null;
			this.tilesInHands--;
		}
   }
    public void addTileAtRight(DominoTile t) {
	    if(getTileIndex(t)>0 && table.addRight(t)) {
		   tiles[getTileIndex(t)]=null;
		   this.tilesInHands--;
	    }
   }
	

} 
