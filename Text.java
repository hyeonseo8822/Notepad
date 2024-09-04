package codeus;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Text{

	public static void main(String[] args) {
		// 프레임
		JFrame frame = new JFrame();
		
		frame.setResizable(false);
		frame.setVisible(true); 
		frame.setPreferredSize(new Dimension(840, 850/12*9));
		frame.setSize(840,850/12*9);
		frame.setLocationRelativeTo(null); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(0, 0, 828, 42);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Notepad");
		lblNewLabel.setFont(new Font("Bodoni MT", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 133, 42);
		panel.add(lblNewLabel);
		
		JButton Emoticon = new JButton("Heart");
		Emoticon.setBackground(new Color(188, 209, 228));
		Emoticon.setFont(new Font("Bodoni MT", Font.PLAIN, 20));
		Emoticon.setBounds(508, 7, 139, 31);
		panel.add(Emoticon);
		
		JButton Exit = new JButton("Exit");
		Exit.setFont(new Font("Bodoni MT", Font.PLAIN, 20));
		Exit.setBackground(new Color(188, 209, 228));
		Exit.setBounds(679, 7, 113, 31);
		
		Exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // 시스템 종료
			}
			
		});
		panel.add(Exit);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("HY크리스탈M", Font.BOLD, 20));
		textArea.setBounds(0, 0, 828, 555);
		frame.getContentPane().add(textArea);
		Emoticon.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append("♥");
			}
			
		});
		
	}
}
