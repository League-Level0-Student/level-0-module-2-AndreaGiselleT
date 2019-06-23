import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	String Height=JOptionPane.showInputDialog("How high are you in inches?");
int Roller= Integer.parseInt(Height);
if (Roller>48) {
	JOptionPane.showMessageDialog(null, "You can go on the Roller Coaster.");
}
else { JOptionPane.showMessageDialog(null, "You have to grow a little more.");
	
}
}
}
