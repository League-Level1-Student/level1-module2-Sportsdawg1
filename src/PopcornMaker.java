import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cornFlavor = JOptionPane.showInputDialog("what flavor");
		Popcorn bag = new Popcorn(cornFlavor);
		Microwave wave = new Microwave();
		wave.putInMicrowave(bag);
		int minutes = Integer.parseInt(JOptionPane.showInputDialog("how many minutes"));
		wave.setTime(minutes);
		wave.startMicrowave();
	}

}
