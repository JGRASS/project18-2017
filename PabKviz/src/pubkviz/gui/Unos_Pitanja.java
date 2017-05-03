package pubkviz.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;

public class Unos_Pitanja extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblNapisitePitanje;
	private JPanel panel_1;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Unos_Pitanja frame = new Unos_Pitanja();
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
	public Unos_Pitanja() {
		setTitle("Unesite pitanje");
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
						getBackground().brighter().brighter(), 1000, getHeight(),
	                    getBackground().darker());
	            g2d.setPaint(gp);
	            g2d.fillRect( 0,0,getWidth(),  getHeight()); 

	        }

	    };
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.SOUTH);
		contentPane.add(getLblNapisitePitanje(), BorderLayout.NORTH);
		contentPane.add(getPanel_1(), BorderLayout.CENTER);
	}

	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(Color.WHITE);
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getBtnNewButton_1(), BorderLayout.EAST);
			panel.add(getBtnNewButton_2(), BorderLayout.WEST);
		}
		return panel;
	}
	public JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Odustani");
			btnNewButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnNewButton_1.setBackground(new Color(240, 128, 125));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnNewButton_1.setBackground(Color.WHITE);
				}
			});
			btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 11));
			btnNewButton_1.setFocusPainted(false);
			btnNewButton_1.setBorderPainted(false);
			btnNewButton_1.setBackground(Color.WHITE);
		}
		return btnNewButton_1;
	}
	public JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Napravi pitanje");
			btnNewButton_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnNewButton_2.setBackground(new Color(240, 248, 255));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnNewButton_2.setBackground(Color.WHITE);
				}
			});
			btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 11));
			btnNewButton_2.setFocusPainted(false);
			btnNewButton_2.setBorderPainted(false);
			btnNewButton_2.setBackground(Color.WHITE);
		
		}
		return btnNewButton_2;
	}
	public JLabel getLblNapisitePitanje() {
		if (lblNapisitePitanje == null) {
			lblNapisitePitanje = new JLabel("Napisite pitanje:");
			lblNapisitePitanje.setFont(new Font("Calibri", Font.BOLD, 16));
		}
		return lblNapisitePitanje;
	}
	public JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBackground(Color.LIGHT_GRAY);
			panel_1.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new BevelBorder(BevelBorder.RAISED, null, null, null, null)));
			panel_1.setLayout(new BorderLayout(0, 0));
			panel_1.add(getTextPane_1(), BorderLayout.CENTER);
		}
		return panel_1;
	}
	public JTextPane getTextPane_1() {
		if (textPane == null) {
			textPane = new JTextPane();
			textPane.setText("");
		}
		return textPane;
	}
}
