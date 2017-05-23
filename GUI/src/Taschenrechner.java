import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Taschenrechner extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taschenrechner rechnerFrame = new Taschenrechner();
		rechnerFrame.setVisible(true);
	}
	
	public Taschenrechner()
	{
		
		setBounds(30,30,300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout raster = new GridLayout (4,5);
		Container content = getContentPane();
		content.setLayout(raster);
		setVisible(true);
		
		JButton button = null;
	    content.add(button = new JButton("1"));
	    content.add(button = new JButton("2"));
	    content.add(button = new JButton("3"));
	    content.add(button = new JButton("+"));
	    content.add(button = new JButton("4"));
	    content.add(button = new JButton("5"));
	    content.add(button = new JButton("6"));
	    content.add(button = new JButton("-"));
	    content.add(button = new JButton("8"));
	    content.add(button = new JButton("9"));
	    content.add(button = new JButton("0"));
	    content.add(button = new JButton("*"));
	    content.add(button = new JButton(":"));
	    content.add(button = new JButton("="));
	    
	    pack();
	    
	}
}
