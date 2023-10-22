import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
		
		JButton RadioButton = new JButton("Area");
		RadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  
				int radio = Integer.parseInt(RadiotextField.getText());
                  double areaCirculo = Math.PI * radio * radio;
                  
             
                  JOptionPane.showMessageDialog(null, "Area del Circulo: " + areaCirculo + "cm2");
			}
		});
		RadioButton.setBounds(167, 142, 85, 21);
		contentPane.add(RadioButton);
		
		RadiotextField = new JTextField();
		RadiotextField.setBounds(167, 83, 96, 19);
		contentPane.add(RadiotextField);
		RadiotextField.setColumns(10);
		
		JLabel RadioLabel = new JLabel("Radio:");
		RadioLabel.setBounds(76, 86, 45, 13);
		contentPane.add(RadioLabel);
	}

}
