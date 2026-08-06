package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		//uso da biblioteca flatlaf
		FlatLightLaf.setup();
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/img/pdv.png")));
		setResizable(false);
		setTitle("MUSIC-PDV");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.setBounds(new Rectangle(15, 15, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(3, 36, 75));
		panel.setBounds(0, 0, 172, 522);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 32, 64, 64);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/img/shopping-basket_64x64.png")));
		
		JLabel lblNewLabel_1 = new JLabel("MUSIC-PDV");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(78, 42, 80, 34);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_2 = new JLabel("Sistema de PDV");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(78, 72, 92, 14);
		panel.add(lblNewLabel_2);
		
		JButton btnFornecedores = new JButton("Fornecedores");
		btnFornecedores.putClientProperty("JButton.arc", 300);
		btnFornecedores.setBackground(new Color(27, 52, 87));
		btnFornecedores.setForeground(new Color(255, 255, 255));
		btnFornecedores.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFornecedores.setBorder(null);
		btnFornecedores.setIconTextGap(14);
		btnFornecedores.setIcon(new ImageIcon(Main.class.getResource("/img/fornecedores_32x32.png")));
		btnFornecedores.setBounds(10, 117, 148, 49);
		panel.add(btnFornecedores);
		
		JButton btnFornecedores_1 = new JButton("Fornecedores");
		btnFornecedores_1.setIconTextGap(14);
		btnFornecedores_1.setIcon(new ImageIcon(Main.class.getResource("/img/fornecedores_32x32.png")));
		btnFornecedores_1.setForeground(Color.WHITE);
		btnFornecedores_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFornecedores_1.setBorder(null);
		btnFornecedores_1.setBackground(new Color(27, 52, 87));
		btnFornecedores_1.setBounds(10, 177, 148, 49);
		panel.add(btnFornecedores_1);
		
		JButton btnFornecedores_1_1 = new JButton("Fornecedores");
		btnFornecedores_1_1.setIconTextGap(14);
		btnFornecedores_1_1.setIcon(new ImageIcon(Main.class.getResource("/img/fornecedores_32x32.png")));
		btnFornecedores_1_1.setForeground(Color.WHITE);
		btnFornecedores_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFornecedores_1_1.setBorder(null);
		btnFornecedores_1_1.setBackground(new Color(27, 52, 87));
		btnFornecedores_1_1.setBounds(10, 237, 148, 49);
		panel.add(btnFornecedores_1_1);
		
		JButton btnFornecedores_1_1_1 = new JButton("Fornecedores");
		btnFornecedores_1_1_1.setIconTextGap(14);
		btnFornecedores_1_1_1.setIcon(new ImageIcon(Main.class.getResource("/img/fornecedores_32x32.png")));
		btnFornecedores_1_1_1.setForeground(Color.WHITE);
		btnFornecedores_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFornecedores_1_1_1.setBorder(null);
		btnFornecedores_1_1_1.setBackground(new Color(27, 52, 87));
		btnFornecedores_1_1_1.setBounds(10, 297, 148, 49);
		panel.add(btnFornecedores_1_1_1);
		
		JButton btnFornecedores_1_1_1_1 = new JButton("Fornecedores");
		btnFornecedores_1_1_1_1.setIconTextGap(14);
		btnFornecedores_1_1_1_1.setIcon(new ImageIcon(Main.class.getResource("/img/fornecedores_32x32.png")));
		btnFornecedores_1_1_1_1.setForeground(Color.WHITE);
		btnFornecedores_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFornecedores_1_1_1_1.setBorder(null);
		btnFornecedores_1_1_1_1.setBackground(new Color(27, 52, 87));
		btnFornecedores_1_1_1_1.setBounds(10, 357, 148, 49);
		panel.add(btnFornecedores_1_1_1_1);
		
		JButton btnFornecedores_1_1_1_1_1 = new JButton("Fornecedores");
		btnFornecedores_1_1_1_1_1.setIconTextGap(14);
		btnFornecedores_1_1_1_1_1.setIcon(new ImageIcon(Main.class.getResource("/img/fornecedores_32x32.png")));
		btnFornecedores_1_1_1_1_1.setForeground(Color.WHITE);
		btnFornecedores_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFornecedores_1_1_1_1_1.setBorder(null);
		btnFornecedores_1_1_1_1_1.setBackground(new Color(27, 52, 87));
		btnFornecedores_1_1_1_1_1.setBounds(10, 444, 148, 49);
		panel.add(btnFornecedores_1_1_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.controlHighlight);
		panel_1.setBounds(0, 521, 784, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		//inciar centralizado
		setLocationRelativeTo(null);
		
		//iniciar tela cheia
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		

	}
}
