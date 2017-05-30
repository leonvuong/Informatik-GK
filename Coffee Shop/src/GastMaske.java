import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class GastMaske extends JFrame {
	
	//+++ Variablen +++
	
		public Integer kaffeart;
		public Integer milchart;
		public Integer becherart;
		public Integer groeﬂe;
		public Integer zuckerart;
		public Integer extrasart;
	
		List <Getraenke> aktuelleBestellung = new ArrayList<Getraenke>();
	
		public HashMap<Date,Set<Getraenke>> tagesBestellung = new HashMap<>();
		public HashMap<Date,HashMap<String,Integer>> zeitMaterialien = new HashMap<>();
	
	//+++GUI+++
	
	private JPanel contentPane;
	private JLabel lblWilkommenBeiStarbacks;
	private JLabel lblBeschreibung;
	private JLabel lblKaffeart;
	private JRadioButton rdbtnSchwarzerKaffe;
	private JRadioButton rdbtnMilchkaffe;
	private JRadioButton rdbtnCappucino;
	private JLabel lblMilchsorte;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnSojaMilch;
	private JLabel lblGroeﬂe;
	private JRadioButton rdbtnS;
	private JRadioButton rdbtnM;
	private JRadioButton rdbtnL;
	private JRadioButton rdbtnXl;
	private JLabel lblZucker;
	private JRadioButton rdbtnKeinZucker;
	private JRadioButton rdbtnWeierZucker;
	private JRadioButton rdbtnBraunerZucker;
	private JRadioButton rdbtnStevia;
	private JLabel lblExtras;
	private JCheckBox chckbxExtraKaramel;
	private JCheckBox chckbxExtraMilch;
	private JCheckBox chckbxExtraZucker;
	private JButton btnBestellungAufgeben;
	private JButton btnBestellungLoeschen;
	private JLabel lblIhreBestellung;
	protected final static ButtonGroup kaffeartButtonGroup= new ButtonGroup();
	private final ButtonGroup milchButtonGroup = new ButtonGroup();
	private JRadioButton rdbtnKeineMilch;
	private final ButtonGroup groeﬂeButtonGroup = new ButtonGroup();
	private final ButtonGroup zuckerButtonGroup = new ButtonGroup();
	private JButton btnKaffeBesttigen;
	private JCheckBox chckbxSahne;
	private JLabel lblVerpackung;
	private JRadioButton rdbtnPapier;
	private JRadioButton rdbtnPlasticbecher;
	private JRadioButton rdbtnEspresso;
	private final ButtonGroup verpackungButtonGroup = new ButtonGroup();
	private JRadioButton rdbtnEiskaffe;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblIhrName;
	private JLabel lblIhreKartennummeroptional;
	private JRadioButton rdbtnSstoff;
	private JRadioButton rdbtnKakao;
	private JTextArea textAreaAusgabeFeld;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GastMaske frame = new GastMaske();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GastMaske() {
		setBackground(new Color(240, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 963);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[284px,grow][][142px,grow]", "[14px][14px][][][23px][23px][23px][][][][][23px][23px][23px][][5.00][][][][23px][23px][23px][23px][][23px][23px][23px][23px][][][][23px][23px][23px][][][44px][][grow][][][]"));
		
		lblWilkommenBeiStarbacks = new JLabel("WILKOMMEN BEI STARBACKS");
		contentPane.add(lblWilkommenBeiStarbacks, "cell 0 0,alignx right,aligny top");
		
		lblBeschreibung = new JLabel("Erstellen Sie mit dem Coffee-Maker Ihren pers\u00F6nlichen Kaffee :");
		contentPane.add(lblBeschreibung, "cell 0 1,growx,aligny top");
		
		lblIhrName = new JLabel("Ihr Name:");
		contentPane.add(lblIhrName, "cell 0 2");
		
		lblIhreKartennummeroptional = new JLabel("Ihre Kartennummer (optional):");
		contentPane.add(lblIhreKartennummeroptional, "cell 2 2");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 0 3,growx");
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 2 3,growx");
		textField_1.setColumns(10);
		
		lblKaffeart = new JLabel("Kaffeart:");
		contentPane.add(lblKaffeart, "cell 0 4,growx,aligny center");
		
		rdbtnSchwarzerKaffe = new JRadioButton("schwarzer Kaffe");
		rdbtnSchwarzerKaffe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kaffeart = 0;
			}
		});
		kaffeartButtonGroup.add(rdbtnSchwarzerKaffe);
		contentPane.add(rdbtnSchwarzerKaffe, "cell 2 4,growx,aligny top");
		
		rdbtnMilchkaffe = new JRadioButton("Milchkaffe");
		rdbtnMilchkaffe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kaffeart = 1;
			}
		});
		kaffeartButtonGroup.add(rdbtnMilchkaffe);
		contentPane.add(rdbtnMilchkaffe, "cell 2 5,growx,aligny top");
		
		rdbtnCappucino = new JRadioButton("Cappucino");
		rdbtnCappucino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kaffeart = 2;
			}
		});
		kaffeartButtonGroup.add(rdbtnCappucino);
		contentPane.add(rdbtnCappucino, "cell 2 6,growx,aligny top");
		
		rdbtnEspresso = new JRadioButton("Espresso");
		rdbtnEspresso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kaffeart = 3;
			}
		});
		kaffeartButtonGroup.add(rdbtnEspresso);
		contentPane.add(rdbtnEspresso, "cell 2 7");
		
		rdbtnEiskaffe = new JRadioButton("Eiskaffe");
		rdbtnEiskaffe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kaffeart = 4;
			}
		});
		kaffeartButtonGroup.add(rdbtnEiskaffe);
		contentPane.add(rdbtnEiskaffe, "cell 2 8");
		
		rdbtnKakao = new JRadioButton("Kakao");
		rdbtnKakao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kaffeart = 5;
			}
		});
		kaffeartButtonGroup.add(rdbtnKakao);
		contentPane.add(rdbtnKakao, "cell 2 9");
		
		lblMilchsorte = new JLabel("Milchsorte:");
		contentPane.add(lblMilchsorte, "cell 0 11,growx,aligny center");
		
		rdbtnNewRadioButton = new JRadioButton("Vollmilch");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				milchart = 0;
			}
		});
		milchButtonGroup.add(rdbtnNewRadioButton);
		contentPane.add(rdbtnNewRadioButton, "cell 2 11,growx,aligny top");
		
		rdbtnNewRadioButton_1 = new JRadioButton("Fettarme Milch (1,5%)");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				milchart = 1;
			}
		});
		milchButtonGroup.add(rdbtnNewRadioButton_1);
		contentPane.add(rdbtnNewRadioButton_1, "cell 2 12,growx,aligny top");
		
		rdbtnSojaMilch = new JRadioButton("Soja Milch");
		rdbtnSojaMilch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				milchart = 2;
			}
		});
		milchButtonGroup.add(rdbtnSojaMilch);
		contentPane.add(rdbtnSojaMilch, "cell 2 13,growx,aligny top");
		
		rdbtnKeineMilch = new JRadioButton("keine Milch");
		rdbtnKeineMilch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				milchart = 3;
			}
		});
		milchButtonGroup.add(rdbtnKeineMilch);
		contentPane.add(rdbtnKeineMilch, "cell 2 14");
		
		lblVerpackung = new JLabel("Verpackung:");
		contentPane.add(lblVerpackung, "cell 0 16");
		
		rdbtnPapier = new JRadioButton("Pappbecher");
		rdbtnPapier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				becherart = 0;
			}
		});
		verpackungButtonGroup.add(rdbtnPapier);
		contentPane.add(rdbtnPapier, "cell 2 16");
		
		rdbtnPlasticbecher = new JRadioButton("Plastikbecher");
		rdbtnPlasticbecher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				becherart = 2;
			}
		});
		verpackungButtonGroup.add(rdbtnPlasticbecher);
		contentPane.add(rdbtnPlasticbecher, "cell 2 17");
		
		lblGroeﬂe = new JLabel("Gr\u00F6\u00DFe:");
		contentPane.add(lblGroeﬂe, "cell 0 19,growx,aligny center");
		
		rdbtnS = new JRadioButton("S");
		rdbtnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				groeﬂe = 0;
			}
		});
		groeﬂeButtonGroup.add(rdbtnS);
		contentPane.add(rdbtnS, "cell 2 19,growx,aligny top");
		
		rdbtnM = new JRadioButton("M");
		rdbtnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				groeﬂe = 1;
			}
		});
		groeﬂeButtonGroup.add(rdbtnM);
		contentPane.add(rdbtnM, "cell 2 20,growx,aligny top");
		
		rdbtnL = new JRadioButton("L");
		rdbtnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				groeﬂe = 2;
			}
		});
		groeﬂeButtonGroup.add(rdbtnL);
		contentPane.add(rdbtnL, "cell 2 21,growx,aligny top");
		
		rdbtnXl = new JRadioButton("XL");
		rdbtnXl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				groeﬂe = 3;
			}
		});
		groeﬂeButtonGroup.add(rdbtnXl);
		contentPane.add(rdbtnXl, "cell 2 22,growx,aligny top");
		
		lblZucker = new JLabel("Zucker:");
		contentPane.add(lblZucker, "cell 0 24,growx,aligny center");
		
		rdbtnKeinZucker = new JRadioButton("kein Zucker");
		rdbtnKeinZucker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zuckerart = 0;
			}
		});
		zuckerButtonGroup.add(rdbtnKeinZucker);
		contentPane.add(rdbtnKeinZucker, "cell 2 24,growx,aligny top");
		
		rdbtnWeierZucker = new JRadioButton("wei\u00DFer Zucker");
		rdbtnWeierZucker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zuckerart = 1;
			}
		});
		zuckerButtonGroup.add(rdbtnWeierZucker);
		contentPane.add(rdbtnWeierZucker, "cell 2 25,growx,aligny top");
		
		rdbtnBraunerZucker = new JRadioButton("brauner Zucker");
		rdbtnBraunerZucker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zuckerart = 2;
			}
		});
		zuckerButtonGroup.add(rdbtnBraunerZucker);
		contentPane.add(rdbtnBraunerZucker, "cell 2 26,growx,aligny top");
		
		rdbtnStevia = new JRadioButton("Stevia");
		rdbtnStevia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zuckerart = 3;
			}
		});
		zuckerButtonGroup.add(rdbtnStevia);
		contentPane.add(rdbtnStevia, "cell 2 27,growx,aligny top");
		
		rdbtnSstoff = new JRadioButton("S\u00FC\u00DFstoff");
		rdbtnSstoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zuckerart = 4;
			}
		});
		zuckerButtonGroup.add(rdbtnSstoff);
		contentPane.add(rdbtnSstoff, "cell 2 28");
		
		lblExtras = new JLabel("Extras");
		contentPane.add(lblExtras, "cell 0 31,growx,aligny center");
		
		chckbxExtraKaramel = new JCheckBox("extra Karamel");
		chckbxExtraKaramel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				extrasart = 0;
			}
		});
		contentPane.add(chckbxExtraKaramel, "cell 2 31,growx,aligny top");
		
		chckbxExtraMilch = new JCheckBox("extra Milch");
		chckbxExtraMilch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				extrasart = 1;
			}
		});
		contentPane.add(chckbxExtraMilch, "cell 2 32,growx,aligny top");
		
		chckbxExtraZucker = new JCheckBox("extra Zucker");
		chckbxExtraZucker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				extrasart = 2;
			}
		});
		contentPane.add(chckbxExtraZucker, "cell 2 33,growx,aligny top");
		
		chckbxSahne = new JCheckBox("Sahne");
		chckbxSahne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				extrasart = 3;
			}
		});
		contentPane.add(chckbxSahne, "cell 2 34");
		
		lblIhreBestellung = new JLabel("Ihre Bestellung:");
		contentPane.add(lblIhreBestellung, "cell 0 36");
		
		btnKaffeBesttigen = new JButton("Kaffe best\u00E4tigen");
		btnKaffeBesttigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{	Getraenke getraenke = new Getraenke(kaffeart, milchart, becherart, groeﬂe, zuckerart);
				aktuelleBestellung.add(getraenke);
				textAreaAusgabeFeld.append(aktuelleBestellung.get(aktuelleBestellung.size()-1).kaffeartList.get(kaffeart) + aktuelleBestellung.get(aktuelleBestellung.size()-1).milchartList.get(milchart)+ aktuelleBestellung.get(aktuelleBestellung.size()-1).becherartList.get(becherart) + aktuelleBestellung.get(aktuelleBestellung.size()-1).groeﬂenList.get(groeﬂe) + aktuelleBestellung.get(aktuelleBestellung.size()-1).zuckerartList.get(zuckerart) + aktuelleBestellung.get(aktuelleBestellung.size()-1).extrasartList.get(extrasart));
			}
		});
		contentPane.add(btnKaffeBesttigen, "cell 2 36,growx");
		
		textAreaAusgabeFeld = new JTextArea();
		contentPane.add(textAreaAusgabeFeld, "cell 0 38 2 3,grow");
		
		btnBestellungLoeschen = new JButton("Bestellung l\u00F6schen");
		btnBestellungLoeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textAreaAusgabeFeld.setText(" ");
			}
		});
		contentPane.add(btnBestellungLoeschen, "cell 2 38,growx");
		
		btnBestellungAufgeben = new JButton("Bestellung aufgeben");
		contentPane.add(btnBestellungAufgeben, "cell 2 40 1 2,growx");
		
	}

}
