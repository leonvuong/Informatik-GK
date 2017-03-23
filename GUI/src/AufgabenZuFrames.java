import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AufgabenZuFrames extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AufgabenZuFrames meinFrame = new AufgabenZuFrames("BeispielJFrame");
	}
	
	public AufgabenZuFrames(String name)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,200);
		setVisible(true);
		
		JButton button1 = new JButton("Mein Button");
		Container contentPane = meinFrame.getContentPane;
	}
	
}
