import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Game extends JPanel implements ActionListener,KeyListener {
	static int frame = 0;
	int bodyCount=1;

	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		for(int i =0;i<bodyCount;i++){
			g.setColor(Color.ORANGE);
			g.fillOval((int)(Math.random()*800), (int)(Math.random()*600), 30, 30);
		}
	}

	public void actionPerformed(ActionEvent e) {
		frame++;
		repaint();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		bodyCount++;
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
