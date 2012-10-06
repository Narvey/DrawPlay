import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Hydra {
	private static final int BODY_WIDTH = 5;
	private static final int BODY_HEIGHT = 10;
	private static final int CNIDA = 4; //number of cnida (tentacles)
	private static final int CNIDA_LENGTH = 4; //length of cnida (tentacles)
	public void draw(Graphics g, int hX, int hY)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.blue);//I'm not sure what color they really are, but I always think of hydra as blue.
		g2.fillRect(hX, hY, BODY_WIDTH, BODY_HEIGHT);
		int cnidx = hX-3*CNIDA;
		for(int i=0; i<CNIDA; i++){
			g2.drawLine(hX, hY, cnidx, hY+CNIDA_LENGTH);
			cnidx += 6;
		}
	}
}
