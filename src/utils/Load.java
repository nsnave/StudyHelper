package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.ImageIcon;

public class Load {


	
	private static ImageIcon toIcon(String path) {
		
		return new ImageIcon(path);
		
	}
	
	
	
	public static ArrayList<Content> loadLanguage(String file) {

		ArrayList<String> lines = new ArrayList<>();
		
		try {
			
			Scanner scanner = new Scanner(new File(file));
			
			while (scanner.hasNextLine()) {
				
				lines.add(scanner.nextLine());
				
			}
			
			scanner.close();
			
		}
		catch (FileNotFoundException e) {
			
			System.out.println("File Not Found");
			e.printStackTrace();
			System.exit(2);
			
		}
		
		
		ArrayList<Content> ret = new ArrayList<>();
		
		for (String line : lines) {
			
			String[] temp = line.split("\\\\");
			
			//Handles icon conversion
			ImageIcon icon = null;
			if (!temp[1].equals("null"))
				icon = toIcon("icons/" + temp[1]);

			//Adds answers to ArrayList
			ArrayList<String> answers = new ArrayList<>();
			for (int i = 2; i < temp.length; i++) answers.add(temp[i]);
			
			ret.add(new Content(temp[0], icon, temp[1], answers));
			
		}
		
		
		return ret;
		
	}
	
	
	public static HashMap<String, String> loadSettings() {
		
		HashMap<String, String> ret = new HashMap<>();

		try {
			
			Scanner scanner = new Scanner(new File("settings.txt"));
			
			while (scanner.hasNextLine()) {
				
				String[] temp = scanner.nextLine().split(":");
				
				if (temp.length == 2)
					ret.put(temp[0], temp[1].trim());
				
			}
			
			scanner.close();
			
		}
		catch (FileNotFoundException e) {
			
			System.out.println("File Not Found");
			e.printStackTrace();
			System.exit(2);
			
		}
		
		return ret;
		
		
	}
	
	
	
}
