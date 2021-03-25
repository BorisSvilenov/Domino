package edu.school.problems;

public class DominoTile {
	private int left;
	private int right;
	
	final static int LEFT=0;
	final static int RIGHT=1;
	
	public DominoTile() {
		left=0;
		right=0;
	}
	public DominoTile(int leftValue, int rightValue) {
		if(leftValue>=0 && leftValue<=6) {
			left=leftValue;
		}
		if(rightValue>=0 && rightValue<=6) {
			right=rightValue;
		}
	}
	
	public int getLeft() {
		return left;
	}
	public int getRight() {
		return right;
	}
	public void swap() {
		int temp=left;
		left=right;
		right=temp;
	}
	public boolean equals(DominoTile d1) {
		boolean IsEqual=false;
		if(left==d1.getLeft() && right==d1.getRight()) {
			IsEqual=true;
		}
		if(left==d1.getRight() && right==d1.getLeft()){
			IsEqual=true;
		}
		return IsEqual;
	}
	
	public boolean isPossible(DominoTile tile , int side)
	{
		if(tile != null)
		{
			if(side == RIGHT)
			{
				if(this.right == tile.getLeft())
				{
					return true;
				}
				
				else if(this.right == tile.getRight())
				{
					tile.swap();
					return true;
				}
			}
			
			else if (side == LEFT)
			{
				if(this.left == tile.getRight())
				{
					return true;
				}
				else if(this.left == tile.getLeft())
				{
					tile.swap();
					return true;
				}
			}
		}
		
		return false;
	}
	public char[][] createDomino(int left, int right) {
		char  domino[][] = new char[3][6];
		if(left==0) {
			if(left==1) {
				domino[1][1]='*';
			}else {
				if(left==2) {
					domino[0][0]='*';
					domino[2][2]='*';
				}else {
					if(left==3) {
						domino[0][0]='*';
						domino[2][2]='*';
						domino[1][1]='*';
					}else {
						if(left==4) {
							domino[0][0]='*';
							domino[2][2]='*';
							domino[0][2]='*';
							domino[2][0]='*';
						}else {
							if(left==5) {
								domino[0][0]='*';
								domino[2][2]='*';
								domino[0][2]='*';
								domino[2][0]='*';
								domino[1][1]='*';
							}else {
								domino[0][0]='*';
								domino[2][2]='*';
								domino[0][2]='*';
								domino[2][0]='*';
								domino[0][1]='*';
								domino[2][1]='*';
								
							}
						}
					}
				}
			}
			if(right==0) {
				if(right==1) {
					domino[1][4]='*';
				}else {
					if(right==2) {
						domino[0][3]='*';
						domino[2][5]='*';
					}else {
						if(right==3) {
							domino[0][3]='*';
							domino[2][5]='*';
							domino[1][4]='*';
						}else {
							if(right==4) {
								domino[0][3]='*';
								domino[2][5]='*';
								domino[0][5]='*';
								domino[2][5]='*';
							}else {
								if(right==5) {
									domino[0][3]='*';
									domino[2][5]='*';
									domino[0][5]='*';
									domino[2][5]='*';
									domino[1][4]='*';
								}else {
									domino[0][3]='*';
									domino[2][5]='*';
									domino[0][5]='*';
									domino[2][5]='*';
									domino[0][4]='*';
									domino[2][4]='*';
									
								}
							}
						}
					}
				}
			}
		}
		return domino;
	}
	public String toString() {
		char decimalCharArray[][]= createDomino(left,right);
		String printDomino="";
		
		for(int row=0;row<decimalCharArray.length;row++) {
			for(int column=0;column<decimalCharArray.length+3;column++) {
				printDomino+=decimalCharArray[row][column];
			}
			printDomino+="\n";
		}
		return printDomino;
	}
	

}
