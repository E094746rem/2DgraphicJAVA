import javax.swing.JFrame;

public class Myframe extends JFrame {

	MyPanel panel;

	Myframe() {

		panel = new MyPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
