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
	private JButton btnUnesiPitanje;
	private JButton btnObrisiPitanje;
	private JButton btnSacuvajTest;
	private JButton btnIzadji;
	private JPanel panel_1;
	private JProgressBar progressBar;
	private JPanel panel_2;
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
		setBounds(100, 100, 330, 285);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel_2(), BorderLayout.CENTER);
	}
	public JButton getBtnUnesiPitanje() {
		if (btnUnesiPitanje == null) {
			btnUnesiPitanje = new JButton("Unesi pitanje");
			btnUnesiPitanje.setBounds(91, 11, 125, 25);
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
			btnObrisiPitanje.setBounds(91, 119, 125, 25);
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
			btnSacuvajTest.setBounds(10, 210, 125, 25);
			getBtnSacuvajTest().setPreferredSize(new Dimension(125, 25));
			btnSacuvajTest.setFont(new Font("Verdana", Font.BOLD, 11));
			btnSacuvajTest.setFocusPainted(false);
			btnSacuvajTest.setBorderPainted(false);
			btnSacuvajTest.setBackground(Color.WHITE);
			btnSacuvajTest.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.sacuvajKviz();
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
			btnIzadji.setBounds(179, 210, 125, 25);
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
			panel_2.add(getBtnSacuvajTest());
			panel_2.add(getBtnIzadji());
			panel_2.add(getBtnUnesiPitanje());
			panel_2.add(getBtnIzmeniPitanje());
			panel_2.add(getBtnObrisiPitanje());
			panel_2.add(getBtnPogledajKviz());
		}
		return panel_2;
	}
	public JButton getBtnIzmeniPitanje() {
		if (btnIzmeniPitanje == null) {
			btnIzmeniPitanje = new JButton("Izmeni");
			btnIzmeniPitanje.setBounds(91, 47, 125, 25);
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
			btnPogledajKviz.setBounds(91, 83, 125, 25);
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
