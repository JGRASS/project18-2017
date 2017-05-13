package pubkviz.gui.admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import pubkviz.gui.GUIKontroler;

import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Color;
import java.awt.Dimension;

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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;
import java.awt.event.MouseMotionAdapter;

public class Unos_Pitanja extends JDialog {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnOdustani;
	private JButton btnNapraviPItanje;
	private JLabel lblNapisitePitanje;
	private JPanel panel_1;
	private JTextArea txtNapisitePitanje;
	private JRadioButton rdbtnPrviOdgovor;
	private JRadioButton rdbtnDrugiOdgovor;
	private JRadioButton rdbtnTreciOdgovor;
	private JRadioButton rdbtnNeZnam;
	private JTextField txtPrviOdgovor;
	private JTextField txtDrugiOdgovor;
	private JTextField txtNeZnam;
	private JTextField txtTreciOdgovor;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblUnesiteOdgovoreI;



	/**
	 * Create the frame.
	 */
	public Unos_Pitanja() {
		setResizable(false);
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
		contentPane = new JPanel();
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
			btnNapraviPItanje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.unesiPitanje();
				}
			});
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
			panel_1.setBackground(Color.WHITE);
			panel_1.setBorder(null);
			panel_1.setLayout(null);
			panel_1.add(getTextPane_1());
			panel_1.add(getRdbtnPrviOdgovor());
			panel_1.add(getRdbtnDrugiOdgovor());
			panel_1.add(getRdbtnTreciOdgovor());
			panel_1.add(getRdbtnNeZnam());
			panel_1.add(getTxtPrviOdgovor());
			panel_1.add(getTxtDrugiOdgovor());
			panel_1.add(getTxtNeZnam());
			panel_1.add(getTxtTreciOdgovor());
			panel_1.add(getLblUnesiteOdgovoreI());
		}
		return panel_1;
	}
	public JTextArea getTextPane_1() {
		if (txtNapisitePitanje == null) {
			txtNapisitePitanje = new JTextArea();
			txtNapisitePitanje.setBorder(new LineBorder(new Color(0, 0, 0)));
			txtNapisitePitanje.setBounds(4, 4, 426, 77);
			txtNapisitePitanje.setLineWrap(true);
			txtNapisitePitanje.setWrapStyleWord(true);
			txtNapisitePitanje.setText("");
		}
		return txtNapisitePitanje;
	}
	public JRadioButton getRdbtnPrviOdgovor() {
		if (rdbtnPrviOdgovor == null) {
			rdbtnPrviOdgovor = new JRadioButton("");
			rdbtnPrviOdgovor.setBackground(Color.WHITE);
			buttonGroup.add(rdbtnPrviOdgovor);
			rdbtnPrviOdgovor.setBounds(4, 129, 21, 23);
		}
		return rdbtnPrviOdgovor;
	}
	public JRadioButton getRdbtnDrugiOdgovor() {
		if (rdbtnDrugiOdgovor == null) {
			rdbtnDrugiOdgovor = new JRadioButton("");
			rdbtnDrugiOdgovor.setBackground(Color.WHITE);
			buttonGroup.add(rdbtnDrugiOdgovor);
			rdbtnDrugiOdgovor.setBounds(4, 174, 21, 23);
		}
		return rdbtnDrugiOdgovor;
	}
	public JRadioButton getRdbtnTreciOdgovor() {
		if (rdbtnTreciOdgovor == null) {
			rdbtnTreciOdgovor = new JRadioButton("");
			rdbtnTreciOdgovor.setBackground(Color.WHITE);
			buttonGroup.add(rdbtnTreciOdgovor);
			rdbtnTreciOdgovor.setBounds(278, 129, 21, 23);
		}
		return rdbtnTreciOdgovor;
	}
	public JRadioButton getRdbtnNeZnam() {
		if (rdbtnNeZnam == null) {
			rdbtnNeZnam = new JRadioButton("");
			rdbtnNeZnam.setEnabled(false);
			rdbtnNeZnam.setBackground(Color.WHITE);
			buttonGroup.add(rdbtnNeZnam);
			rdbtnNeZnam.setBounds(278, 174, 21, 23);
		}
		return rdbtnNeZnam;
	}
	public JTextField getTxtPrviOdgovor() {
		if (txtPrviOdgovor == null) {
			txtPrviOdgovor = new JTextField();
			txtPrviOdgovor.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if(txtPrviOdgovor.getText().equals("Prvi odgovor")){
						txtPrviOdgovor.setText("");
					}
				}
			});
			txtPrviOdgovor.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
			txtPrviOdgovor.setText("Prvi odgovor");
			txtPrviOdgovor.setBounds(31, 132, 125, 20);
			txtPrviOdgovor.setColumns(10);
		}
		return txtPrviOdgovor;
	}
	public JTextField getTxtDrugiOdgovor() {
		if (txtDrugiOdgovor == null) {
			txtDrugiOdgovor = new JTextField();
			txtDrugiOdgovor.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseDragged(MouseEvent arg0) {
					if(txtDrugiOdgovor.getText().equals("Drugi odgovor")){
						txtDrugiOdgovor.setText("");
					}
				}
			});
			txtDrugiOdgovor.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
			txtDrugiOdgovor.setText("Drugi odgovor");
			txtDrugiOdgovor.setColumns(10);
			txtDrugiOdgovor.setBounds(31, 177, 125, 20);
		}
		return txtDrugiOdgovor;
	}
	public JTextField getTxtNeZnam() {
		if (txtNeZnam == null) {
			txtNeZnam = new JTextField();
			txtNeZnam.setEditable(false);
			txtNeZnam.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
			txtNeZnam.setText("Ne znam");
			txtNeZnam.setColumns(10);
			txtNeZnam.setBounds(305, 177, 125, 20);
		}
		return txtNeZnam;
	}
	public JTextField getTxtTreciOdgovor() {
		if (txtTreciOdgovor == null) {
			txtTreciOdgovor = new JTextField();
			txtTreciOdgovor.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(txtTreciOdgovor.getText().equals("Treci odgovor")){
						txtTreciOdgovor.setText("");
					}
				}
			});
			txtTreciOdgovor.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
			txtTreciOdgovor.setText("Treci odgovor");
			txtTreciOdgovor.setColumns(10);
			txtTreciOdgovor.setBounds(305, 133, 125, 20);
		}
		return txtTreciOdgovor;
	}
	public JLabel getLblUnesiteOdgovoreI() {
		if (lblUnesiteOdgovoreI == null) {
			lblUnesiteOdgovoreI = new JLabel("Unesite odgovore i oznacite tacan:");
			lblUnesiteOdgovoreI.setFont(new Font("Calibri", Font.BOLD, 16));
			lblUnesiteOdgovoreI.setBounds(4, 92, 256, 14);
		}
		return lblUnesiteOdgovoreI;
	}
}
