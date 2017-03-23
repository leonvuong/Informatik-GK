import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LeonsFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeonsFrame frame = new LeonsFrame();
		frame.setVisible(true);
	}

	
	
	public LeonsFrame()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		
		JLabel lblMeinText = new JLabel("Warum ist das hier grau?");
		contentPane.add(lblMeinText, BorderLayout.NORTH);
		
		
	}
}
