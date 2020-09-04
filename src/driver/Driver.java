package driver;

import static utils.Load.*;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import utils.Content;

public class Driver {

	public static void main(String[] args) {
		
		ArrayList<Content> data = new ArrayList<>();
		
		//Loads questions
		File dir = new File("content");
		for (String file : dir.list()) {
			
			data.addAll(loadLanguage("content/" + file));
			
		}
		
		
		HashMap<String, TimeUnit> unit_map = new HashMap<>();
		unit_map.put("seconds", TimeUnit.SECONDS);
		unit_map.put("second", TimeUnit.SECONDS);
		unit_map.put("minutes", TimeUnit.MINUTES);
		unit_map.put("minute", TimeUnit.MINUTES);
		unit_map.put("hours", TimeUnit.HOURS);
		unit_map.put("hour", TimeUnit.HOURS);
		
		
		HashMap<String, String> settings = loadSettings();

		Runnable task = new Prompt(data, 
				(settings.containsKey("size")) ? Integer.parseInt(settings.get("size")) : 1);
		
		ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
		executor.scheduleAtFixedRate(task, 0, 
				(settings.containsKey("latency")) ? Long.parseLong(settings.get("latency")) : 1,
				(settings.containsKey("unit")) ? unit_map.get(settings.get("unit").toLowerCase()) : TimeUnit.HOURS);

	}

}
