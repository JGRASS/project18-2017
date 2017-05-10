package pubkviz.gui.admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import pubkviz.gui.GUIKontroler;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;


public class Glavni_Meni extends JFrame {

	private JPanel contentPane;
	private JLabel lblPubKviz;
	private JPanel panel_1;
	private JButton btnPokreniKviz;
	private JButton btnNapraviKviz;
	private JButton btnKrajRada;
	private JPanel panel_2;
	private JLabel lblNewLabel;


	/**
	 * Create the frame.
	 * @return 
	 */
	public Glavni_Meni() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Glavni_Meni.class.getResource("/123.png")));
		setResizable(false);
		setBackground(Color.WHITE);
		setTitle("Pub Kviz");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
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
			panel_1.add(getButton_2_1());
			panel_1.add(getButton_3_1());
		}
		return panel_1;
	}
	public JButton getBtnPokreniKviz() {
		if (btnPokreniKviz == null) {
			btnPokreniKviz = new JButton("Pokreni Kviz");
			btnPokreniKviz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.pokreniKviz();
				}
			});
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
	public JButton getButton_2_1() {
		if (btnNapraviKviz == null) {
			btnNapraviKviz = new JButton("Napravi kviz");
			btnNapraviKviz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.napraviKviz();
				}
			});
			btnNapraviKviz.setBounds(10, 104, 121, 23);
			btnNapraviKviz.setFont(new Font("Verdana", Font.BOLD, 11));
			btnNapraviKviz.setFocusPainted(false);
			btnNapraviKviz.setBorderPainted(false);
			btnNapraviKviz.setBackground(Color.WHITE);
			btnNapraviKviz.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnNapraviKviz.setBackground(new Color(240, 248, 255));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnNapraviKviz.setBackground(Color.WHITE);
				}
			});
		}
		return btnNapraviKviz;
	}
	public JButton getButton_3_1() {
		if (btnKrajRada == null) {
			btnKrajRada = new JButton("Kraj rada");
			btnKrajRada.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.ugasiAplikaciju();
				}
			});
			btnKrajRada.setBounds(10, 138, 121, 23);
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
			panel_2.add(getLblNewLabel());
		}
		
		return panel_2;
	}
	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			try {
				BufferedImage myPicture = ImageIO.read(Glavni_Meni.class.getResource("/capybara.png"));
				lblNewLabel = new JLabel(new ImageIcon(myPicture));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			lblNewLabel.setBounds(23, 11, 1111, 927);
		}
		return lblNewLabel;
	}
}
