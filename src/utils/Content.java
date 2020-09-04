package utils;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Content {
	
	private final String msg;
	private final ImageIcon icon;
	private final String icon_name;
	private final ArrayList<String> answers;
	
	
	
	public Content(String msg, ImageIcon icon, String icon_name, ArrayList<String> answers) {
		
		this.msg = msg;
		this.icon = icon;
		this.icon_name = icon_name;
		this.answers = answers;
		
	}

	
	
	public String getMsg() {
		
		return msg;
		
	}

	
	public ImageIcon getIcon() {
		
		return icon;
		
	}

	public String getIconName() {
		
		return icon_name;
		
	}
	

	public ArrayList<String> getAnswers() {
		
		return answers;
		
	}
	
	public boolean checkAnswer(String string) {
		
		return answers.contains(string);
		
	}

}
