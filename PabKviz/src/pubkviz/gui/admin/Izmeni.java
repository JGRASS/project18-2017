package pubkviz.gui.admin;

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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.ButtonGroup;
import java.awt.Component;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;

public class Izmeni extends JDialog {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblGornjePitanje;
	private JScrollPane scrollPane;
	private JTextArea txtGornjePitanje;
	private JLabel lblGornjiOdgovor;
	private JLabel lblDonjePitanje;
	private JScrollPane scrollPane_2;
	private JLabel lblDonjiOdgovor;
	private JTextArea txtDonjePitanje;
	private JButton btnPrthodnaStrana;
	private JButton btnSledecaStrana;
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private JRadioButton radioButton_2;
	private JRadioButton radioButton_3;
	private JTextField txtPrviGornjiOdgovor;
	private JTextField txtDrugiGornjiOdgovor;
	private JTextField txtNeZnamGornjiOdgovor;
	private JTextField txtTreciGornjiOdgovor;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton radioButton_4;
	private JRadioButton radioButton_5;
	private JRadioButton radioButton_6;
	private JRadioButton radioButton_7;
	private JTextField txtPrviDonjiOdgovor;
	private JTextField txtDrugiDonjiOdgovor;
	private JTextField txtNeZnamDonjiOdgovor;
	private JTextField txtTreciDonjiOdgovor;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();


	/**
	 * Create the frame.
	 */
	public Izmeni() {
		setModal(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				
			}
		});
		setResizable(false);
		setTitle("Pokreni kviz");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 453, 522);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.CENTER);
	}

	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel()
			{
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
			panel.add(getLblDonjePitanje());
			panel.add(getScrollPane_2_1());
			panel.add(getLblDonjiOdgovor());
			panel.add(getBtnPrthodnaStrana());
			panel.add(getBtnSledecaStrana());
			panel.add(getRadioButton());
			panel.add(getRadioButton_1());
			panel.add(getRadioButton_2());
			panel.add(getRadioButton_3());
			panel.add(getTxtPrviGornjiOdgovor());
			panel.add(getTxtDrugiGornjiOdgovor());
			panel.add(getTxtNeZnamGornjiOdgovor());
			panel.add(getTxtTreciGornjiOdgovor());
			panel.add(getRadioButton_4());
			panel.add(getRadioButton_5());
			panel.add(getRadioButton_6());
			panel.add(getRadioButton_7());
			panel.add(getTxtPrviDonjiOdgovor());
			panel.add(getTxtDrugiDonjiOdgovor());
			panel.add(getTxtNeZnamDonjiOdgovor());
			panel.add(getTxtTreciDonjiOdgovor());
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
	public JLabel getLblDonjePitanje() {
		if (lblDonjePitanje == null) {
			lblDonjePitanje = new JLabel("Donje pitanje");
			lblDonjePitanje.setBounds(10, 222, 106, 23);
		}
		return lblDonjePitanje;
	}
	public JScrollPane getScrollPane_2_1() {
		if (scrollPane_2 == null) {
			scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(10, 256, 417, 53);
			scrollPane_2.setViewportView(getTxtDonjePitanje());
		}
		return scrollPane_2;
	}
	public JLabel getLblDonjiOdgovor() {
		if (lblDonjiOdgovor == null) {
			lblDonjiOdgovor = new JLabel("Donji odgovor");
			lblDonjiOdgovor.setBounds(10, 320, 106, 14);
		}
		return lblDonjiOdgovor;
	}
	public JTextArea getTxtDonjePitanje() {
		if (txtDonjePitanje == null) {
			txtDonjePitanje = new JTextArea();
			txtDonjePitanje.setLineWrap(true);
			txtDonjePitanje.setWrapStyleWord(true);
		}
		return txtDonjePitanje;
	}
	public JButton getBtnPrthodnaStrana() {
		if (btnPrthodnaStrana == null) {
			btnPrthodnaStrana = new JButton("Prethodna strana");
			btnPrthodnaStrana.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnPrthodnaStrana.setBounds(0, 447, 168, 23);
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
			btnSledecaStrana.setBounds(268, 447, 168, 23);
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
	public JRadioButton getRadioButton() {
		if (radioButton == null) {
			radioButton = new JRadioButton("");
			radioButton.setHorizontalAlignment(SwingConstants.CENTER);
			radioButton.setBorder(new LineBorder(new Color(0, 0, 0)));
			radioButton.setBorderPainted(true);
			radioButton.setAlignmentX(Component.CENTER_ALIGNMENT);
			buttonGroup.add(radioButton);
			radioButton.setBackground(Color.WHITE);
			radioButton.setBounds(10, 134, 21, 23);
		}
		return radioButton;
	}
	public JRadioButton getRadioButton_1() {
		if (radioButton_1 == null) {
			radioButton_1 = new JRadioButton("");
			radioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
			radioButton_1.setBorder(new LineBorder(new Color(0, 0, 0)));
			radioButton_1.setBorderPainted(true);
			buttonGroup.add(radioButton_1);
			radioButton_1.setBackground(Color.WHITE);
			radioButton_1.setBounds(10, 179, 21, 23);
		}
		return radioButton_1;
	}
	public JRadioButton getRadioButton_2() {
		if (radioButton_2 == null) {
			radioButton_2 = new JRadioButton("");
			radioButton_2.setBorder(new LineBorder(new Color(0, 0, 0)));
			radioButton_2.setHorizontalAlignment(SwingConstants.CENTER);
			radioButton_2.setBorderPainted(true);
			buttonGroup.add(radioButton_2);
			radioButton_2.setBackground(Color.WHITE);
			radioButton_2.setBounds(284, 134, 21, 23);
		}
		return radioButton_2;
	}
	public JRadioButton getRadioButton_3() {
		if (radioButton_3 == null) {
			radioButton_3 = new JRadioButton("");
			radioButton_3.setEnabled(false);
			radioButton_3.setHorizontalAlignment(SwingConstants.CENTER);
			radioButton_3.setBorder(new LineBorder(new Color(0, 0, 0)));
			radioButton_3.setBorderPainted(true);
			buttonGroup.add(radioButton_3);
			radioButton_3.setBackground(Color.WHITE);
			radioButton_3.setBounds(284, 179, 21, 23);
		}
		return radioButton_3;
	}
	public JTextField getTxtPrviGornjiOdgovor() {
		if (txtPrviGornjiOdgovor == null) {
			txtPrviGornjiOdgovor = new JTextField();
			//txtDrugiGornjiOdgovor.setOpaque(false);
			txtPrviGornjiOdgovor.setBackground(Color.WHITE);
			txtPrviGornjiOdgovor.setText("Prvi odgovor");
			txtPrviGornjiOdgovor.setColumns(10);
			txtPrviGornjiOdgovor.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
			txtPrviGornjiOdgovor.setBounds(37, 134, 116, 23);
		}
		return txtPrviGornjiOdgovor;
	}
	public JTextField getTxtDrugiGornjiOdgovor() {
		if (txtDrugiGornjiOdgovor == null) {
			txtDrugiGornjiOdgovor = new JTextField();
			txtDrugiGornjiOdgovor.setBackground(Color.WHITE);
			txtDrugiGornjiOdgovor.setText("Drugi odgovor");
			txtDrugiGornjiOdgovor.setColumns(10);
			txtDrugiGornjiOdgovor.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
			txtDrugiGornjiOdgovor.setBounds(37, 179, 116, 23);
		}
		return txtDrugiGornjiOdgovor;
	}
	public JTextField getTxtNeZnamGornjiOdgovor() {
		if (txtNeZnamGornjiOdgovor == null) {
			txtNeZnamGornjiOdgovor = new JTextField();
			txtNeZnamGornjiOdgovor.setBackground(Color.WHITE);
			txtNeZnamGornjiOdgovor.setEditable(false);
			txtNeZnamGornjiOdgovor.setText("Ne znam");
			txtNeZnamGornjiOdgovor.setColumns(10);
			txtNeZnamGornjiOdgovor.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
			txtNeZnamGornjiOdgovor.setBounds(311, 179, 116, 23);
		}
		return txtNeZnamGornjiOdgovor;
	}
	public JTextField getTxtTreciGornjiOdgovor() {
		if (txtTreciGornjiOdgovor == null) {
			txtTreciGornjiOdgovor = new JTextField();
			txtTreciGornjiOdgovor.setBackground(Color.WHITE);
			txtTreciGornjiOdgovor.setText("Treci odgovor");
			txtTreciGornjiOdgovor.setColumns(10);
			txtTreciGornjiOdgovor.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
			txtTreciGornjiOdgovor.setBounds(311, 134, 116, 24);
		}
		return txtTreciGornjiOdgovor;
	}
	public JRadioButton getRadioButton_4() {
		if (radioButton_4 == null) {
			radioButton_4 = new JRadioButton("");
			radioButton_4.setBorder(new LineBorder(new Color(0, 0, 0)));
			radioButton_4.setHorizontalAlignment(SwingConstants.CENTER);
			radioButton_4.setBorderPainted(true);
			buttonGroup_1.add(radioButton_4);
			radioButton_4.setBackground(Color.WHITE);
			radioButton_4.setBounds(10, 345, 21, 23);
		}
		return radioButton_4;
	}
	public JRadioButton getRadioButton_5() {
		if (radioButton_5 == null) {
			radioButton_5 = new JRadioButton("");
			radioButton_5.setHorizontalAlignment(SwingConstants.CENTER);
			radioButton_5.setBorder(new LineBorder(new Color(0, 0, 0)));
			radioButton_5.setBorderPainted(true);
			buttonGroup_1.add(radioButton_5);
			radioButton_5.setBackground(Color.WHITE);
			radioButton_5.setBounds(10, 390, 21, 23);
		}
		return radioButton_5;
	}
	public JRadioButton getRadioButton_6() {
		if (radioButton_6 == null) {
			radioButton_6 = new JRadioButton("");
			radioButton_6.setHorizontalAlignment(SwingConstants.CENTER);
			radioButton_6.setBorder(new LineBorder(new Color(0, 0, 0)));
			radioButton_6.setBorderPainted(true);
			buttonGroup_1.add(radioButton_6);
			radioButton_6.setBackground(Color.WHITE);
			radioButton_6.setBounds(284, 345, 21, 23);
		}
		return radioButton_6;
	}
	public JRadioButton getRadioButton_7() {
		if (radioButton_7 == null) {
			radioButton_7 = new JRadioButton("");
			radioButton_7.setEnabled(false);
			radioButton_7.setHorizontalAlignment(SwingConstants.CENTER);
			radioButton_7.setBorder(new LineBorder(new Color(0, 0, 0)));
			radioButton_7.setBorderPainted(true);
			buttonGroup_1.add(radioButton_7);
			radioButton_7.setBackground(Color.WHITE);
			radioButton_7.setBounds(284, 390, 21, 23);
		}
		return radioButton_7;
	}
	public JTextField getTxtPrviDonjiOdgovor() {
		if (txtPrviDonjiOdgovor == null) {
			txtPrviDonjiOdgovor = new JTextField();
			txtPrviDonjiOdgovor.setBackground(Color.WHITE);
			txtPrviDonjiOdgovor.setText("Prvi odgovor");
			txtPrviDonjiOdgovor.setColumns(10);
			txtPrviDonjiOdgovor.setBorder(new LineBorder(new Color(0, 0, 0)));
			txtPrviDonjiOdgovor.setBounds(37, 345, 116, 23);
		}
		return txtPrviDonjiOdgovor;
	}
	public JTextField getTxtDrugiDonjiOdgovor() {
		if (txtDrugiDonjiOdgovor == null) {
			txtDrugiDonjiOdgovor = new JTextField();
			txtDrugiDonjiOdgovor.setBackground(Color.WHITE);
			txtDrugiDonjiOdgovor.setText("Drugi odgovor");
			txtDrugiDonjiOdgovor.setColumns(10);
			txtDrugiDonjiOdgovor.setBorder(new LineBorder(new Color(0, 0, 0)));
			txtDrugiDonjiOdgovor.setBounds(37, 390, 116, 23);
		}
		return txtDrugiDonjiOdgovor;
	}
	public JTextField getTxtNeZnamDonjiOdgovor() {
		if (txtNeZnamDonjiOdgovor == null) {
			txtNeZnamDonjiOdgovor = new JTextField();
			txtNeZnamDonjiOdgovor.setBackground(Color.WHITE);
			txtNeZnamDonjiOdgovor.setText("Ne znam");
			txtNeZnamDonjiOdgovor.setEditable(false);
			txtNeZnamDonjiOdgovor.setColumns(10);
			txtNeZnamDonjiOdgovor.setBorder(new LineBorder(new Color(0, 0, 0)));
			txtNeZnamDonjiOdgovor.setBounds(311, 390, 116, 23);
		}
		return txtNeZnamDonjiOdgovor;
	}
	public JTextField getTxtTreciDonjiOdgovor() {
		if (txtTreciDonjiOdgovor == null) {
			txtTreciDonjiOdgovor = new JTextField();
			txtTreciDonjiOdgovor.setBackground(Color.WHITE);
			txtTreciDonjiOdgovor.setText("Treci odgovor");
			txtTreciDonjiOdgovor.setColumns(10);
			txtTreciDonjiOdgovor.setBorder(new LineBorder(new Color(0, 0, 0)));
			txtTreciDonjiOdgovor.setBounds(311, 345, 116, 24);
		}
		return txtTreciDonjiOdgovor;
	}
}
