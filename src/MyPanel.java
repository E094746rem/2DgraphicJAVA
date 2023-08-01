import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

	Image image;

	MyPanel() {
		image = new ImageIcon("src/fun.png").getImage();
		this.setPreferredSize(new Dimension(500, 500));

	}

	public void paint(Graphics g) {

		Graphics2D g2D = (Graphics2D) g;

		g2D.drawImage(image, 0, 0, null);

//		g2D.setPaint(Color.blue);
//		g2D.setStroke(new BasicStroke(5));// this will set the thickness
//		g2D.drawLine(0, 0, 500, 500);// this is to draw a line in the plane

		g2D.setPaint(Color.PINK);
//		g2D.drawRect(10, 10, 100, 200);
//		g2D.drawRect(0, 0, 150, 70);

//		g2D.fill3DRect(20, 20, 100, 120, getFocusTraversalKeysEnabled());

//		g2D.setPaint(Color.orange);
//		g2D.drawOval(125, 27, 50, 50);
//		g2D.fillOval(125, 36, 50, 50);
//		g2D.fillOval(227, 38, 50, 50);
//
//		g2D.drawArc(150, 70, 100, 100, 180, 0);
//		g2D.fillArc(150, 70, 100, 100, 0, 180);
//
//		g2D.setPaint(Color.BLACK);
//		g2D.fillArc(170, 100, 17, 15, 0, 180);
//		g2D.setPaint(Color.white);
//		g2D.fillArc(174, 103, 8, 9, 0, 180);
//
//		g2D.setPaint(Color.BLACK);
//		g2D.fillArc(215, 100, 17, 15, 0, 180);
//		g2D.setPaint(Color.white);
//		g2D.fillArc(218, 103, 8, 9, 0, 180);

		g2D.setPaint(Color.red);
		g2D.fillArc(0, 0, 100, 100, 0, 180);

		g2D.setPaint(Color.white);
		g2D.fillArc(0, 0, 100, 100, 180, 180);

		int[] xPoint = { 150, 250, 350 };
		int[] yPoint = { 300, 150, 300 };
		g2D.setPaint(Color.yellow);
		g2D.setStroke(new BasicStroke(2));
//		g2D.drawPolygon(xPoint, yPoint, 3);
		g2D.fillPolygon(xPoint, yPoint, 3);

//		g2D.setPaint(Color.BLUE);
//		g2D.setFont(new Font("INK Free", Font.BOLD, 50));
//		g2D.drawString("U R A Winner! :D", 50, 50);

	}

}
