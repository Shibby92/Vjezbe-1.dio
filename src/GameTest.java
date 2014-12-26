import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GameTest{

	public static void main(String[] args) {
		JFrame window = new JFrame("Igrica");
		Game panel = new Game();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setContentPane(panel);
		window.setVisible(true);
		panel.addKeyListener(panel);
		panel.requestFocus(false);
		Timer timer = new Timer(10, panel);
		timer.start();

	}

}
