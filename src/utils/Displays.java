package utils;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Displays {

	public static void textboxDisplay(Content content) {

		System.out.println("Icon: " + content.getIconName());
		System.out.println("Msg:  " + content.getMsg());
		
		boolean correct = false;
		int tries = 0;
		
		final JFrame frame = new JFrame();

		while (!correct) {
			
			//Object[] possibilities = {"ham", "spam", "yam"};
			String s = (String) JOptionPane.showInputDialog(
			                    frame,
			                    ((tries > 0) ? "Try Again...\n" : "") + content.getMsg(),
			                    "Study Helper",
			                    JOptionPane.PLAIN_MESSAGE,
			                    content.getIcon(),
			                    null,
			                    null);
	
			//If a string was returned, say so.
			
			if (s.equals("--stop")) {
				
				System.out.println("Exiting...");
				System.exit(0);
				
			}
			
			if (s != null && content.checkAnswer(s)) {
				
				System.out.println("Correct!");
				System.out.println();
				
				return;
				
			}
	
			
			//If you're here, the return value was null/empty.
			System.out.println("Come on, answer the question!");
			System.out.println();
			
			tries++;
			
		}
		
	}
	
}
