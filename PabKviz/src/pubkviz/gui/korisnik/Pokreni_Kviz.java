package pubkviz.gui.korisnik;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Pokreni_Kviz extends JDialog {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblGornjePitanje;
	private JScrollPane scrollPane;
	private JTextArea txtGornjePitanje;
	private JLabel lblGornjiOdgovor;
	private JTextArea txtGornjiOdgvor;
	private JLabel lblSrednjePitanje;
	private JScrollPane scrollPane_1;
	private JTextArea txtSrednjePitanje;
	private JLabel lblSrednjiOdgovor;
	private JTextArea txtSrednjiOdgovor;
	private JLabel lblDonjePitanje;
	private JScrollPane scrollPane_2;
	private JLabel lblDonjiOdgovor;
	private JTextArea txtDonjePitanje;
	private JTextArea txtDonjiOdgovor;
	private JButton btnPrthodnaStrana;
	private JButton btnSledecaStrana;


	/**
	 * Create the frame.
	 */
	public Pokreni_Kviz() {
		setModal(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				
			}
		});
		setResizable(false);
		setTitle("Pokreni kviz");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 453, 584);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.CENTER);
	}

	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel(){
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
			panel.setBackground(Color.WHITE);
			panel.setLayout(null);
			panel.add(getLblGornjePitanje());
			panel.add(getScrollPane_1());
			panel.add(getLblGornjiOdgovor());
			panel.add(getTxtGornjiOdgvor());
			panel.add(getLblSrednjePitanje());
			panel.add(getScrollPane_1_1());
			panel.add(getLblSrednjiOdgovor());
			panel.add(getTxtSrednjiOdgovor());
			panel.add(getLblDonjePitanje());
			panel.add(getScrollPane_2_1());
			panel.add(getLblDonjiOdgovor());
			panel.add(getTxtDonjiOdgovor());
			panel.add(getBtnPrthodnaStrana());
			panel.add(getBtnSledecaStrana());
		}
		return panel;
	}
	public JLabel getLblGornjePitanje() {
		if (lblGornjePitanje == null) {
			lblGornjePitanje = new JLabel("Gornje pitanje");
			lblGornjePitanje.setBounds(10, 11, 106, 23);
		}
		return lblGornjePitanje;
	}
	public JScrollPane getScrollPane_1() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 45, 417, 53);
			scrollPane.setViewportView(getTxtGornjePitanje());
		}
		return scrollPane;
	}
	public JTextArea getTxtGornjePitanje() {
		if (txtGornjePitanje == null) {
			txtGornjePitanje = new JTextArea();
			txtGornjePitanje.setWrapStyleWord(true);
			txtGornjePitanje.setLineWrap(true);
			txtGornjePitanje.setEditable(false);
		}
		return txtGornjePitanje;
	}
	public JLabel getLblGornjiOdgovor() {
		if (lblGornjiOdgovor == null) {
			lblGornjiOdgovor = new JLabel("Gornji odgovor");
			lblGornjiOdgovor.setBounds(10, 109, 106, 14);
		}
		return lblGornjiOdgovor;
	}
	public JTextArea getTxtGornjiOdgvor() {
		if (txtGornjiOdgvor == null) {
			txtGornjiOdgvor = new JTextArea();
			txtGornjiOdgvor.setBorder(new LineBorder(new Color(0, 0, 0)));
			txtGornjiOdgvor.setLineWrap(true);
			txtGornjiOdgvor.setWrapStyleWord(true);
			txtGornjiOdgvor.setBounds(10, 134, 417, 29);
		}
		return txtGornjiOdgvor;
	}
	public JLabel getLblSrednjePitanje() {
		if (lblSrednjePitanje == null) {
			lblSrednjePitanje = new JLabel("Srednje pitanje");
			lblSrednjePitanje.setBounds(10, 174, 106, 23);
		}
		return lblSrednjePitanje;
	}
	public JScrollPane getScrollPane_1_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(10, 208, 417, 53);
			scrollPane_1.setViewportView(getTxtSrednjePitanje());
		}
		return scrollPane_1;
	}
	public JTextArea getTxtSrednjePitanje() {
		if (txtSrednjePitanje == null) {
			txtSrednjePitanje = new JTextArea();
			txtSrednjePitanje.setLineWrap(true);
			txtSrednjePitanje.setWrapStyleWord(true);
			txtSrednjePitanje.setEditable(false);
		}
		return txtSrednjePitanje;
	}
	public JLabel getLblSrednjiOdgovor() {
		if (lblSrednjiOdgovor == null) {
			lblSrednjiOdgovor = new JLabel("Srednji odgovor");
			lblSrednjiOdgovor.setBounds(10, 275, 106, 14);
		}
		return lblSrednjiOdgovor;
	}
	public JTextArea getTxtSrednjiOdgovor() {
		if (txtSrednjiOdgovor == null) {
			txtSrednjiOdgovor = new JTextArea();
			txtSrednjiOdgovor.setBorder(new LineBorder(new Color(0, 0, 0)));
			txtSrednjiOdgovor.setLineWrap(true);
			txtSrednjiOdgovor.setWrapStyleWord(true);
			txtSrednjiOdgovor.setBounds(10, 300, 417, 29);
		}
		return txtSrednjiOdgovor;
	}
	public JLabel getLblDonjePitanje() {
		if (lblDonjePitanje == null) {
			lblDonjePitanje = new JLabel("Donje pitanje");
			lblDonjePitanje.setBounds(10, 340, 106, 23);
		}
		return lblDonjePitanje;
	}
	public JScrollPane getScrollPane_2_1() {
		if (scrollPane_2 == null) {
			scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(10, 374, 417, 53);
			scrollPane_2.setViewportView(getTxtDonjePitanje());
		}
		return scrollPane_2;
	}
	public JLabel getLblDonjiOdgovor() {
		if (lblDonjiOdgovor == null) {
			lblDonjiOdgovor = new JLabel("Donji odgovor");
			lblDonjiOdgovor.setBounds(10, 438, 106, 14);
		}
		return lblDonjiOdgovor;
	}
	public JTextArea getTxtDonjePitanje() {
		if (txtDonjePitanje == null) {
			txtDonjePitanje = new JTextArea();
			txtDonjePitanje.setLineWrap(true);
			txtDonjePitanje.setWrapStyleWord(true);
			txtDonjePitanje.setEditable(false);
		}
		return txtDonjePitanje;
	}
	public JTextArea getTxtDonjiOdgovor() {
		if (txtDonjiOdgovor == null) {
			txtDonjiOdgovor = new JTextArea();
			txtDonjiOdgovor.setBorder(new LineBorder(new Color(0, 0, 0)));
			txtDonjiOdgovor.setLineWrap(true);
			txtDonjiOdgovor.setWrapStyleWord(true);
			txtDonjiOdgovor.setBounds(10, 463, 417, 29);
		}
		return txtDonjiOdgovor;
	}
	public JButton getBtnPrthodnaStrana() {
		if (btnPrthodnaStrana == null) {
			btnPrthodnaStrana = new JButton("Prethodna strana");
			btnPrthodnaStrana.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnPrthodnaStrana.setBounds(10, 511, 168, 23);
			btnPrthodnaStrana.setFont(new Font("Verdana", Font.BOLD, 11));
			btnPrthodnaStrana.setFocusPainted(false);
			btnPrthodnaStrana.setBorderPainted(false);
			btnPrthodnaStrana.setBackground(Color.WHITE);
			btnPrthodnaStrana.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnPrthodnaStrana.setBackground(new Color(240, 248, 255));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnPrthodnaStrana.setBackground(Color.WHITE);
				}
			});
		}
		return btnPrthodnaStrana;
	}
	public JButton getBtnSledecaStrana() {
		if (btnSledecaStrana == null) {
			btnSledecaStrana = new JButton("Sledeca strana");
			btnSledecaStrana.setBounds(259, 511, 168, 23);
			btnSledecaStrana.setFont(new Font("Verdana", Font.BOLD, 11));
			btnSledecaStrana.setFocusPainted(false);
			btnSledecaStrana.setBorderPainted(false);
			btnSledecaStrana.setBackground(Color.WHITE);
			btnSledecaStrana.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnSledecaStrana.setBackground(new Color(240, 248, 255));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnSledecaStrana.setBackground(Color.WHITE);
				}
			});
		}
		return btnSledecaStrana;
	}
}