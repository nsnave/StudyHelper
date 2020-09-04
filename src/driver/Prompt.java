package driver;

import utils.Content;
import static utils.Displays.textboxDisplay;

import java.util.ArrayList;
import java.util.Collections;


public class Prompt implements Runnable {

	ArrayList<Content> data;
	int iterations = 0;
	

	public Prompt(ArrayList<Content> data) {
		
		this.data = data;
		iterations = 1;
		
	}

	public Prompt(ArrayList<Content> data, int iterations) {
		
		this.data = data;
		this.iterations = iterations;
		
	}
	
	
	@Override
	public void run() {
		
		for (int i = 0; i < iterations; i++) {

			Collections.shuffle(data);
			
			Content item = data.get(0);
			
			textboxDisplay(item);
			
		}
		
	}

}
