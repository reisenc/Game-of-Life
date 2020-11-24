package game;

public abstract class Cell {
	protected int posX, posY;
	protected boolean isBorderCell = false;
	protected boolean alive = false;
	
	private static int[][] directions = {
			{-1, -1},	// top left
			{-1, 0},	// top center
			{-1, 1},	// top right
			{0, -1},	// left
			{0, 1},		// right
			{1, -1},	// bottom left
			{1, 0},		// bottom center
			{1, 1}		// bottom right
	};
	
	public int getPosX() {
		return posX;
	}
	
	public int getPosY() {
		return posY;
	}
	
	public void setPosX(int x) {
		this.posX = x;
	}
	
	public void setPosY(int y) {
		this.posY = y;
	}
	
	public void setPosition(int x, int y) {
		this.setPosX(x);
		this.setPosY(y);
	}
	
	public boolean isAlive() {
		return alive;
	}
	
	public void revive() {
		this.alive = true;
	}
	
	public void kill() {
		this.alive = false;
	}	
	
	
	public String printCell() {
		if(isBorderCell == true) {
			return "+";
		} else if(alive == true) {
			return "O";
		} else {
			return "X";
		}
	}
	
	public void makeBorderCell() {
		this.isBorderCell = true;
	}
	
	public int getLivingNeighbors(Field field, int xPos, int yPos) {
		int count = 0;		
		int xPointer, yPointer;	
		
		for(int i = 0; i < directions.length; i++) {
			xPointer = directions[i][0];
			yPointer = directions[i][1];
			
			int cellPosX = xPos + xPointer;
			int cellPosY = yPos + yPointer;
			
//			System.out.println("[+] Checking field["+cellPosX+"]["+cellPosY+"] ...");
//			System.out.println("[+] Cell at this position is alive: "+this.isAlive());
			
			if(!field.getField()[cellPosX][cellPosY].isBorderCell) {
				if(field.getField()[cellPosX][cellPosY].isAlive()) {
					count++;
//					System.out.println("[+] Found one living Neighbor. Current count is: "+count);
//					System.out.println();
				}
			}
			
		}
		
//		System.out.println();
//		System.out.println("[+] Operation finished for Cell["+xPos+"]["+yPos+"] ...\n[+] Neighbors alive: " + count);
		
		return count;
	}
}
