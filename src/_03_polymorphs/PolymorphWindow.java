package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;
	ArrayList<Polymorph> polies = new ArrayList<Polymorph>();

	Polymorph bluePoly;
	Polymorph followPoly;
	Polymorph circlePoly;
	Polymorph imagePoly;
	Polymorph buttonMorph;
	Rectangle ButtonMorphHitbox;
	public static BufferedImage img;

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		try {
			img = ImageIO.read(this.getClass().getResourceAsStream("img.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.addMouseListener(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

		bluePoly = new BluePolymorph(50, 50, 55, 55);
		followPoly = new FollowMorph(0, 0, 55, 55);
		circlePoly = new CircleMorph(50, 50, 55, 55);
		imagePoly = new ImageMorph(100, 100, 100, 100, img);
		buttonMorph = new ButtonMorph(150, 150, 55, 55);
		ButtonMorphHitbox = new Rectangle(buttonMorph.getX(), buttonMorph.getY(), buttonMorph.getWidth(),
				buttonMorph.getHeight());
		polies.add(bluePoly);
		polies.add(followPoly);
		polies.add(circlePoly);
		polies.add(imagePoly);
		polies.add(buttonMorph);

		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
		for (Polymorph p : polies) {
			p.draw(g);
			p.update();
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();

	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mouse coords: " + e.getLocationOnScreen().x + ", " + e.getLocationOnScreen().getY());
		if (ButtonMorphHitbox.contains(e.getLocationOnScreen().getX(), e.getLocationOnScreen().getY())) {
			System.out.println("click");
			JOptionPane.showMessageDialog(null, "Click!");
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}
}
