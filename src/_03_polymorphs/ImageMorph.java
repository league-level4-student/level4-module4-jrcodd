package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ImageMorph extends Polymorph{
BufferedImage img;
	ImageMorph(int x, int y, int width, int height, BufferedImage img) {
		super(x, y, width, height);
		this.img=img;
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(img, x, y, width, height, null);
		
	}

}
