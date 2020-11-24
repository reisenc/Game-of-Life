package game;

public class BorderCell extends Cell { 

	public BorderCell(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		this.makeBorderCell();
	}
	
}
