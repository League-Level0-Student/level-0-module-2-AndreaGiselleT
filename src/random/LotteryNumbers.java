
package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

public static void main(String[] args) {
	int random4 =new Random().nextInt(4);
	int random5 =new Random().nextInt(5);
	int random6 =new Random().nextInt(6);
	int random8 =new Random().nextInt(8);
	int random9=new Random().nextInt(9);
	JOptionPane.showMessageDialog(null,  random4+" random5+" random6+" random8+" random9+");
}
}
