package _03_polymorphs;

import java.awt.Graphics;

public class CircleMorph extends Polymorph {
	int x;
	int y;
	int width;
	int height;
	int i;
	CircleMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;

	}

	@Override
	public void draw(Graphics g) {
		
			g.fillRect(x, y, width, height);
		
	}

	public void update() {

		x +=  Math.cos(i)*100.0;
		y += Math.sin(i)*100.0;
		i++;
	}

}
