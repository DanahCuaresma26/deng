import java.awt.*;
import javax.swing.*;

public class myframe{
public static void main(String args[]){

	//create Elements
	JFrame frame = new JFrame("First Frame");

	JLabel label = new JLabel("Username");

	JLabel label1 = new JLabel("Password");

	JLabel label2 = new JLabel("Sign-up",SwingConstants.CENTER);

	JLabel label3 = new JLabel();

	JButton button = new JButton("Login");

	JTextField field = new JTextField("");

	JPasswordField field2 = new JPasswordField("");

	JTextField add1 = new JTextField("Forgot Password?");

	JPanel panel = new JPanel(new BorderLayout());


	//create label object
	frame.getContentPane().add(label,BorderLayout.CENTER);
	frame.getContentPane().add(button,BorderLayout.CENTER);
	frame.getContentPane().add(field,BorderLayout.CENTER);
	frame.getContentPane().add(field2,BorderLayout.CENTER);
	frame.getContentPane().add(add1);
	frame.getContentPane().add(label1,BorderLayout.CENTER);
	frame.getContentPane().add(label2,BorderLayout.CENTER);
	frame.getContentPane().add(label3,BorderLayout.CENTER);
	frame.getContentPane().add(panel,BorderLayout.CENTER);

	//set frame Options
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setSize(310,300);
	frame.setLayout(null);

	label.setLayout(null);
	label.setSize(100,100);
	label.setForeground(Color.BLACK);

	label1.setLayout(null);
	label1.setSize(200,200);
	label1.setForeground(Color.BLACK);

	label2.setLayout(null);
	label2.setSize(300,30);
	label2.setForeground(Color.BLACK);

	label3.setLayout(null);
	label3.setSize(300,40);
	label3.setForeground(Color.BLUE);

	field.setVisible(true);
	field.setSize(100,100);
	field.setBounds(70,35,180,30);

	field2.setVisible(true);
	field2.setSize(100,100);
	field2.setBounds(70,85,180,30);

	add1.setBounds(100,120,110,60);

	button.setBounds(220,220,150,100);
	button.setBackground(Color.WHITE);
	button.setForeground(Color.BLACK);

	panel.setBounds(0,0,500,500);
	panel.setBackground(Color.WHITE);
	}
}