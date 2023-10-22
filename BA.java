

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class BA extends JFrame {

	private JPanel contentPane;
	private JTextField ba;
	private JTextField al;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BA frame = new BA();
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
	public BA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ba = new JTextField();
		ba.setBounds(88, 31, 86, 20);
		contentPane.add(ba);
		ba.setColumns(10);
		
		al = new JTextField();
		al.setBounds(88, 72, 86, 20);
		contentPane.add(al);
		al.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("BASE");
		lblNewLabel.setBounds(10, 34, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ALTURA");
		lblNewLabel_1.setBounds(10, 75, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton AreaCR = new JButton("Area cuadrado y rectangulo");
		AreaCR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		int BA= Integer.parseInt((ba.getText()));
		int AL=Integer.parseInt((al.getText()));
		int R=BA*AL;
		int RE=AL*AL;
		JOptionPane.showMessageDialog(AreaCR,"El Area del cuadrado es " + RE +" EL Area del rectangulo es " + R);
			}	});
	
		AreaCR.setBounds(88, 135, 182, 23);
		contentPane.add(AreaCR);
			
		
		
	
		JButton PE = new JButton("perimetro ");
		PE.setBounds(88, 170, 89, 23);
		contentPane.add(PE);
		
		JButton AREA = new JButton("Area circulo");
		AREA.setBounds(88, 211, 89, 23);
		contentPane.add(AREA);
		
	}
}
	
