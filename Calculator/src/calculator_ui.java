import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator_ui implements ActionListener {

	//Making object with type JFrame to be used for the frame
	JFrame frame = new JFrame("Calculator");
	//Making object with type JPanel to be used for the panel
	JPanel panel = new JPanel(new FlowLayout());

	//Fields
	Double number1, number2, result;
	int addc = 0, subc = 0, multic = 0, divc = 0, sqrtc = 0;

	//Making object with type JTextArea 
	JTextArea text = new JTextArea(1, 20);
	//Making objects with type JButton to be used for the actual buttons
	JButton but1 = new JButton("1");
	JButton but2 = new JButton("2");
	JButton but3 = new JButton("3");
	JButton but4 = new JButton("4");
	JButton but5 = new JButton("5");
	JButton but6 = new JButton("6");
	JButton but7 = new JButton("7");
	JButton but8 = new JButton("8");
	JButton but9 = new JButton("9");
	JButton but0 = new JButton("0");

	JButton butadd = new JButton("+");
	JButton butsub = new JButton("-");
	JButton butmulti = new JButton("*");
	JButton butdiv = new JButton("/");
	JButton buteq = new JButton("=");
	JButton butdot = new JButton(".");
	JButton butplusminus = new JButton("+/-");
	JButton butsqrt = new JButton("sqrt");

	JButton butclear = new JButton("C");
	
	//Defining method that creates the ui of the calculator
	public void ui() {
		frame.setVisible(true); // set the calculator visible
		frame.setSize(250, 200); // seting the sise of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // seting up the exit operand X
		frame.add(panel); // seting up the panel

		panel.add(text); // seting up the panel that displays the results

		panel.add(but1); // placing the buttons in the calculator
		panel.add(but2);
		panel.add(but3);
		panel.add(but4);
		panel.add(but5);
		panel.add(but6);
		panel.add(but7);
		panel.add(but8);
		panel.add(but9);
		panel.add(but0);

		panel.add(butadd);
		panel.add(butsub);
		panel.add(butmulti);
		panel.add(butdiv);
		panel.add(buteq);
		panel.add(butdot);
		panel.add(butplusminus);
		panel.add(butclear);
		panel.add(butsqrt);

		//implementing the ActionListener for each button
		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		but4.addActionListener(this);
		but5.addActionListener(this);
		but6.addActionListener(this);
		but7.addActionListener(this);
		but8.addActionListener(this);
		but9.addActionListener(this);
		but0.addActionListener(this);
		butadd.addActionListener(this);
		butsub.addActionListener(this);
		butmulti.addActionListener(this);
		butdiv.addActionListener(this);
		buteq.addActionListener(this);
		butclear.addActionListener(this);
		butdot.addActionListener(this);
		butplusminus.addActionListener(this);
		butsqrt.addActionListener(this);

	}
	//implementing the method from the interface ActionListener
	@Override
	public void actionPerformed(ActionEvent c) {
		//the object source will respond to the event performed
		Object source = c.getSource();

		if (source == butclear) {
			number1 = 0.0;
			number2 = 0.0;
			text.setText(""); // if pressed => delete
		}
		if (source == butplusminus) {
			text.append("-"); // if pressed => -
		}
		if (source == butdot) {
			text.append("."); // if pressed => .
		}
		if (source == but1) {
			text.append("1"); // if pressed => 1
		}
		if (source == but2) {
			text.append("2"); // if pressed => 2
		}
		if (source == but3) {
			text.append("3"); // if pressed => 3
		}
		if (source == but4) {
			text.append("4"); // if pressed => 4
		}
		if (source == but5) {
			text.append("5"); // if pressed => 5
		}
		if (source == but6) {
			text.append("6"); // if pressed => 6
		}
		if (source == but7) {
			text.append("7"); // if pressed => 7
		}
		if (source == but8) {
			text.append("8"); // if pressed => 8
		}
		if (source == but9) {
			text.append("9"); // if pressed => 9
		}
		if (source == but0) {
			text.append("0"); // if pressed => 0
		}
		if (source == butsqrt) {
			number1 = number_reader();
			number2 = 0.0;
			text.setText("sqrt");
			addc = 0;
			subc = 0;
			multic = 0;
			divc = 0;
			sqrtc = 1; // if pressed => sqrt is performed
		}
		if (source == butadd) {
			number1 = number_reader();
			text.setText("");
			addc = 1; // if pressed => add is performed
			subc = 0;
			multic = 0;
			divc = 0;
			sqrtc = 0;
		}
		if (source == butsub) {
			number1 = number_reader();
			text.setText("");
			addc = 0;
			subc = 1; // if pressed => sub is performed
			multic = 0;
			divc = 0;
			sqrtc = 0;
		}
		if (source == butmulti) {
			number1 = number_reader();
			text.setText("");
			addc = 0;
			subc = 0;
			multic = 1; // if pressed => multi is performed
			divc = 0;
			sqrtc = 0;
		}
		if (source == butdiv) {
			number1 = number_reader();
			text.setText("");
			addc = 0;
			subc = 0;
			multic = 0;
			divc = 1; // if pressed => div is performed
			sqrtc = 0;
		}
		
		//if equal button is pressed:
		if (source == buteq) {
			if (sqrtc > 0) {
				result = Math.sqrt(number1);
				text.setText(Double.toString(result));
			}
			number2 = number_reader();
			if (addc > 0) {
				result = number1 + number2;
				text.setText(Double.toString(result));
			}
			if (subc > 0) {
				result = number1 - number2;
				text.setText(Double.toString(result));
			}
			if (multic > 0) {
				result = number1 * number2;
				text.setText(Double.toString(result));
			}
			if (divc > 0) {
				result = number1 / number2;
				text.setText(Double.toString(result));
			}

		}
	}
	//Defining method that will return the value of num1 after the text object is stored in the string
	public double number_reader() {
		Double num1;
		String s;

		s = text.getText();
		num1 = Double.valueOf(s);

		return num1;
	}

}
