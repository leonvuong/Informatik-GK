import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class RandomSpiel extends JFrame {

	private JPanel contentPane;
	private JButton btnStart;
	private JButton btnReset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RandomSpiel frame = new RandomSpiel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	static int zufallszahl;
	private JPasswordField pfspieler1Zahl;
	private JPasswordField pfspieler2Zahl;
	private JLabel lblRandomDas;
	private JLabel lblSpieler;
	private JLabel lblSpieler_1;
	private JLabel lblzufallszahlAusgabe;
	private JLabel lblgewinnerAnsage;

	/**
	 * Create the frame.
	 */
	public RandomSpiel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[244px,grow][][6px][243px,grow]", "[20px][20px][69px][23px][][]"));
		
		lblRandomDas = new JLabel("RANDOM - Das Spiel");
		contentPane.add(lblRandomDas, "cell 0 0 4 1,alignx center");
		
		lblSpieler = new JLabel("Spieler 1");
		contentPane.add(lblSpieler, "cell 0 1");
		
		btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				zufallszahlGenerieren();
				System.out.println(zufallszahl);
				lblzufallszahlAusgabe.setText("Die Zufallszahl lautet: " + zufallszahl);
				kontrolle();
				pfspieler1Zahl.setEchoChar((char)0);
				pfspieler2Zahl.setEchoChar((char)0);
			}
		});
		
		lblSpieler_1 = new JLabel("Spieler 2");
		contentPane.add(lblSpieler_1, "cell 3 1,alignx right");
		
		pfspieler1Zahl = new JPasswordField();
		contentPane.add(pfspieler1Zahl, "cell 0 2,growx");
		
		pfspieler2Zahl = new JPasswordField();
		contentPane.add(pfspieler2Zahl, "cell 3 2,growx");
		contentPane.add(btnStart, "cell 0 3,growx,aligny top");
		
		btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			
			}
		});
		contentPane.add(btnReset, "cell 3 3,growx,aligny top");
		
		lblzufallszahlAusgabe = new JLabel("Die Zufallszahl lautet: ");
		contentPane.add(lblzufallszahlAusgabe, "cell 0 5");
		
		lblgewinnerAnsage = new JLabel("Der Gewinner ist ");
		contentPane.add(lblgewinnerAnsage, "cell 3 5");
	}
	
	public static void zufallszahlGenerieren()
	{
		
	    zufallszahl = (int)(Math.random() * 1001); 
	    
	}

	
	
	
	public void kontrolle()
	{
	
		char[] zahlSpieler1 = pfspieler1Zahl.getPassword();
		char[] zahlSpieler2 = pfspieler2Zahl.getPassword();
		
		int spieler1Integer = Integer.parseInt(String.valueOf(zahlSpieler1));
		int spieler2Integer = Integer.parseInt(String.valueOf(zahlSpieler2));
		
		int spieler1Differenz = zufallszahl - spieler1Integer;
		int spieler2Differenz = zufallszahl - spieler2Integer;
		
		if(spieler1Differenz < spieler2Differenz)
		{
			lblgewinnerAnsage.setText("Der Gewinner ist Spieler 1");
		}else if(spieler2Differenz < spieler1Differenz)
		{
			lblgewinnerAnsage.setText("Der gewinner ist Spieler2");
		}
	}
}
