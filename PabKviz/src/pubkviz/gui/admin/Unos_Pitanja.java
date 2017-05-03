package pubkviz.gui.admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pubkviz.gui.GUIKontroler;

import javax.swing.JButton;
import javax.swing.JDialog;

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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Unos_Pitanja extends JDialog {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnOdustani;
	private JButton btnNapraviPItanje;
	private JLabel lblNapisitePitanje;
	private JPanel panel_1;
	private JTextPane txtNapisitePitanje;



	/**
	 * Create the frame.
	 */
	public Unos_Pitanja() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				GUIKontroler.unosPitanjaZatvaranje();
			}
		});
		setModal(true);
		setTitle("Unesite pitanje");
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
			panel.add(getBtnOdustani(), BorderLayout.EAST);
			panel.add(getBtnNapraviPItanje(), BorderLayout.WEST);
		}
		return panel;
	}
	public JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.unosPitanjaZatvaranje();
				}
			});
			btnOdustani.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnOdustani.setBackground(new Color(240, 128, 125));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnOdustani.setBackground(Color.WHITE);
				}
			});
			btnOdustani.setFont(new Font("Verdana", Font.BOLD, 11));
			btnOdustani.setFocusPainted(false);
			btnOdustani.setBorderPainted(false);
			btnOdustani.setBackground(Color.WHITE);
		}
		return btnOdustani;
	}
	public JButton getBtnNapraviPItanje() {
		if (btnNapraviPItanje == null) {
			btnNapraviPItanje = new JButton("Napravi pitanje");
			btnNapraviPItanje.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnNapraviPItanje.setBackground(new Color(240, 248, 255));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnNapraviPItanje.setBackground(Color.WHITE);
				}
			});
			btnNapraviPItanje.setFont(new Font("Verdana", Font.BOLD, 11));
			btnNapraviPItanje.setFocusPainted(false);
			btnNapraviPItanje.setBorderPainted(false);
			btnNapraviPItanje.setBackground(Color.WHITE);
		
		}
		return btnNapraviPItanje;
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
		if (txtNapisitePitanje == null) {
			txtNapisitePitanje = new JTextPane();
			txtNapisitePitanje.setText("");
		}
		return txtNapisitePitanje;
	}
}
