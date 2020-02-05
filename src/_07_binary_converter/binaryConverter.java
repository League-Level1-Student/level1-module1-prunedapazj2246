package _07_binary_converter;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binaryConverter implements ActionListener {
	JFrame f = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
JButton button = new JButton();
JTextField text = new JTextField(20);
JLabel l = new JLabel();
public static void main(String[] args) {
	binaryConverter bC = new binaryConverter();
	bC.runner();

}
public void runner() {
button.addActionListener(this);
label.setText("convert");
button.add(label);
panel.add(button);
panel.add(text);
panel.add(l);
f.add(panel);
f.show();
f.pack();

}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	String words = convert(text.getText());
	l.setText(words);
	f.pack();
}
String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}
}


