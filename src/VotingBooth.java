import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String Height=JOptionPane.showInputDialog("How old are you in years?");
	int Roller= Integer.parseInt(Height);
	if (Roller>18) {
		JOptionPane.showInputDialog("who should the next president be?");
	}
	else { JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
}
}
}