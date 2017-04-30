package pubkviz.gui;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import javax.swing.JTextArea;


public class Glavni_Meni extends JFrame {

	private JPanel contentPane;
	private JLabel lblPubKviz;
	private JPanel panel;
	private JPanel panel_1;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JPanel panel_2;
	private JTextArea txtrOnoMaloto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Glavni_Meni frame = new Glavni_Meni();
					frame.setVisible(true);
					frame.setSize(500,300);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public Glavni_Meni() {
		setResizable(false);
		setBackground(Color.WHITE);
		setTitle("Pub Kviz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 271);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.NORTH);
		contentPane.add(getPanel_1(), BorderLayout.WEST);
		contentPane.add(getPanel_2(), BorderLayout.CENTER);
	}
	public JLabel getLblPubKviz() {
		if (lblPubKviz == null) {
			lblPubKviz = new JLabel("Pub Kviz");
			lblPubKviz.setFont(new Font("Book Antiqua", Font.PLAIN, 37));
		}
		return lblPubKviz;
	}
	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(Color.WHITE);
			panel.add(getLblPubKviz());
		}
		return panel;
	}
	public JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBackground(Color.WHITE);
			panel_1.setPreferredSize(new Dimension(150, 10));
			panel_1.setLayout(null);
			panel_1.add(getButton());
			panel_1.add(getButton_1_1());
			panel_1.add(getButton_2_1());
			panel_1.add(getButton_3_1());
		}
		return panel_1;
	}
	public JButton getButton() {
		if (button == null) {
			button = new JButton("Pokreni Kviz");
			button.setBounds(10, 23, 121, 23);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					button.setBackground(new Color(240, 248, 255));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					button.setBackground(Color.WHITE);
				}
			});
			button.setFont(new Font("Verdana", Font.BOLD, 11));
			button.setFocusPainted(false);
			button.setBorderPainted(false);
			button.setBackground(Color.WHITE);
		}
		return button;
	}
	public JButton getButton_1_1() {
		if (button_1 == null) {
			button_1 = new JButton("Dodaj grupu");
			button_1.setBounds(10, 57, 121, 23);
			button_1.setFont(new Font("Verdana", Font.BOLD, 11));
			button_1.setFocusPainted(false);
			button_1.setBorderPainted(false);
			button_1.setBackground(Color.WHITE);
			button_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					button_1.setBackground(new Color(240, 248, 255));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					button_1.setBackground(Color.WHITE);
				}
			});
			
		}
		
		return button_1;
	}
	public JButton getButton_2_1() {
		if (button_2 == null) {
			button_2 = new JButton("Napravi kviz");
			button_2.setBounds(10, 91, 121, 23);
			button_2.setFont(new Font("Verdana", Font.BOLD, 11));
			button_2.setFocusPainted(false);
			button_2.setBorderPainted(false);
			button_2.setBackground(Color.WHITE);
			button_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					button_2.setBackground(new Color(240, 248, 255));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					button_2.setBackground(Color.WHITE);
				}
			});
		}
		return button_2;
	}
	public JButton getButton_3_1() {
		if (button_3 == null) {
			button_3 = new JButton("Kraj rada");
			button_3.setBounds(10, 125, 121, 23);
			button_3.setFont(new Font("Verdana", Font.BOLD, 11));
			button_3.setFocusPainted(false);
			button_3.setBorderPainted(false);
			button_3.setBackground(Color.WHITE);
			button_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					button_3.setBackground(new Color(240, 128, 125));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					button_3.setBackground(Color.WHITE);
				}
			});
		}
		return button_3;
	}
	public JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBackground(Color.WHITE);
			panel_2.setLayout(null);
			panel_2.add(getTxtrOnoMaloto());
		}
		return panel_2;
	}
	public JTextArea getTxtrOnoMaloto() {
		if (txtrOnoMaloto == null) {
			txtrOnoMaloto = new JTextArea();
			txtrOnoMaloto.setFont(new Font("Calibri", Font.PLAIN, 12));
			txtrOnoMaloto.setEditable(false);
			txtrOnoMaloto.setBounds(10, 73, 264, 36);
			txtrOnoMaloto.setText("Ono malo \u0161to znam zahvaljujem svom neznanju.\r\nJohan Volfgang fon Gete");
		}
		return txtrOnoMaloto;
	}
}
