package pubkviz.gui;

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
import javax.swing.JButton;
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

public class NapraviKviz extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnUnesiPitanje;
	private JButton btnObrisiPitanje;
	private JButton btnSacuvajTest;
	private JButton btnIzadji;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JPanel panel_1;
	private JProgressBar progressBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NapraviKviz frame = new NapraviKviz();
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
	public NapraviKviz() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
	}

	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(255, 255, 255, 155));
			panel.setPreferredSize(new Dimension(125, 0));
			panel.add(getBtnUnesiPitanje());
			panel.add(getBtnObrisiPitanje());
			panel.add(getBtnSacuvajTest());
			panel.add(getBtnIzadji());
		}
		return panel;
	}
	public JButton getBtnUnesiPitanje() {
		if (btnUnesiPitanje == null) {
			btnUnesiPitanje = new JButton("Unesi pitanje");
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
			btnSacuvajTest = new JButton("Sacuvaj test");
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
			btnIzadji.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
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
	public JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	public JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setEditable(false);
		}
		return textArea;
	}


}
