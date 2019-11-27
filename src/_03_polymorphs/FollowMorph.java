package _03_polymorphs;

import java.awt.Graphics;
import java.awt.MouseInfo;

public class FollowMorph extends Polymorph {
	int x;
	int y;
	int width;
	int height;

	FollowMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw(Graphics g) {

		g.fillRect(MouseInfo.getPointerInfo().getLocation().x, MouseInfo.getPointerInfo().getLocation().y, width,
				height);

	}

	public void update() {

	}

}
