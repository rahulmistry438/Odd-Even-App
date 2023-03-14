import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class App extends JFrame
{
	Container c;
	JLabel labNumber, labAnswer;
	JTextField txtNumber;
	JButton btnFind;

	App()
	{
		c = getContentPane();
		c.setLayout(null);
		
		labNumber = new JLabel("Enter integer");
		txtNumber = new JTextField(10);
		btnFind = new JButton("Find Even/Odd");
		labAnswer = new JLabel("");

		Font f = new Font("Arial", Font.BOLD, 30);
		labNumber.setFont(f);
		txtNumber.setFont(f);
		btnFind.setFont(f);
		labAnswer.setFont(f);
	
		labNumber.setBounds(100, 50, 300, 50);
		txtNumber.setBounds(50, 110, 300, 50);
		btnFind.setBounds(50, 170, 300, 50);
		labAnswer.setBounds(50, 220, 500, 50);

		c.add(labNumber);
		c.add(txtNumber);
		c.add(btnFind);
		c.add(labAnswer);

		ActionListener a = (ae) -> {
			try{
				String s = txtNumber.getText();
				int num = Integer.parseInt(s);
				String res = num % 2 == 0 ? "even" : "odd";
				String msg = "num " + num + " is " + res;
				labAnswer.setText(msg);
			}catch(NumberFormatException e){
				labAnswer.setText("You should enter integers only");
			}
		};
		btnFind.addActionListener(a);
	}
}

class P4
{
	public static void main(String args[])
	{
		App a = new App();
		a.setSize(500, 500);
		a.setLocationRelativeTo(null);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setTitle("App by J020_Rahul Mistry_PVPPCOE");
		a.setVisible(true);
	}
}