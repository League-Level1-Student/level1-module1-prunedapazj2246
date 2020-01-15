package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String flav =JOptionPane.showInputDialog("What type of popcorn flavor do you want?");
Microwave microwave = new Microwave();
Popcorn popcorn = new Popcorn(flav);
microwave.putInMicrowave(popcorn);
String min =JOptionPane.showInputDialog("For how many minutes would you like the popcorn to be cooked?");
int mins = Integer.parseInt(min);
microwave.setTime(mins);
microwave.startMicrowave();
	}

}
