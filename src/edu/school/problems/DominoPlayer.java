package edu.school.problems;

public class DominoPlayer {
	private String nickname;
	private Deck<DominoTile> tiles;
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
	public void setTiles(Deck<DominoTile> tiles) {
		this.tiles=tiles;
	}
	public Deck<DominoTile> getDominoTiles() {
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
	
	public DominoPlayer(String nickname,Deck<DominoTile> tiles, int tilesInHands,DominoTable table) {
		setNickname(nickname);
		setTiles(tiles);
		setTilesInHands(tilesInHands);
	    setTable(table);
	}
	
	public void addTileAtLeft(DominoTile t) {
		table.addLeft(t);
		
   }
    public void addTileAtRight(DominoTile t) {
	    
   }
	

} 
