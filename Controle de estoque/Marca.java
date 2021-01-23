package Controle;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import formularios.Clientes;

import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class Marca extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Marca frame = new Marca();
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
	public Marca() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Marca.class.getResource("/icones/iconfinder___bonus_money_bag_revenew_3668864.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Total total = new Total();
				total.setVisible(true);
				
				
			}
		});
		btnNewButton.setToolTipText("total");
		btnNewButton.setBounds(39, 160, 90, 90);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Marca.class.getResource("/icones/iconfinder_Cart_605508.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vendas vendas = new Vendas();
				vendas.setVisible(true);
				
			}
		});
		btnNewButton_1.setToolTipText("Vendas");
		btnNewButton_1.setBounds(178, 160, 90, 90);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Marca.class.getResource("/icones/iconfinder_Label_605509.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produtos produtos = new Produtos();
				produtos.setVisible(true);
				
			}
		});
		btnNewButton_2.setToolTipText("Produtos");
		btnNewButton_2.setBounds(311, 160, 90, 90);
		contentPane.add(btnNewButton_2);
		
}
}
