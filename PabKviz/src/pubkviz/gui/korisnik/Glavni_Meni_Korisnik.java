package pubkviz.gui.korisnik;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import pubkviz.gui.GUIKontroler;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Glavni_Meni_Korisnik extends JFrame {
	

	private JPanel contentPane;
	private JLabel lblPubKviz;
	private JPanel panel_1;
	private JButton btnPokreniKviz;
	private JButton btnKrajRada;
	private JPanel panel_2;
	private JButton btnIzmeniGrupu;
	private JButton btnIzbrisiGrupu;



	/**
	 * Create the frame.
	 * @return 
	 */
	public Glavni_Meni_Korisnik(){
		setResizable(false);
		setBackground(Color.WHITE);
		setTitle("Pub Kviz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 477);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel_1(), BorderLayout.WEST);
		contentPane.add(getPanel_2(), BorderLayout.CENTER);
	}
	public JLabel getLblPubKviz() {
		if (lblPubKviz == null) {
			lblPubKviz = new JLabel("Pub Kviz");
			lblPubKviz.setBounds(102, 11, 151, 46);
			lblPubKviz.setFont(new Font("Book Antiqua", Font.PLAIN, 37));
		}
		return lblPubKviz;
	}
	public JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
		//	panel_1.setBorder(new LineBorder(new Color(230, 230, 230), 2, true));
			panel_1.setBackground(new Color(255,255,255));
			panel_1.setPreferredSize(new Dimension(150, 10));
			panel_1.setLayout(null);
			panel_1.add(getBtnPokreniKviz());
			panel_1.add(getButton_3_1());
			panel_1.add(getButton_1());
			panel_1.add(getButton_2());
		}
		return panel_1;
	}
	public JButton getBtnPokreniKviz() {
		if (btnPokreniKviz == null) {
			btnPokreniKviz = new JButton("Pokreni Kviz");
			btnPokreniKviz.setBounds(10, 70, 121, 23);
			btnPokreniKviz.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnPokreniKviz.setBackground(new Color(240, 248, 255));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnPokreniKviz.setBackground(Color.WHITE);
				}
			});
			btnPokreniKviz.setFont(new Font("Verdana", Font.BOLD, 11));
			btnPokreniKviz.setFocusPainted(false);
			btnPokreniKviz.setBorderPainted(false);
			btnPokreniKviz.setBackground(Color.WHITE);
		}
		return btnPokreniKviz;
	}
	public JButton getButton_3_1() {
		if (btnKrajRada == null) {
			btnKrajRada = new JButton("Kraj rada");
			btnKrajRada.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.ugasiAplikacijuKorisnik();
				}
			});
			btnKrajRada.setBounds(10, 172, 121, 23);
			btnKrajRada.setFont(new Font("Verdana", Font.BOLD, 11));
			btnKrajRada.setFocusPainted(false);
			btnKrajRada.setBorderPainted(false);
			btnKrajRada.setBackground(Color.WHITE);
			btnKrajRada.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnKrajRada.setBackground(new Color(240, 128, 125));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnKrajRada.setBackground(Color.WHITE);
				}
			});
		}
		return btnKrajRada;
	}
	public JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel(){
		        @Override
		        protected void paintComponent(Graphics grphcs) {
		            super.paintComponent(grphcs);
		            Graphics2D g2d = (Graphics2D) grphcs;
		            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		                    RenderingHints.VALUE_ANTIALIAS_ON);
		            GradientPaint gp = new GradientPaint(0, 340,
							getBackground().brighter().brighter(), 1000, getHeight(),
		                    getBackground().darker());
		            g2d.setPaint(gp);
		            g2d.fillRect( 0,0,getWidth(),  getHeight()); 

		        }

		    };
		//	panel_2.setBorder(new LineBorder(new Color(230, 230, 230), 2, true));
			panel_2.setBackground(new Color(245,245,245));
			panel_2.setLayout(null);
			panel_2.add(getLblPubKviz());
		}
		
		return panel_2;
	}
	public JButton getButton_1() {
		if (btnIzmeniGrupu == null) {
			btnIzmeniGrupu = new JButton("Izmeni grupu");
			btnIzmeniGrupu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.izmeniGrupu();
				}
			});
			btnIzmeniGrupu.setFont(new Font("Verdana", Font.BOLD, 11));
			btnIzmeniGrupu.setFocusPainted(false);
			btnIzmeniGrupu.setBorderPainted(false);
			btnIzmeniGrupu.setBackground(Color.WHITE);
			btnIzmeniGrupu.setBounds(10, 104, 121, 23);
			btnIzmeniGrupu.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnIzmeniGrupu.setBackground(new Color(240, 248, 255));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnIzmeniGrupu.setBackground(Color.WHITE);
				}
			});
		}
		return btnIzmeniGrupu;
	}
	public JButton getButton_2() {
		if (btnIzbrisiGrupu == null) {
			btnIzbrisiGrupu = new JButton("Izbrisi grupu");
			btnIzbrisiGrupu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnIzbrisiGrupu.setFont(new Font("Verdana", Font.BOLD, 11));
			btnIzbrisiGrupu.setFocusPainted(false);
			btnIzbrisiGrupu.setBorderPainted(false);
			btnIzbrisiGrupu.setBackground(Color.WHITE);
			btnIzbrisiGrupu.setBounds(10, 138, 121, 23);
			btnIzbrisiGrupu.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnIzbrisiGrupu.setBackground(new Color(240, 248, 255));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnIzbrisiGrupu.setBackground(Color.WHITE);
				}
			});
		}
		return btnIzbrisiGrupu;
	}
}
