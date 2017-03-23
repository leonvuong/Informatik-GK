import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;

public class Uebungsframe extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JButton btnMeinButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uebungsframe frame = new Uebungsframe();
					frame.setVisible(true);
					registriereListener();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Uebungsframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		btnMeinButton = new JButton("Mein Button");
		contentPane.add(btnMeinButton, BorderLayout.CENTER);
	}
	
	public static void registriereListener()
	{
		btnMeinButton.addActionListener(new ActionListener() {
				@Override			
				public void actionPerformed(ActionEvent e) {
					System.out.println("Button gedrueckt!"); //zum Zeichen das die Aktion ausgelöst wurde
					// Methodenaufruf einfügen;
					
				}
		}); 		
		
	}
	
	public static void eingabeFenster()
	{
		String name = JOptionPane.showInputDialog("Gib deinen Namen ein");
		String geburstag = JOptionPane.showInputDialog("Gib deinen Geburtstag ein");
		String email = JOptionPane.showInputDialog("Gib deine E-Mail Adresse ein");
 
		JOptionPane.showMessageDialog(null, "Name:" + name + "\n Geburtstag:"+ geburstag + "\n E-Mail:" + email);
	}
	}
