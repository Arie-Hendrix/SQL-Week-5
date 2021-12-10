package main;

import java.util.stream.Collectors;

public class ConsoleStream {

	public static void main(String[] args) {
		new ConsoleStream().run();
		
	}

	private void run() {
		String consoles = Console.getConsoles().stream().map((console) -> console.toString()).sorted().collect(Collectors.joining(", "));
		System.out.println(consoles);
	}

}
