package main;

import java.util.ArrayList;
import java.util.List;

public class Console {

	private String name;
	
	public Console(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	private static List<Console> consoles = (List.of(
			new Console("Sony Playstation 5"),
			new Console("Microsoft Xbox One"),
			new Console("Nintendo Switch"),
			new Console("Sony Playstation 4"),
			new Console("Microsoft Xbox 360"),
			new Console("Nintendo Wii"),
			new Console("Microsoft Xbox"),
			new Console("Sony Playstation 3")
			));
	
	public static int compare(Console c1, Console c2) {
		return c1.name.compareTo(c2.name);
	}

	public static List<Console> getConsoles() {
		return new ArrayList<>(consoles);
	}
}
