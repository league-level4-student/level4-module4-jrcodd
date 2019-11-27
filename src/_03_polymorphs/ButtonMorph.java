package _03_polymorphs;

import java.awt.Graphics;
import java.awt.Rectangle;

public class ButtonMorph extends Polymorph {
Rectangle hitbox;
	public ButtonMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		hitbox = new Rectangle(x,y,width,height);

	}

	@Override
	public void draw(Graphics g) {
		g.fillRect(x, y, width, height);

	}
	

}
