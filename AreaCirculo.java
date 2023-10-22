import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AreaCirculo extends JFrame {

	private JPanel contentPane;
	private JTextField RadiotextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaCirculo frame = new AreaCirculo();
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
	public AreaCirculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel RadioNewLabel = new JLabel("Radio");
		RadioNewLabel.setBounds(107, 82, 85, 13);
		contentPane.add(RadioNewLabel);
		
		RadiotextField = new JTextField();
		RadiotextField.setBounds(161, 79, 96, 19);
		contentPane.add(RadiotextField);
		RadiotextField.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  
	                    int radio = Integer.parseInt(RadiotextField.getText());
	                    double areaCirculo = Math.PI * radio * radio;
	                    
	               
	                	JOptionPane.showMessageDialog(null, "Area del Circulo: " + areaCirculo + "cm2");
	                }
				
			
		});
		btnNewButton.setBounds(172, 120, 85, 21);
		contentPane.add(btnNewButton);
	}
	

}
