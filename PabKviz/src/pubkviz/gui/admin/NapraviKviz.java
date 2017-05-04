package pubkviz.gui.admin;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pubkviz.gui.GUIKontroler;

import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.Dialog.ModalityType;
import java.awt.Dialog.ModalExclusionType;

public class NapraviKviz extends JDialog {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnUnesiPitanje;
	private JButton btnObrisiPitanje;
	private JButton btnSacuvajTest;
	private JButton btnIzadji;
	private JPanel panel_1;
	private JProgressBar progressBar;
	private JPanel panel_2;
	private JLabel lblNazivKviza;
	private JTextField txtNazivKviza;
	private JButton btnIzmeniPitanje;
	private JButton btnPogledajKviz;



	/**
	 * Create the frame.
	 */
	public NapraviKviz() {
		setModal(true);
		setTitle("Napravi kviz");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel(){
	        @Override
	        protected void paintComponent(Graphics grphcs) {
	            super.paintComponent(grphcs);
	            Graphics2D g2d = (Graphics2D) grphcs;
	            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	                    RenderingHints.VALUE_ANTIALIAS_ON);
	            GradientPaint gp = new GradientPaint(0, 340,
						getBackground().brighter().brighter(), 2000, getHeight(),
	                    getBackground().darker());
	            g2d.setPaint(gp);
	            g2d.fillRect( 0,0,getWidth(),  getHeight()); 

	        }

	    };
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.WEST);
		contentPane.add(getPanel_2(), BorderLayout.CENTER);
	}

	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(255, 255, 255, 155));
			panel.setPreferredSize(new Dimension(125, 0));
			panel.add(getBtnUnesiPitanje());
			panel.add(getBtnIzmeniPitanje());
			panel.add(getBtnObrisiPitanje());
			panel.add(getBtnPogledajKviz());
		}
		return panel;
	}
	public JButton getBtnUnesiPitanje() {
		if (btnUnesiPitanje == null) {
			btnUnesiPitanje = new JButton("Unesi pitanje");
			btnUnesiPitanje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.unosPitanja();
				}
			});
			btnUnesiPitanje.setPreferredSize(new Dimension(125, 25));
			btnUnesiPitanje.setFont(new Font("Verdana", Font.BOLD, 11));
			btnUnesiPitanje.setFocusPainted(false);
			btnUnesiPitanje.setBorderPainted(false);
			btnUnesiPitanje.setBackground(Color.WHITE);
			btnUnesiPitanje.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnUnesiPitanje.setBackground(new Color(240, 248, 255));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnUnesiPitanje.setBackground(Color.WHITE);
				}
			});
			
		}
		
		
		return btnUnesiPitanje;
	}
	public JButton getBtnObrisiPitanje() {
		if (btnObrisiPitanje == null) {
			btnObrisiPitanje = new JButton("Obrisi pitanje");
			btnObrisiPitanje.setPreferredSize(new Dimension(125, 25));
			btnObrisiPitanje.setFont(new Font("Verdana", Font.BOLD, 11));
			btnObrisiPitanje.setFocusPainted(false);
			btnObrisiPitanje.setBorderPainted(false);
			btnObrisiPitanje.setBackground(Color.WHITE);
			btnObrisiPitanje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.obrisiPitanje();
				}
			});
			btnObrisiPitanje.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnObrisiPitanje.setBackground(new Color(240, 248, 255));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnObrisiPitanje.setBackground(Color.WHITE);
				}
			});
			
		}
		
		
		return btnObrisiPitanje;
	}
	public JButton getBtnSacuvajTest() {
		if (btnSacuvajTest == null) {
			btnSacuvajTest = new JButton("Sacuvaj kviz");
			btnSacuvajTest.setEnabled(false);
			btnSacuvajTest.setBounds(10, 225, 125, 25);
			getBtnSacuvajTest().setPreferredSize(new Dimension(125, 25));
			btnSacuvajTest.setFont(new Font("Verdana", Font.BOLD, 11));
			btnSacuvajTest.setFocusPainted(false);
			btnSacuvajTest.setBorderPainted(false);
			btnSacuvajTest.setBackground(Color.WHITE);
			btnSacuvajTest.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnSacuvajTest.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnSacuvajTest.setBackground(new Color(240, 248, 255));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnSacuvajTest.setBackground(Color.WHITE);
				}
			});
			
		}
		
		
		return btnSacuvajTest;
	}
	public JButton getBtnIzadji() {
		if (btnIzadji == null) {
			btnIzadji = new JButton("Izadji");
			btnIzadji.setBounds(174, 225, 125, 25);
			btnIzadji.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnIzadji.setPreferredSize(new Dimension(125, 25));
			btnIzadji.setFont(new Font("Verdana", Font.BOLD, 11));
			btnIzadji.setFocusPainted(false);
			btnIzadji.setBorderPainted(false);
			btnIzadji.setBackground(Color.WHITE);
			btnIzadji.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnIzadji.setBackground(new Color(240, 128, 125));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnIzadji.setBackground(Color.WHITE);
				}
			});
			
		
		
		}
		return btnIzadji;
	}


	public JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBackground(Color.WHITE);
			panel_2.setLayout(null);
			panel_2.add(getLblNazivKviza());
			panel_2.add(getTxtNazivKviza());
			panel_2.add(getBtnSacuvajTest());
			panel_2.add(getBtnIzadji());
		}
		return panel_2;
	}
	public JLabel getLblNazivKviza() {
		if (lblNazivKviza == null) {
			lblNazivKviza = new JLabel("Naziv kviza");
			lblNazivKviza.setFont(new Font("Calibri", Font.BOLD, 16));
			lblNazivKviza.setBounds(10, 24, 125, 14);
		}
		return lblNazivKviza;
	}
	public JTextField getTxtNazivKviza() {
		if (txtNazivKviza == null) {
			txtNazivKviza = new JTextField();
			txtNazivKviza.setBounds(10, 62, 289, 20);
			txtNazivKviza.setColumns(10);
		}
		return txtNazivKviza;
	}
	public JButton getBtnIzmeniPitanje() {
		if (btnIzmeniPitanje == null) {
			btnIzmeniPitanje = new JButton("Izmeni");
			btnIzmeniPitanje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.otvoriIzmenjivac();
				}
			});
			btnIzmeniPitanje.setPreferredSize(new Dimension(125, 25));
			btnIzmeniPitanje.setFont(new Font("Verdana", Font.BOLD, 11));
			btnIzmeniPitanje.setFocusPainted(false);
			btnIzmeniPitanje.setBorderPainted(false);
			btnIzmeniPitanje.setBackground(Color.WHITE);
		}
		return btnIzmeniPitanje;
	}
	public JButton getBtnPogledajKviz() {
		if (btnPogledajKviz == null) {
			btnPogledajKviz = new JButton("Pogledaj kviz");
			btnPogledajKviz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.pogledajTest();
				}
			});
			btnPogledajKviz.setPreferredSize(new Dimension(125, 25));
			btnPogledajKviz.setFont(new Font("Verdana", Font.BOLD, 11));
			btnPogledajKviz.setFocusPainted(false);
			btnPogledajKviz.setBorderPainted(false);
			btnPogledajKviz.setBackground(Color.WHITE);
		}
		return btnPogledajKviz;
	}
}
